/*
 * ���ļ��ǹ���Decaf����������Ҫ��JFlex����ű���
 * �ڵ�һ�׶Σ�����Ҫ�������ű������ݣ���ο�"JFlex Manual"�й�����α�дJFlex�ű���˵����
 *
 * ע�⣺��UNIXϵͳ������Ҫ��֤����ļ�ʹ��UNIX�ı���ʽ����ʹ��dos2unix��������ı���ʽת����
 */

package decaf.frontend;

import decaf.Location;
import decaf.error.*;
import decaf.utils.MiscUtils;
 
%%
%public
%class Lexer
%extends BaseLexer
%byaccj
%line
%column
%switch
%unicode
	
%{
	private Location sloc = null;
	private StringBuilder buffer = new StringBuilder();

	public Location getLocation() {
		return new decaf.Location(yyline + 1, yycolumn + 1);
	}
%}

NEWLINE				= (\r|\n|\r\n)
DIGIT 				= ([0-9])
HEX_DIGIT 			= ([0-9A-Fa-f])
HEX_INTEGER			= (0[Xx]{HEX_DIGIT}+)
DEC_INTEGER			= ({DIGIT}+)
INTEGER				= ({HEX_INTEGER}|{DEC_INTEGER})
IDENTIFIER			= ([A-Za-z][_0-9A-Za-z]*)
SIMPLE_OPERATOR		= ("+"|"-"|"*"|"/"|"%"|"="|"<"|">"|"."|","|";"|"!"|"("|")"|"["|"]"|"{"|"}"|":")
S_COMMENT			= ("//"[^\r\n]*{NEWLINE})
WHITESPACE			= ([ \t]+)

	// ��ʼ����S��ʾ�ַ���
%x S

%%
	// ʶ��ע�ͺͿհ��ַ��Ĺ���
{WHITESPACE}		{ /* Just ignore */    }
{NEWLINE}			{ /* Just ignore */    }
{S_COMMENT}			{ /* Just ignore */    }


	// ʶ��ؼ��ֵĹ��� 
"void"				{ return keyword(Parser.VOID);			}
"int"				{ return keyword(Parser.INT);			}
"bool"				{ return keyword(Parser.BOOL);			}
"string"			{ return keyword(Parser.STRING);		}
"new"				{ return keyword(Parser.NEW);			}
"null"				{ return keyword(Parser.NULL);			}
"class"				{ return keyword(Parser.CLASS);			}
"extends"			{ return keyword(Parser.EXTENDS);		}
"this"				{ return keyword(Parser.THIS);			}
"while"				{ return keyword(Parser.WHILE);			}
"for"				{ return keyword(Parser.FOR);			}
"if"				{ return keyword(Parser.IF);			}
"else"				{ return keyword(Parser.ELSE);			}
"return"			{ return keyword(Parser.RETURN);		}
"break"				{ return keyword(Parser.BREAK);			}
"Print"				{ return keyword(Parser.PRINT);			}
"ReadInteger"		{ return keyword(Parser.READ_INTEGER);	}
"ReadLine"			{ return keyword(Parser.READ_LINE);		}
"static"			{ return keyword(Parser.STATIC);		}
"instanceof"		{ return keyword(Parser.INSTANCEOF);	}
"scopy"				{ return keyword(Parser.SCOPY);			}
"sealed"            { return keyword(Parser.SEALED);        }
"var"				{ return keyword(Parser.VAR);			}
"foreach"			{ return keyword(Parser.FOREACH);		}
"in"				{ return keyword(Parser.IN);			}
"default"			{ return keyword(Parser.DEFAULT);		}
"scopy"				{ return keyword(Parser.SCOPY);			}
"sealed"			{ return keyword(Parser.SEALED);		}

	// ʶ��������Ĺ���
"<="				{ return operator(Parser.LESS_EQUAL);	}
">="				{ return operator(Parser.GREATER_EQUAL);}
"=="				{ return operator(Parser.EQUAL);		}
"!="				{ return operator(Parser.NOT_EQUAL);	}
"&&"				{ return operator(Parser.AND);			}
"||"				{ return operator(Parser.OR);			}
"|||" 				{ return operator(Parser.GUARD);		}
"++"				{ return operator(Parser.ARRAY_CONCAT); }
"%%"				{ return operator(Parser.ARRAY_REPEAT); }
"[|"				{ return operator(Parser.LEFTSQUARE); 	}
"|]"				{ return operator(Parser.RIGHTSQUARE);	}
{SIMPLE_OPERATOR}	{ return operator((int)yycharat(0));	}

	// ʶ�����Ĺ���
"true"				{ return boolConst(true);										}
"false"				{ return boolConst(false);										}
{INTEGER}			{ return intConst(yytext());			}
<YYINITIAL>\"		{ sloc = getLocation();		  
					  yybegin(S);
					  buffer = new StringBuilder();								    }
<S>{NEWLINE}		{ issueError(new NewlineInStrError(sloc, MiscUtils.quote(buffer.toString())));}
<S><<EOF>>			{ issueError(new UntermStrError(sloc, MiscUtils.quote(buffer.toString())));
					  yybegin(YYINITIAL);											}
<S>\"				{ yybegin(YYINITIAL);
					  return StringConst(buffer.toString(), sloc);						}
<S>"\\n"			{ buffer.append('\n');											}
<S>"\\t"			{ buffer.append('\t'); 											}
<S>"\\\""			{ buffer.append('"');											}
<S>"\\\\"			{ buffer.append('\\'); 											}
<S>.				{ buffer.append(yytext()); 										}

	// ʶ���ʶ���Ĺ���
{IDENTIFIER}		{ return identifier(yytext());			}
	
	// ���������ʶ����ַ���ô����
.					{ issueError(new UnrecogCharError(getLocation(), yycharat(0))); 		}