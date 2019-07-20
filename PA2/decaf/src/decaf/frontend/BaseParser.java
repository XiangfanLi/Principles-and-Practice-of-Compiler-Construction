package decaf.frontend;

import decaf.Driver;
import decaf.tree.Tree;
import decaf.error.DecafError;
import decaf.error.MsgError;

public abstract class BaseParser {
	private Lexer lexer;

	protected Tree.TopLevel tree;

	public void setLexer(Lexer lexer) {
		this.lexer = lexer;
	}

	public Tree.TopLevel getTree() {
		return tree;
	}

	protected void issueError(DecafError error) {
		Driver.getDriver().issueError(error);
	}

	void yyerror(String msg) {
		Driver.getDriver().issueError(
				new MsgError(lexer.getLocation(), msg));
	}

	int yylex() {
		int token = -1;
		try {
			token = lexer.yylex();
		} catch (Exception e) {
			yyerror("lexer error: " + e.getMessage());
		}

		return token;
	}

	abstract int yyparse();

	public Tree.TopLevel parseFile() {
		yyparse();
		return tree;
	}

	/**
	 * 鑾峰緱鎿嶄綔绗︾殑瀛楃涓茶〃绀�
	 * 
	 * @param opCode
	 *            鎿嶄綔绗︾殑绗﹀彿鐮�
	 * @return 璇ユ搷浣滅鐨勫瓧绗︿覆褰㈠紡
	 */
	public static String opStr(int opCode) {
		switch (opCode) {
		case Tree.ARRAYCONCAT:
			return "++";
		case Tree.ARRAYREPEAT:
			return "%%";
		case Tree.AND:
			return "&&";
		case Tree.EQ:
			return "==";
		case Tree.GE:
			return ">=";
		case Tree.LE:
			return "<=";
		case Tree.NE:
			return "!=";
		case Tree.OR:
			return "||";
		case Tree.PLUS:
			return "+";
		case Tree.MINUS:
		case Tree.NEG:
			return "-";
		case Tree.MUL:
			return "*";
		case Tree.DIV:
			return "/";
		case Tree.MOD:
			return "%";
		case Tree.GT:
			return ">";
		case Tree.LT:
			return "<";
		default:
			return "unknow";
		}
	}
}
