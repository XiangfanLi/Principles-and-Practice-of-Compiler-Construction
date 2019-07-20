/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: D:\Grade3up\CompilersPrinciples\decaf_PA1_B\src\decaf\frontend\Parser.spec
 * Options: unstrict mode
 * Generated at: Sun Nov 04 21:30:03 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 13
    public static final int BOOL = 258; //# line 13
    public static final int INT = 259; //# line 13
    public static final int STRING = 260; //# line 13
    public static final int CLASS = 261; //# line 13
    public static final int NULL = 262; //# line 14
    public static final int EXTENDS = 263; //# line 14
    public static final int THIS = 264; //# line 14
    public static final int WHILE = 265; //# line 14
    public static final int FOR = 266; //# line 14
    public static final int IF = 267; //# line 15
    public static final int ELSE = 268; //# line 15
    public static final int RETURN = 269; //# line 15
    public static final int BREAK = 270; //# line 15
    public static final int NEW = 271; //# line 15
    public static final int PRINT = 272; //# line 16
    public static final int READ_INTEGER = 273; //# line 16
    public static final int READ_LINE = 274; //# line 16
    public static final int LITERAL = 275; //# line 17
    public static final int IDENTIFIER = 276; //# line 18
    public static final int AND = 277; //# line 18
    public static final int OR = 278; //# line 18
    public static final int STATIC = 279; //# line 18
    public static final int INSTANCEOF = 280; //# line 18
    public static final int GUARD = 281; //# line 18
    public static final int VAR = 282; //# line 18
    public static final int FOREACH = 283; //# line 18
    public static final int ARRAY_CONCAT = 284; //# line 18
    public static final int ARRAY_REPEAT = 285; //# line 18
    public static final int DEFAULT = 286; //# line 18
    public static final int IN = 287; //# line 18
    public static final int SCOPY = 288; //# line 18
    public static final int SEALED = 289; //# line 18
    public static final int LEFTSQUARE = 290; //# line 18
    public static final int RIGHTSQUARE = 291; //# line 18
    public static final int LESS_EQUAL = 292; //# line 19
    public static final int GREATER_EQUAL = 293; //# line 19
    public static final int EQUAL = 294; //# line 19
    public static final int NOT_EQUAL = 295; //# line 19
    
    public static final int VariableDef = 296;
    public static final int ExprT5 = 297;
    public static final int ExprArrayRepeatT = 298;
    public static final int BoundVariable = 299;
    public static final int Oper3 = 300;
    public static final int Oper6 = 301;
    public static final int VariableList = 302;
    public static final int Formals = 303;
    public static final int Oper7 = 304;
    public static final int IfSubStmt = 305;
    public static final int IndexExprT = 306;
    public static final int IfBranchT = 307;
    public static final int Expr8 = 308;
    public static final int AfterSimpleTypeExpr = 309;
    public static final int VARTYPE = 310;
    public static final int Expr2 = 311;
    public static final int Oper2 = 312;
    public static final int DefaultClause = 313;
    public static final int IndexExpr = 314;
    public static final int Expr6 = 315;
    public static final int ArrayConcat = 316;
    public static final int ExprArrayRepeat = 317;
    public static final int ExprArrayConcat = 318;
    public static final int BreakStmt = 319;
    public static final int ExprT2 = 320;
    public static final int StmtList = 321;
    public static final int Constant = 322;
    public static final int SubVariableList = 323;
    public static final int PrintStmt = 324;
    public static final int ConstantList = 325;
    public static final int ForStmt = 326;
    public static final int Expr9 = 327;
    public static final int Expr1 = 328;
    public static final int ExprArrayConcatT = 329;
    public static final int ForeachStmt = 330;
    public static final int ArrayConstant = 331;
    public static final int VarIdent = 332;
    public static final int ConstantListT = 333;
    public static final int Oper1 = 334;
    public static final int ElseClause = 335;
    public static final int FieldList = 336;
    public static final int IfBranch = 337;
    public static final int SubExprList = 338;
    public static final int AfterParenExpr = 339;
    public static final int ClassDef = 340;
    public static final int SealedClause = 341;
    public static final int ReturnStmt = 342;
    public static final int ExprList = 343;
    public static final int StmtBlock = 344;
    public static final int FunctionField = 345;
    public static final int AfterIdentExpr = 346;
    public static final int Program = 347;
    public static final int GuardedStmtT = 348;
    public static final int Expr = 349;
    public static final int Type = 350;
    public static final int Expr5 = 351;
    public static final int AfterNewExpr = 352;
    public static final int Assignment = 353;
    public static final int ExtendsClause = 354;
    public static final int Oper5 = 355;
    public static final int ArrayType = 356;
    public static final int IfClause = 357;
    public static final int Expr3 = 358;
    public static final int Actuals = 359;
    public static final int Variable = 360;
    public static final int ExprT3 = 361;
    public static final int Stmt = 362;
    public static final int SimpleStmt = 363;
    public static final int IfStmtT = 364;
    public static final int SimpleType = 365;
    public static final int WhileStmt = 366;
    public static final int ExprT1 = 367;
    public static final int Expr4 = 368;
    public static final int ExprT4 = 369;
    public static final int ReturnExpr = 370;
    public static final int ArrayRepeat = 371;
    public static final int IfStmt = 372;
    public static final int ExprT6 = 373;
    public static final int ExprT8 = 374;
    public static final int Expr7 = 375;
    public static final int ForeachStmtT = 376;
    public static final int ClassList = 377;
    public static final int Oper4 = 378;
    public static final int Field = 379;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 296;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "GUARD",
        "VAR", "FOREACH", "ARRAY_CONCAT", "ARRAY_REPEAT", "DEFAULT",
        "IN", "SCOPY", "SEALED", "LEFTSQUARE", "RIGHTSQUARE",
        "LESS_EQUAL", "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "VariableDef",
        "ExprT5", "ExprArrayRepeatT", "BoundVariable", "Oper3", "Oper6",
        "VariableList", "Formals", "Oper7", "IfSubStmt", "IndexExprT",
        "IfBranchT", "Expr8", "AfterSimpleTypeExpr", "VARTYPE", "Expr2",
        "Oper2", "DefaultClause", "IndexExpr", "Expr6", "ArrayConcat",
        "ExprArrayRepeat", "ExprArrayConcat", "BreakStmt", "ExprT2", "StmtList",
        "Constant", "SubVariableList", "PrintStmt", "ConstantList", "ForStmt",
        "Expr9", "Expr1", "ExprArrayConcatT", "ForeachStmt", "ArrayConstant",
        "VarIdent", "ConstantListT", "Oper1", "ElseClause", "FieldList",
        "IfBranch", "SubExprList", "AfterParenExpr", "ClassDef", "SealedClause",
        "ReturnStmt", "ExprList", "StmtBlock", "FunctionField", "AfterIdentExpr",
        "Program", "GuardedStmtT", "Expr", "Type", "Expr5",
        "AfterNewExpr", "Assignment", "ExtendsClause", "Oper5", "ArrayType",
        "IfClause", "Expr3", "Actuals", "Variable", "ExprT3",
        "Stmt", "SimpleStmt", "IfStmtT", "SimpleType", "WhileStmt",
        "ExprT1", "Expr4", "ExprT4", "ReturnExpr", "ArrayRepeat",
        "IfStmt", "ExprT6", "ExprT8", "Expr7", "ForeachStmtT",
        "ClassList", "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, ARRAY_REPEAT, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {ARRAY_REPEAT, LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {VAR, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf(':'), Integer.valueOf(']')},
        {GUARD, Integer.valueOf('}')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {VAR},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {AND},
        {DEFAULT, Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {ARRAY_CONCAT},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {BREAK},
        {AND, Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, Integer.valueOf('['), NULL},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {LITERAL, NULL, Integer.valueOf('['), Integer.valueOf(']')},
        {FOR},
        {LEFTSQUARE, LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {ARRAY_CONCAT, LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {FOREACH},
        {Integer.valueOf('[')},
        {VAR},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER, CLASS},
        {SEALED, CLASS},
        {SEALED, CLASS},
        {RETURN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {SEALED, CLASS},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER, Integer.valueOf('}')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {IF, RIGHTSQUARE},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER, Integer.valueOf(')')},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, FOREACH, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{')},
        {VAR, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER, Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('('), Integer.valueOf('{')},
        {INT, VOID, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER, Integer.valueOf(';')},
        {ARRAY_REPEAT},
        {IF},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('-'), Integer.valueOf('!'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf(')'), WHILE},
        {SEALED, CLASS, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 296);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, ARRAY_REPEAT, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {IN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {GUARD, Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {IDENTIFIER},
        {Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('=')},
        {Integer.valueOf(']')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {SEALED, CLASS, eof, eos},
        {CLASS},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, ARRAY_REPEAT, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {IDENTIFIER},
        {RIGHTSQUARE},
        {Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, RIGHTSQUARE, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, RIGHTSQUARE, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), ARRAY_CONCAT, WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), ARRAY_REPEAT, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, LEFTSQUARE, READ_INTEGER, Integer.valueOf('{')},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), LEFTSQUARE, READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 296);
    }
    
    public Table() {
        for (int i = 0; i < 84; i++) {
            begin.add(new HashSet<>(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet<>(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Map.Entry<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 47
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 626
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case ARRAY_CONCAT:
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAY_REPEAT:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 597
            case ExprArrayRepeatT: {
                switch (lookahead) {
                    case ARRAY_REPEAT:
                        return new AbstractMap.SimpleEntry<>(3, Arrays.asList(ArrayRepeat, Expr5, ExprArrayRepeatT));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case ARRAY_CONCAT:
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 276
            case BoundVariable: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(5, Arrays.asList(VARTYPE, IDENTIFIER));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 336
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(8, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 396
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 172
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 162
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(13, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList());
                    default: return null;
                }
            }
            //# line 413
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 959
            case IfSubStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 757
            case IndexExprT: {
                switch (lookahead) {
                    case ':':
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Integer.valueOf(':'), Expr, Integer.valueOf(']')));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(Integer.valueOf(']'), DefaultClause));
                    default: return null;
                }
            }
            //# line 949
            case IfBranchT: {
                switch (lookahead) {
                    case GUARD:
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList(GUARD, IfSubStmt, IfBranchT));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 682
            case Expr8: {
                switch (lookahead) {
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 859
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(23, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 286
            case VARTYPE: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList(VAR));
                    default: return null;
                }
            }
            //# line 465
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(26, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 329
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(27, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 767
            case DefaultClause: {
                switch (lookahead) {
                    case DEFAULT:
                        return new AbstractMap.SimpleEntry<>(28, Arrays.asList(DEFAULT, Expr9));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case ARRAY_CONCAT:
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case ARRAY_REPEAT:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(29, Arrays.asList());
                    default: return null;
                }
            }
            //# line 743
            case IndexExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(30, Arrays.asList(Expr, IndexExprT));
                    default: return null;
                }
            }
            //# line 643
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(31, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 370
            case ArrayConcat: {
                switch (lookahead) {
                    case ARRAY_CONCAT:
                        return new AbstractMap.SimpleEntry<>(32, Arrays.asList(ARRAY_CONCAT));
                    default: return null;
                }
            }
            //# line 585
            case ExprArrayRepeat: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(33, Arrays.asList(Expr5, ExprArrayRepeatT));
                    default: return null;
                }
            }
            //# line 552
            case ExprArrayConcat: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList(ExprArrayRepeat, ExprArrayConcatT));
                    default: return null;
                }
            }
            //# line 1008
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(35, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 477
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 199
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case LEFTSQUARE:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(38, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 883
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList(LITERAL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(41, Arrays.asList(ArrayConstant));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(42, Arrays.asList(NULL));
                    default: return null;
                }
            }
            //# line 182
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(43, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1055
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 897
            case ConstantList: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(46, Arrays.asList(Constant, ConstantListT));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1002
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(48, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 796
            case Expr9: {
                switch (lookahead) {
                    case LEFTSQUARE:
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList(LEFTSQUARE, Expr, FOR, IDENTIFIER, IN, Expr, IfClause, RIGHTSQUARE));
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(51, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(56, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    default: return null;
                }
            }
            //# line 436
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(58, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 568
            case ExprArrayConcatT: {
                switch (lookahead) {
                    case ARRAY_CONCAT:
                        return new AbstractMap.SimpleEntry<>(59, Arrays.asList(ArrayConcat, ExprArrayRepeat, ExprArrayConcatT));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 253
            case ForeachStmt: {
                switch (lookahead) {
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(61, Arrays.asList(FOREACH, Integer.valueOf('('), BoundVariable, IN, Expr, ForeachStmtT));
                    default: return null;
                }
            }
            //# line 922
            case ArrayConstant: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList(Integer.valueOf('['), ConstantList, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 307
            case VarIdent: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList(VAR, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 911
            case ConstantListT: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(64, Arrays.asList(Integer.valueOf(','), Constant, ConstantListT));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 322
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(66, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 1035
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case '}':
                    case GUARD:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case LEFTSQUARE:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 121
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList());
                    default: return null;
                }
            }
            //# line 940
            case IfBranch: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList(IfSubStmt, IfBranchT));
                    default: return null;
                }
            }
            //# line 983
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(73, Arrays.asList());
                    default: return null;
                }
            }
            //# line 871
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(74, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(75, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 100
            case ClassDef: {
                switch (lookahead) {
                    case SEALED:
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(76, Arrays.asList(SealedClause, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 114
            case SealedClause: {
                switch (lookahead) {
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(77, Arrays.asList(SEALED));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1042
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 975
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(80, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 193
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 154
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(82, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 779
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(84, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case ARRAY_CONCAT:
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case ARRAY_REPEAT:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 25
            case Program: {
                switch (lookahead) {
                    case SEALED:
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(86, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 930
            case GuardedStmtT: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(87, Arrays.asList(IfBranch, Integer.valueOf('}')));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(88, Arrays.asList(Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 426
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(89, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 81
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(90, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 614
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(91, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 845
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(92, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(93, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 313
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 106
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(96, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 384
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(98, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 90
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(100, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList());
                    default: return null;
                }
            }
            //# line 786
            case IfClause: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(102, Arrays.asList(IF, Expr));
                    case RIGHTSQUARE:
                        return new AbstractMap.SimpleEntry<>(103, Arrays.asList());
                    default: return null;
                }
            }
            //# line 494
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(104, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 965
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(106, Arrays.asList());
                    default: return null;
                }
            }
            //# line 53
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(107, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 506
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 207
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(110, Arrays.asList(VariableDef));
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(111, Arrays.asList(ForeachStmt));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(112, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(IfStmt));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(114, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(116, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(117, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(118, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(119, Arrays.asList(StmtBlock));
                    default: return null;
                }
            }
            //# line 292
            case SimpleStmt: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(120, Arrays.asList(VarIdent, Integer.valueOf('='), Expr));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(121, Arrays.asList(Expr, Assignment));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1023
            case IfStmtT: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(123, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(124, Arrays.asList(Integer.valueOf('{'), GuardedStmtT));
                    default: return null;
                }
            }
            //# line 59
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(125, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(126, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(127, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(128, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(129, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 996
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(130, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 448
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 523
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(133, Arrays.asList(ExprArrayConcat, ExprT4));
                    default: return null;
                }
            }
            //# line 535
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(134, Arrays.asList(Oper4, ExprArrayConcat, ExprT4));
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1048
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(136, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 377
            case ArrayRepeat: {
                switch (lookahead) {
                    case ARRAY_REPEAT:
                        return new AbstractMap.SimpleEntry<>(138, Arrays.asList(ARRAY_REPEAT));
                    default: return null;
                }
            }
            //# line 1014
            case IfStmt: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList(IF, IfStmtT));
                    default: return null;
                }
            }
            //# line 655
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(140, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case ARRAY_CONCAT:
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case ARRAY_REPEAT:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 709
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(Integer.valueOf('['), IndexExpr, ExprT8));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(143, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case RIGHTSQUARE:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case ARRAY_CONCAT:
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case ARRAY_REPEAT:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 672
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList(Oper7, Expr8));
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case LEFTSQUARE:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 262
            case ForeachStmtT: {
                switch (lookahead) {
                    case ')':
                        return new AbstractMap.SimpleEntry<>(147, Arrays.asList(Integer.valueOf(')'), Stmt));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(148, Arrays.asList(WHILE, Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 36
            case ClassList: {
                switch (lookahead) {
                    case SEALED:
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList());
                    default: return null;
                }
            }
            //# line 348
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(151, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(153, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(154, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 138
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(155, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(156, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 48
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 627
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 2: {
                /* no action */
                return;
            }
            case 3: {
                //# line 598
                params[0].svec = new Vector<Integer>();
                                  params[0].lvec = new Vector<Location>();
                                  params[0].evec = new Vector<Expr>();
                                  params[0].svec.add(params[1].counter);
                                  params[0].lvec.add(params[1].loc);
                                  params[0].evec.add(params[2].expr);
                                  if (params[3].svec != null) {
                                      params[0].svec.addAll(params[3].svec);
                                      params[0].lvec.addAll(params[3].lvec);
                                      params[0].evec.addAll(params[3].evec);
                                  }
                return;
            }
            case 4: {
                /* no action */
                return;
            }
            case 5: {
                //# line 277
                params[0].boundVariable = new BoundVariable(params[1].type, params[2].ident, params[1].loc);
                return;
            }
            case 6: {
                //# line 281
                params[0].boundVariable = new BoundVariable(params[1].type, params[2].ident, params[1].loc);
                return;
            }
            case 7: {
                //# line 337
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 342
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 397
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 402
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 407
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 12: {
                //# line 173
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 13: {
                //# line 163
                params[0].vlist = params[1].vlist;
                return;
            }
            case 14: {
                //# line 167
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 15: {
                //# line 414
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 16: {
                //# line 419
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 17: {
                //# line 960
                params[0].ifSubStmt = new IfSubStmt(params[1].expr, params[3].stmt, params[1].loc);
                return;
            }
            case 18: {
                //# line 758
                params[0].expr = params[2].expr;
                return;
            }
            case 19: {
                //# line 762
                params[0].defaultexpr = params[2].defaultexpr;
                return;
            }
            case 20: {
                //# line 950
                params[0].ilist = new ArrayList<IfSubStmt> ();
                params[0].ilist.add(params[2].ifSubStmt);
                if(params[3].ilist != null)
                	params[0].ilist.addAll(params[3].ilist);
                return;
            }
            case 21: {
                /* no action */
                return;
            }
            case 22: {
                //# line 683
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                          if(v.index1 !=null)
                          {
                          	params[0].expr = new Tree.SubArray(params[0].expr, v.index1, v.index2, params[0].loc);
                          }
                          else if (v.expr != null) {
                          	if(v.defaultexpr == null)
                            	params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        	else
                        		params[0].expr = new Tree.IndexedDefault(params[0].expr, v.expr, v.defaultexpr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 23: {
                //# line 860
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 24: {
                //# line 865
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 25: {
                //# line 287
                params[0].type = new Tree.TypeIdent(Tree.VAR, params[1].loc);
                return;
            }
            case 26: {
                //# line 466
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 27: {
                //# line 330
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 28: {
                //# line 768
                if(params[2] != null)
                params[0].defaultexpr = params[2].expr;
                return;
            }
            case 29: {
                //# line 773
                return;
            }
            case 30: {
                //# line 744
                if(params[2].expr == null)
                {
                	params[0].expr = params[1].expr;
                	params[0].defaultexpr = params[2].defaultexpr;
                }
                else{
                	params[0].index1 = params[1].expr;
                	params[0].index2 = params[2].expr;
                }
                return;
            }
            case 31: {
                //# line 644
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 32: {
                //# line 371
                params[0].counter = Tree.ARRAYCONCAT;
                params[0].loc = params[1].loc;
                return;
            }
            case 33: {
                //# line 586
                params[0].expr = params[1].expr;
                                  if (params[2].svec != null) {
                                      for (int i = 0; i < params[2].svec.size(); ++i) {
                                          params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                                              params[2].evec.get(i), params[2].lvec.get(i));
                                      }
                                  }
                return;
            }
            case 34: {
                //# line 553
                if (params[2].svec != null) {
                	params[0].expr = params[2].evec.get(params[2].evec.size()-1);
                    for (int i = params[2].svec.size()-2; i >= 0 ; --i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i+1), params[2].evec.get(i), params[0].expr,
                            params[2].lvec.get(i+1));
                    }
                    params[0].expr = new Tree.Binary(params[2].svec.get(0), params[1].expr,
                            params[0].expr, params[2].lvec.get(0));
                }
                else
                	params[0].expr = params[1].expr;
                return;
            }
            case 35: {
                //# line 1009
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 36: {
                //# line 478
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 37: {
                /* no action */
                return;
            }
            case 38: {
                //# line 200
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 39: {
                /* no action */
                return;
            }
            case 40: {
                //# line 884
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 41: {
                //# line 888
                params[0].expr = params[1].expr;
                return;
            }
            case 42: {
                //# line 892
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 43: {
                //# line 183
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 44: {
                /* no action */
                return;
            }
            case 45: {
                //# line 1056
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 46: {
                //# line 898
                params[0].clist1 = new ArrayList<Expr> ();
                if(params[2].clist1 == null)
                	params[2].clist1 = new ArrayList<Expr> ();
                params[0].clist1.add(params[1].expr);
                params[0].clist1.addAll(params[2].clist1);
                return;
            }
            case 47: {
                //# line 906
                params[0].clist1 = new ArrayList<Expr> ();
                return;
            }
            case 48: {
                //# line 1003
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 49: {
                //# line 797
                if(params[7].expr == null)
                	params[0].expr = new Tree.PyArray(params[2].expr, params[4].ident, params[6].expr, new Literal(Tree.BOOL, true, params[6].loc), params[1].loc);
                else
                	params[0].expr = new Tree.PyArray(params[2].expr, params[4].ident, params[6].expr, params[7].expr, params[1].loc);
                return;
            }
            case 50: {
                //# line 804
                params[0].expr = params[1].expr;
                return;
            }
            case 51: {
                //# line 808
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 52: {
                //# line 812
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 53: {
                //# line 816
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 54: {
                //# line 820
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 55: {
                //# line 828
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 56: {
                //# line 832
                params[0].expr = params[2].expr;
                return;
            }
            case 57: {
                //# line 836
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 58: {
                //# line 437
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 59: {
                //# line 569
                params[0].svec = new Vector<Integer>();
                                  params[0].lvec = new Vector<Location>();
                                  params[0].evec = new Vector<Expr>();
                                  params[0].svec.add(params[1].counter);
                                  params[0].lvec.add(params[1].loc);
                                  params[0].evec.add(params[2].expr);
                                  if (params[3].svec != null) {
                                      params[0].svec.addAll(params[3].svec);
                                      params[0].lvec.addAll(params[3].lvec);
                                      params[0].evec.addAll(params[3].evec);
                                  }
                return;
            }
            case 60: {
                /* no action */
                return;
            }
            case 61: {
                //# line 254
                if(params[6].expr == null)
                	params[0].foreachStmt = new ForeachStmt(params[3].boundVariable, params[5].expr, new Literal(Tree.BOOL, "true", params[5].loc), params[6].stmt, params[1].loc);
                else
                	params[0].foreachStmt = new ForeachStmt(params[3].boundVariable, params[5].expr, params[6].expr, params[6].stmt, params[1].loc);
                return;
            }
            case 62: {
                //# line 923
                params[0].expr = new ArrayConstant(params[2].clist1, params[1].loc);
                return;
            }
            case 63: {
                //# line 308
                params[0].expr = new Tree.VarIdent(params[2].ident, params[1].loc);
                return;
            }
            case 64: {
                //# line 912
                if(params[3].clist1 == null)
                params[3].clist1 = new ArrayList<Expr> ();
                params[0].clist1 = new ArrayList<Expr> ();
                params[0].clist1.add(params[2].expr);
                params[0].clist1.addAll(params[3].clist1);
                return;
            }
            case 65: {
                /* no action */
                return;
            }
            case 66: {
                //# line 323
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 67: {
                //# line 1036
                params[0].stmt = params[2].stmt;
                return;
            }
            case 68: {
                /* no action */
                return;
            }
            case 69: {
                //# line 122
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                if(params[2].flist != null)
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 70: {
                //# line 133
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 71: {
                //# line 941
                params[0].ilist = new ArrayList<IfSubStmt> ();
                params[0].ilist.add(params[1].ifSubStmt);
                if(params[2].ilist != null)
                	params[0].ilist.addAll(params[2].ilist);
                return;
            }
            case 72: {
                //# line 984
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 73: {
                //# line 990
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 74: {
                //# line 872
                params[0].expr = params[1].expr;
                return;
            }
            case 75: {
                //# line 876
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 76: {
                //# line 101
                params[0].cdef = new Tree.ClassDef(params[1].ident, params[3].ident, params[4].ident, params[6].flist, params[1].loc);
                return;
            }
            case 77: {
                //# line 115
                params[0].ident = "sealed";
                return;
            }
            case 78: {
                /* no action */
                return;
            }
            case 79: {
                //# line 1043
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 80: {
                //# line 976
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 81: {
                //# line 194
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 82: {
                //# line 155
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 83: {
                /* no action */
                return;
            }
            case 84: {
                //# line 780
                params[0].elist = params[2].elist;
                return;
            }
            case 85: {
                /* no action */
                return;
            }
            case 86: {
                //# line 26
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 87: {
                //# line 931
                params[0].ilist = params[1].ilist;
                return;
            }
            case 88: {
                //# line 935
                params[0].ilist = new ArrayList<IfSubStmt> ();
                return;
            }
            case 89: {
                //# line 427
                params[0].expr = params[1].expr;	
                return;
            }
            case 90: {
                //# line 82
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 91: {
                //# line 615
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 92: {
                //# line 846
                params[0].ident = params[1].ident;
                return;
            }
            case 93: {
                //# line 850
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 94: {
                //# line 314
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 95: {
                /* no action */
                return;
            }
            case 96: {
                //# line 107
                if(params[2] != null)
                   params[0].ident = params[2].ident;
                return;
            }
            case 97: {
                /* no action */
                return;
            }
            case 98: {
                //# line 385
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 99: {
                //# line 390
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 100: {
                //# line 91
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 101: {
                //# line 95
                params[0].counter = 0;
                return;
            }
            case 102: {
                //# line 787
                if(params[2] != null)
                params[0].expr = params[2].expr;
                return;
            }
            case 103: {
                //# line 792
                return;
            }
            case 104: {
                //# line 495
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 105: {
                //# line 966
                params[0].elist = params[1].elist;
                return;
            }
            case 106: {
                //# line 970
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 107: {
                //# line 54
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 108: {
                //# line 507
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 109: {
                /* no action */
                return;
            }
            case 110: {
                //# line 208
                params[0].stmt = params[1].vdef;
                return;
            }
            case 111: {
                //# line 212
                params[0].stmt = params[1].foreachStmt;
                return;
            }
            case 112: {
                //# line 216
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 113: {
                //# line 224
                params[0].stmt = params[1].stmt;
                return;
            }
            case 114: {
                //# line 228
                params[0].stmt = params[1].stmt;
                return;
            }
            case 115: {
                //# line 232
                params[0].stmt = params[1].stmt;
                return;
            }
            case 116: {
                //# line 236
                params[0].stmt = params[1].stmt;
                return;
            }
            case 117: {
                //# line 240
                params[0].stmt = params[1].stmt;
                return;
            }
            case 118: {
                //# line 244
                params[0].stmt = params[1].stmt;
                return;
            }
            case 119: {
                //# line 248
                params[0].stmt = params[1].stmt;
                return;
            }
            case 120: {
                //# line 293
                params[0].stmt = new Tree.Assign(params[1].expr, params[3].expr, params[2].loc);
                return;
            }
            case 121: {
                //# line 297
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 122: {
                /* no action */
                return;
            }
            case 123: {
                //# line 1024
                params[0].expr = params[2].expr; 
                params[0].stmt	= params[4].stmt;
                params[0].stmt1 = params[5].stmt;
                return;
            }
            case 124: {
                //# line 1030
                params[0].ilist = params[2].ilist;
                return;
            }
            case 125: {
                //# line 60
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 126: {
                //# line 64
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 127: {
                //# line 68
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 128: {
                //# line 72
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 129: {
                //# line 76
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 130: {
                //# line 997
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 131: {
                //# line 449
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 132: {
                /* no action */
                return;
            }
            case 133: {
                //# line 524
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 134: {
                //# line 536
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 135: {
                /* no action */
                return;
            }
            case 136: {
                //# line 1049
                params[0].expr = params[1].expr;
                return;
            }
            case 137: {
                /* no action */
                return;
            }
            case 138: {
                //# line 378
                params[0].counter = Tree.ARRAYREPEAT;
                params[0].loc = params[1].loc;
                return;
            }
            case 139: {
                //# line 1015
                if(params[2].ilist == null)
                	params[0].stmt = new Tree.If(params[2].expr, params[2].stmt, params[2].stmt1, params[1].loc);
                else
                	params[0].stmt = new Tree.GuardStmt(params[2].ilist, params[1].loc);
                return;
            }
            case 140: {
                //# line 656
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 141: {
                /* no action */
                return;
            }
            case 142: {
                //# line 710
                SemValue sem = new SemValue();
                if(params[2].index1 == null)
                {
                	sem.expr = params[2].expr;
                	sem.defaultexpr = params[2].defaultexpr;
                }
                else
                {
                	sem.index1 = params[2].index1;
                	sem.index2 = params[2].index2;
                }
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[3].vec != null) {
                    params[0].vec.addAll(params[3].vec);
                }
                return;
            }
            case 143: {
                //# line 729
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 144: {
                /* no action */
                return;
            }
            case 145: {
                //# line 673
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 146: {
                //# line 677
                params[0].expr = params[1].expr;
                return;
            }
            case 147: {
                //# line 263
                if(params[2] != null)
                	params[0].stmt = params[2].stmt;
                return;
            }
            case 148: {
                //# line 268
                if(params[2] != null)
                	params[0].expr = params[2].expr;
                if(params[4] != null)
                	params[0].stmt = params[4].stmt;
                return;
            }
            case 149: {
                //# line 37
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 150: {
                /* no action */
                return;
            }
            case 151: {
                //# line 349
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 152: {
                //# line 354
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 153: {
                //# line 359
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 154: {
                //# line 364
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 155: {
                //# line 139
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 156: {
                //# line 144
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
