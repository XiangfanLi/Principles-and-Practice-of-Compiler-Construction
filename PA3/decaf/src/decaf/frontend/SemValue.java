package decaf.frontend;

import java.util.List;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.ArrayConst;
import decaf.tree.Tree.BoundVariable;
import decaf.tree.Tree.ClassDef;
import decaf.tree.Tree.Expr;
import decaf.tree.Tree.ForeachStmt;
import decaf.tree.Tree.GuardStmt;
import decaf.tree.Tree.IfSubStmt;
import decaf.tree.Tree.MethodDef;
import decaf.tree.Tree.LValue;
import decaf.tree.Tree.TopLevel;
import decaf.tree.Tree.VarDef;
import decaf.tree.Tree.TypeLiteral;
import decaf.utils.MiscUtils;

public class SemValue {

	public int code;

	public Location loc;

	public int typeTag;
	
	public Object literal;
	
	public String ident;
	
	public ForeachStmt foreachStmt;
	
	public BoundVariable boundVariable;

	public List<ClassDef> clist;

	/**
	 * field list
	 */
	public List<Tree> flist;

	public List<VarDef> vlist;
	
	public List<Expr> clist1;
	
	public List<IfSubStmt> ilist;


	/**
	 * statement list
	 */
	public List<Tree> slist;

	public List<Expr> elist;

	public TopLevel prog;
	
	public GuardStmt guardStmt;
	
	public IfSubStmt ifSubStmt;

	public ClassDef cdef;

	public VarDef vdef;

	public MethodDef fdef;

	public TypeLiteral type;

	public Tree stmt;

	public Expr expr;

	public LValue lvalue;
	
	
	public ArrayConst arrayconst;

	public static SemValue createKeyword(int code) {
		SemValue v = new SemValue();
		v.code = code;
		return v;
	}

	
	public static SemValue createOperator(int code) {
		SemValue v = new SemValue();
		v.code = code;
		return v;
	}

	public static SemValue createLiteral(int tag, Object value) {
		SemValue v = new SemValue();
		v.code = Parser.LITERAL;
		v.typeTag = tag;
		v.literal = value;
		return v;
	}

	
	public static SemValue createIdentifier(String name) {
		SemValue v = new SemValue();
		v.code = Parser.IDENTIFIER;
		v.ident = name;
		return v;
	}

	
	public String toString() {
		String msg;
		switch (code) {
		case Parser.BOOL:
			msg = "keyword  : bool";
			break;
		case Parser.BREAK:
			msg = "keyword  : break";
			break;
		case Parser.CLASS:
			msg = "keyword  : class";
			break;
		case Parser.ELSE:
			msg = "keyword  : else";
			break;
		case Parser.EXTENDS:
			msg = "keyword  : extends";
			break;
		case Parser.FOR:
			msg = "keyword  : for";
			break;
		case Parser.IF:
			msg = "keyword  : if";
			break;
		case Parser.INT:
			msg = "keyword  : int";
			break;
		case Parser.INSTANCEOF:
			msg = "keyword  : instanceof";
			break;
		case Parser.NEW:
			msg = "keyword  : new";
			break;
		case Parser.NULL:
			msg = "keyword  : null";
			break;
		case Parser.PRINT:
			msg = "keyword  : Print";
			break;
		case Parser.READ_INTEGER:
			msg = "keyword  : ReadInteger";
			break;
		case Parser.READ_LINE:
			msg = "keyword  : ReadLine";
			break;
		case Parser.RETURN:
			msg = "keyword  : return";
			break;
		case Parser.STRING:
			msg = "keyword  : string";
			break;
		case Parser.THIS:
			msg = "keyword  : this";
			break;
		case Parser.VOID:
			msg = "keyword  : void";
			break;
		case Parser.WHILE:
			msg = "keyword  : while";
			break;
		case Parser.STATIC:
			msg = "keyword : static";
			break;


		case Parser.LITERAL:
			switch (typeTag) {
			case Tree.INT:
			case Tree.BOOL:
				msg = "constant : " + literal;
				break;
			default:
				msg = "constant : " + MiscUtils.quote((String)literal);
			}
			break;
			

		case Parser.IDENTIFIER:
			msg = "identifier: " + ident;
			break;


		case Parser.AND:
			msg = "operator : &&";
			break;
		case Parser.EQUAL:
			msg = "operator : ==";
			break;
		case Parser.GREATER_EQUAL:
			msg = "operator : >=";
			break;
		case Parser.LESS_EQUAL:
			msg = "operator : <=";
			break;
		case Parser.NOT_EQUAL:
			msg = "operator : !=";
			break;
		case Parser.OR:
			msg = "operator : ||";
			break;
		default:
			msg = "operator : " + (char) code;
			break;
		}
		return (String.format("%-15s%s", loc, msg));
	}
}
