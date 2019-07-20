//### This file created by BYACC 1.8(/Java extension  1.13)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//###           14 Sep 06  -- Keltin Leung-- ReduceListener support, eliminate underflow report in error recovery
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 11 "Parser.y"
package decaf.frontend;

import decaf.tree.Tree;
import decaf.tree.Tree.*;
import decaf.error.*;
import java.util.*;
//#line 25 "Parser.java"
interface ReduceListener {
  public boolean onReduce(String rule);
}




public class Parser
             extends BaseParser
             implements ReduceListener
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

ReduceListener reduceListener = null;
void yyclearin ()       {yychar = (-1);}
void yyerrok ()         {yyerrflag=0;}
void addReduceListener(ReduceListener l) {
  reduceListener = l;}


//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//## **user defined:SemValue
String   yytext;//user variable to return contextual strings
SemValue yyval; //used to return semantic vals from action routines
SemValue yylval;//the 'lval' (result) I got from yylex()
SemValue valstk[] = new SemValue[YYSTACKSIZE];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
final void val_init()
{
  yyval=new SemValue();
  yylval=new SemValue();
  valptr=-1;
}
final void val_push(SemValue val)
{
  try {
    valptr++;
    valstk[valptr]=val;
  }
  catch (ArrayIndexOutOfBoundsException e) {
    int oldsize = valstk.length;
    int newsize = oldsize*2;
    SemValue[] newstack = new SemValue[newsize];
    System.arraycopy(valstk,0,newstack,0,oldsize);
    valstk = newstack;
    valstk[valptr]=val;
  }
}
final SemValue val_pop()
{
  return valstk[valptr--];
}
final void val_drop(int cnt)
{
  valptr -= cnt;
}
final SemValue val_peek(int relative)
{
  return valstk[valptr-relative];
}
//#### end semantic value section ####
public final static short VOID=257;
public final static short BOOL=258;
public final static short INT=259;
public final static short STRING=260;
public final static short CLASS=261;
public final static short NULL=262;
public final static short EXTENDS=263;
public final static short THIS=264;
public final static short WHILE=265;
public final static short FOR=266;
public final static short IF=267;
public final static short ELSE=268;
public final static short RETURN=269;
public final static short BREAK=270;
public final static short NEW=271;
public final static short PRINT=272;
public final static short READ_INTEGER=273;
public final static short READ_LINE=274;
public final static short LITERAL=275;
public final static short IDENTIFIER=276;
public final static short AND=277;
public final static short OR=278;
public final static short STATIC=279;
public final static short INSTANCEOF=280;
public final static short SCOPY=281;
public final static short SEALED=282;
public final static short VAR=283;
public final static short FOREACH=284;
public final static short GUARD=285;
public final static short ARRAY_CONCAT=286;
public final static short ARRAY_REPEAT=287;
public final static short DEFAULT=288;
public final static short LESS_EQUAL=289;
public final static short GREATER_EQUAL=290;
public final static short EQUAL=291;
public final static short NOT_EQUAL=292;
public final static short UMINUS=293;
public final static short EMPTY=294;
public final static short IN=295;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    1,    1,    3,    4,    5,    5,    5,    5,    5,
    5,    2,    6,    6,    7,    7,    8,    8,    8,   10,
   10,   11,   11,    9,    9,   12,   13,   13,   15,   14,
   14,   14,   14,   14,   14,   14,   14,   14,   14,   14,
   14,   18,   18,   18,   28,   28,   26,   26,   26,   27,
   16,   16,   16,   16,   16,   16,   16,   16,   16,   16,
   16,   16,   16,   16,   16,   16,   16,   16,   16,   16,
   16,   16,   16,   16,   16,   16,   16,   16,   16,   16,
   16,   16,   30,   30,   30,   32,   32,   31,   31,   25,
   25,   33,   33,   34,   17,   17,   35,   35,   36,   29,
   29,   37,   37,   20,   21,   24,   19,   38,   38,   22,
   22,   23,
};
final static short yylen[] = {                            2,
    1,    2,    1,    2,    2,    1,    1,    1,    1,    2,
    3,    7,    1,    0,    2,    0,    2,    2,    0,    1,
    0,    3,    1,    7,    6,    3,    2,    0,    6,    1,
    1,    1,    2,    1,    1,    1,    2,    2,    2,    1,
    1,    3,    1,    0,    2,    0,    2,    4,    2,    5,
    1,    1,    1,    7,    9,    6,    6,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    3,    3,    3,    3,
    3,    3,    3,    2,    2,    3,    3,    1,    4,    5,
    6,    5,    1,    1,    1,    3,    1,    3,    2,    5,
    3,    3,    0,    3,    7,    9,    2,    2,    1,    1,
    0,    3,    1,    5,    9,    1,    6,    2,    0,    2,
    1,    4,
};
final static short yydefred[] = {                         0,
   13,    0,    0,    3,    0,    2,    0,    0,    0,    0,
   15,   19,    0,    7,    8,    6,    9,    0,    0,   12,
   17,    0,    0,   18,   10,    0,    4,    0,    0,    0,
    0,   11,    0,   23,    0,    0,    0,    0,    5,    0,
    0,    0,   28,   25,   22,   24,    0,   85,   78,    0,
    0,    0,    0,  106,    0,    0,    0,    0,   83,    0,
    0,    0,    0,    0,    0,    0,    0,   26,   32,   40,
   27,   31,    0,   30,    0,   34,   35,   36,    0,    0,
    0,   41,    0,    0,    0,   53,   84,    0,    0,    0,
    0,    0,   51,   52,    0,    0,    0,    0,    0,    0,
    0,   49,    0,    0,    0,    0,    0,   89,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   45,    0,   33,   37,
   38,   39,    0,    0,    0,    0,    0,   91,    0,    0,
    0,    0,    0,   76,   77,    0,    0,   99,    0,    0,
    0,    0,   73,    0,    0,   88,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   79,
    0,    0,  112,    0,    0,   98,    0,   97,    0,    0,
    0,   86,    0,    0,    0,    0,  104,    0,    0,    0,
   92,   90,   80,    0,    0,    0,    0,   82,    0,   87,
    0,    0,   50,    0,    0,  107,   94,   81,   29,    0,
    0,    0,   57,   56,    0,  108,    0,   95,    0,   54,
    0,    0,    0,  105,   96,   55,
};
final static short yydgoto[] = {                          2,
    3,    4,   69,   22,   35,    5,   10,   13,   24,   36,
   37,   70,   47,   71,   72,   73,   74,   75,   76,   77,
   78,   79,   80,   81,   82,   93,   94,   85,  195,   86,
   87,  111,  139,  179,  150,  151,  143,  216,
};
final static short yysindex[] = {                      -265,
    0,    0, -265,    0, -231,    0, -236, -194, -229,  -49,
    0,    0,  -66,    0,    0,    0,    0, -189,  222,    0,
    0,   30,  -72,    0,    0,  -71,    0,   60,    8,   63,
  222,    0,  222,    0,  -64,   64,   62,   76,    0,   -5,
  222,   -5,    0,    0,    0,    0,  818,    0,    0,   88,
   91,  -25, 1332,    0,  130,  101,  104,  114,    0,  116,
  119, -130,  123, 1332, 1332, 1109, 1184,    0,    0,    0,
    0,    0,  854,    0,   96,    0,    0,    0,  108,  110,
  111,    0,  112,    0, -102,    0,    0, 1332, 1332, 1332,
   51,  854,    0,    0,  137,   95, 1332,  147,  148, 1332,
  -86,    0, -216,  -20,  -20,  -73,  394,    0,  431,    0,
  -15, 1332, 1332, 1332, 1332, 1332, 1332, 1332, 1332, 1332,
 1332, 1332, 1332, 1332, 1332, 1332,    0, 1332,    0,    0,
    0,    0, 1332,  170,  467,  161,  497,    0, 1332,  166,
 1276,  854,   16,    0,    0,  523,  177,    0,  -52,  -68,
  -54,  182,    0,  -34,   22,    0,  889,  882,  115,   87,
  115,  115,  925,  925,  376,  376,  -20,  -20,  -20,  115,
  115,  259,  854, 1332,  974, 1332,  974,  553, -113,    0,
  575, 1332,    0,  -33, 1332,    0, 1332,    0, 1332,  -51,
  -16,    0, 1332,  -40,  198,  201,    0,  596,  -21,  974,
    0,    0,    0,  854,  210,  669,  229,    0, 1332,    0,
  603, 1332,    0, 1332,  974,    0,    0,    0,    0, 1332,
  974,  286,    0,    0,  220,    0,  705,    0, 1332,    0,
  974,  974,  735,    0,    0,    0,
};
final static short yyrindex[] = {                         3,
    0,    0,    1,    0,    0,    0,    0,  144,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  214,    0,    0,
  238,    0,  238,    0,    0,    0,  244,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -43,    0,    0,    0,
    0,    0,  -41,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   14,   14,   14,   14,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  861,  316,    0,    0,    0,   14,  -43,   14,
 1302,  233,    0,    0,    0,    0,   14,    0,    0,   14,
    0,    0,    0,   21,   49,    0,    0,    0,    0,  172,
    0,   14,   14,   14,   14,   14,   14,   14,   14,   14,
   14,   14,   14,   14,   14,   14,    0,   14,    0,    0,
    0,    0,   14,  -37,    0,    0,    0,    0,   14,    0,
   14,   32,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  143, 1253, 1067, 1209,
 1149, 1215,  167,  763, 1062, 1144,   78,  106,  138, 1237,
 1245,    0,  -28,  -39,  -43,   14,  -43,    0,    0,    0,
    0,   14,    0,    0,   14,    0,   14,    0,   14,    0,
    0,    0,   14,   -9,    0,  252,    0,    0,  787,  -43,
    0,    0,    0,   44,    0,    0,    0,    0,   14,    0,
    0,   14,    0,  -38,  -43,    0,    0,    0,    0,   14,
  -43,    0,    0,    0,    0,    0,    0,    0,   14,    0,
  -43,  -43,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,  291,  282,   71,   42,    0,    0,    0,    0,  267,
    0,    6,    0, -105,    0, 1533,    0,  -75,    0,    0,
    0,    0,    0,    0,    0, 1229, 1395,    0,    0,  -56,
    0,    0,    0,    0,    0,    0,  129,    0,
};
final static int YYTABLESIZE=1762;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         47,
    1,  101,   44,   47,   47,   47,   47,   47,   47,   47,
  110,  202,   42,  136,   90,   44,    1,  111,   29,   29,
   47,   47,   47,   47,   47,  127,   29,   48,  155,    7,
   42,   48,   48,   48,   48,   48,   48,   48,   29,    8,
   14,   15,   16,   17,   18,   44,   11,   46,   48,   48,
   48,   48,   48,   47,   23,   47,  183,   74,   20,  182,
   26,   74,   74,   74,   74,   74,  148,   74,    9,  197,
  128,  199,  103,   12,  191,  103,  108,  156,   74,   74,
   74,   48,   74,   48,  102,   75,   25,  102,   27,   75,
   75,   75,   75,   75,  217,   75,   96,   91,  192,   31,
   32,   34,   33,   34,   40,   41,   75,   75,   75,  226,
   75,   45,  191,   74,   61,  228,   42,   43,   61,   61,
   61,   61,   61,  124,   61,  234,  235,   88,  122,  120,
   89,  121,  127,  123,  210,   61,   61,   61,  225,   61,
   97,   75,   62,   98,  149,  102,   62,   62,   62,   62,
   62,  124,   62,   99,  129,  100,  122,  120,  101,  121,
  127,  123,  103,   62,   62,   62,  130,   62,  131,  132,
   61,  201,  133,  134,   63,  138,  140,  128,   63,   63,
   63,   63,   63,   71,   63,  141,   71,  144,  145,  147,
   14,   15,   16,   17,   18,   63,   63,   63,   62,   63,
   71,   71,  152,   28,   30,  128,  180,   65,   53,  174,
   65,   39,   19,   53,   53,   87,   53,   53,   53,  176,
  185,  188,  189,  186,   65,   65,  187,   47,   47,   47,
   63,   53,   46,   53,   46,   71,   46,   46,  213,   47,
   47,  190,  205,  209,  182,   48,  215,  212,   47,   47,
  218,   47,   47,   47,   47,   48,   48,   48,   59,   65,
  231,   14,   53,   14,   87,  124,   16,   48,   48,  221,
  122,  120,    5,  121,  127,  123,   48,   48,   21,   48,
   48,   48,   48,   48,   20,   74,   74,   74,  126,   46,
  125,  110,  100,    6,   21,  124,   59,   74,   74,   38,
  122,  120,  196,  121,  127,  123,   74,   74,    0,   74,
   74,   74,   74,   75,   75,   75,  193,    0,  126,  128,
  125,    0,  124,    0,    0,   75,   75,  122,  120,    0,
  121,  127,  123,    0,   75,   75,    0,   75,   75,   75,
   75,    0,   61,   61,   61,  126,    0,  125,    0,  128,
    0,  194,   52,    0,   61,   61,   43,   52,   52,    0,
   52,   52,   52,   61,   61,    0,   61,   61,   61,   61,
   62,   62,   62,    0,   43,   52,  128,   52,  230,    0,
    0,    0,   62,   62,    0,    0,   14,   15,   16,   17,
   18,   62,   62,    0,   62,   62,   62,   62,    0,    0,
  114,  115,   63,   63,   63,   95,   52,   71,   71,   71,
    0,    0,  124,    0,   63,   63,    0,  122,    0,   71,
   71,  127,  123,   63,   63,    0,   63,   63,   63,   63,
  124,   65,   65,   65,  153,  122,  120,   53,  121,  127,
  123,    0,    0,   65,   65,    0,    0,    0,   53,   53,
    0,    0,    0,  126,    0,  125,    0,   53,   53,    0,
   53,   53,   53,   53,    0,    0,  128,  124,    0,    0,
    0,    0,  122,  120,    0,  121,  127,  123,   14,   15,
   16,   17,   18,    0,  128,    0,    0,    0,    0,    0,
  126,    0,  125,  220,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  124,    0,  112,  113,  175,  122,  120,
    0,  121,  127,  123,  114,  115,    0,  116,  117,  118,
  119,  128,    0,    0,    0,    0,  126,    0,  125,    0,
    0,    0,    0,  124,    0,  112,  113,  177,  122,  120,
    0,  121,  127,  123,  114,  115,    0,  116,  117,  118,
  119,    0,  229,    0,    0,    0,  126,  128,  125,  124,
    0,    0,  112,  113,  122,  120,  184,  121,  127,  123,
    0,  114,  115,    0,  116,  117,  118,  119,    0,    0,
    0,    0,  126,    0,  125,    0,    0,  128,    0,  124,
    0,    0,   52,   52,  122,  120,    0,  121,  127,  123,
    0,   52,   52,    0,   52,   52,   52,   52,    0,    0,
  200,  124,  126,  128,  125,    0,  122,  120,    0,  121,
  127,  123,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  124,    0,  126,    0,  125,  122,  120,  124,
  121,  127,  123,  128,  122,  120,    0,  121,  127,  123,
    0,    0,    0,    0,  214,  126,    0,  125,    0,    0,
    0,    0,  126,    0,  125,  128,    0,  203,    0,    0,
  112,  113,    0,    0,    0,    0,    0,    0,    0,  114,
  115,    0,  116,  117,  118,  119,  128,    0,    0,    0,
    0,    0,    0,  128,    0,  223,  154,    0,    0,    0,
    0,    0,    0,    0,    0,  124,    0,  112,  113,  219,
  122,  120,    0,  121,  127,  123,  114,  115,    0,  116,
  117,  118,  119,    0,    0,    0,    0,    0,  126,    0,
  125,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  124,    0,  112,  113,  232,  122,  120,    0,  121,
  127,  123,  114,  115,    0,  116,  117,  118,  119,  128,
    0,    0,    0,    0,  126,    0,  125,    0,    0,    0,
    0,  124,    0,  112,  113,    0,  122,  120,    0,  121,
  127,  123,  114,  115,    0,  116,  117,  118,  119,    0,
    0,    0,    0,    0,  126,  128,  125,    0,    0,  112,
  113,    0,    0,   66,    0,    0,   66,    0,  114,  115,
    0,  116,  117,  118,  119,    0,    0,    0,    0,  109,
   66,   66,    0,    0,    0,  128,  109,  236,    0,  112,
  113,  109,    0,    0,    0,    0,    0,    0,  114,  115,
    0,  116,  117,  118,  119,  109,    0,    0,    0,    0,
   65,  112,  113,    0,    0,   66,    0,   66,    0,    0,
  114,  115,   64,  116,  117,  118,  119,    0,    0,    0,
    0,    0,  112,  113,    0,    0,    0,  109,    0,  112,
  113,  114,  115,    0,  116,  117,  118,  119,  114,  115,
  124,  116,  117,  118,  119,  122,  120,   51,  121,  127,
  123,    0,   51,   51,    0,   51,   51,   51,   67,  109,
    0,  109,    0,  126,    0,  125,    0,    0,  124,    0,
   51,    0,   51,  122,  120,  124,  121,  127,  123,    0,
  122,  120,    0,  121,  127,  123,    0,    0,    0,    0,
   43,  126,   68,  125,  128,  112,  113,    0,  126,    0,
  125,   51,    0,    0,  114,  115,    0,  116,  117,  118,
  119,  124,    0,    0,    0,    0,  122,  120,    0,  121,
  127,  123,  128,    0,    0,    0,    0,    0,    0,  128,
    0,  112,  113,    0,  126,    0,  125,    0,    0,    0,
  114,  115,    0,  116,  117,  118,  119,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   65,    0,    0,    0,
    0,  112,  113,   66,    0,  128,    0,    0,   64,    0,
  114,  115,    0,  116,  117,  118,  119,   66,   66,   66,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   66,
   66,    0,    0,  109,  109,  109,  109,  109,  109,    0,
  109,  109,  109,  109,    0,  109,  109,  109,  109,  109,
  109,  109,  109,    0,   67,    0,  109,  109,    0,  109,
  109,  109,    0,    0,   14,   15,   16,   17,   18,   48,
    0,   49,   50,   51,   52,    0,   53,   54,   55,   56,
   57,   58,   59,    0,    0,    0,   43,   60,   61,    0,
   62,   63,   59,    0,   59,   59,   59,   58,    0,    0,
   58,    0,    0,    0,    0,    0,    0,    0,    0,   59,
   59,   59,    0,   59,   58,   58,   58,    0,   58,    0,
  112,  113,    0,    0,    0,    0,    0,   51,   51,  114,
  115,   65,  116,  117,  118,  119,   51,   51,   66,   51,
   51,   51,   51,   64,   59,    0,    0,    0,  112,   58,
    0,    0,    0,    0,    0,    0,    0,  114,  115,    0,
  116,  117,  118,  119,  114,  115,    0,  116,  117,  118,
  119,    0,    0,    0,   60,    0,   60,   60,   60,   69,
    0,    0,   69,    0,    0,    0,    0,    0,    0,   67,
    0,   60,   60,   60,    0,   60,   69,   69,    0,    0,
  114,  115,    0,  116,  117,    0,   65,    0,    0,    0,
    0,    0,    0,   66,    0,    0,    0,    0,   64,    0,
   14,   15,   16,   17,   18,   48,   60,   49,   50,   51,
   52,   69,   53,   54,   55,   56,   57,   58,   59,   64,
    0,    0,   64,   60,   61,   70,   62,   63,   70,    0,
    0,    0,    0,    0,    0,    0,   64,   64,   64,    0,
   64,    0,   70,   70,   67,   83,  108,   68,    0,    0,
   68,    0,    0,    0,    0,   67,    0,    0,   67,    0,
    0,    0,    0,   72,   68,   68,   72,    0,    0,    0,
    0,   64,   67,   67,    0,    0,    0,   70,   65,    0,
   72,   72,    0,    0,    0,   66,    0,   83,    0,    0,
   64,    0,    0,    0,    0,    0,   59,   59,   59,   68,
    0,   58,   58,   58,   93,    0,    0,   67,   59,   59,
    0,   93,    0,   58,   58,   72,   93,   59,   59,    0,
   59,   59,   59,   59,    0,   58,   58,   58,   58,    0,
    0,    0,    0,    0,   65,    0,   67,    0,   32,  106,
   48,   66,   49,    0,    0,    0,   64,    0,    0,   55,
    0,   57,   58,   59,    0,    0,    0,    0,   60,    0,
    0,   62,   93,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   83,    0,   83,    0,    0,   60,   60,
   60,    0,    0,   69,   69,   69,    0,    0,    0,    0,
   60,   60,   67,    0,    0,   69,   69,    0,   83,   60,
   60,    0,   60,   60,   60,   60,    0,    0,    0,   69,
   69,   84,   83,   83,    0,   48,    0,   49,    0,   83,
    0,    0,    0,    0,   55,    0,   57,   58,   59,   83,
   83,    0,    0,   60,    0,    0,   62,    0,    0,    0,
    0,    0,    0,   64,   64,   64,    0,    0,    0,   70,
   70,   70,    0,   84,    0,   64,   64,    0,    0,    0,
    0,   70,   70,    0,   64,   64,    0,   64,   64,   64,
   64,   68,   68,   68,    0,   70,   70,    0,    0,   67,
   67,   67,    0,   68,   68,    0,    0,   72,   72,   72,
    0,   67,   67,    0,    0,    0,    0,   68,   68,    0,
   72,    0,    0,    0,    0,   67,   67,   48,    0,   49,
    0,    0,    0,    0,    0,    0,   55,    0,   57,   58,
   59,    0,    0,    0,    0,   60,    0,    0,   62,    0,
    0,    0,    0,   93,    0,   93,    0,    0,    0,   84,
    0,   84,   93,    0,   93,   93,   93,   93,    0,    0,
    0,   93,    0,    0,   93,   92,    0,    0,    0,    0,
    0,    0,    0,   48,   84,   49,  104,  105,  107,  109,
    0,    0,   55,    0,   57,   58,   59,    0,   84,   84,
    0,   60,    0,    0,   62,   84,    0,    0,    0,    0,
  135,    0,  137,    0,    0,   84,   84,    0,    0,  142,
    0,    0,  146,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  157,  158,  159,  160,  161,  162,
  163,  164,  165,  166,  167,  168,  169,  170,  171,    0,
  172,    0,    0,    0,    0,  173,    0,    0,    0,    0,
    0,  178,    0,  181,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  142,    0,  198,    0,
    0,    0,    0,    0,  204,    0,    0,  206,    0,  207,
    0,  208,    0,    0,    0,  211,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  222,    0,    0,  224,    0,    0,    0,    0,    0,
    0,    0,  227,    0,    0,    0,    0,    0,    0,    0,
    0,  233,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         37,
    0,   41,   41,   41,   42,   43,   44,   45,   46,   47,
   67,  125,   41,   89,   40,   59,  282,   59,   91,   91,
   58,   59,   60,   61,   62,   46,   91,   37,   44,  261,
   59,   41,   42,   43,   44,   45,   46,   47,   91,  276,
  257,  258,  259,  260,  261,   40,  276,   42,   58,   59,
   60,   61,   62,   91,   13,   93,   41,   37,  125,   44,
   19,   41,   42,   43,   44,   45,  283,   47,  263,  175,
   91,  177,   41,  123,   91,   44,   93,   93,   58,   59,
   60,   91,   62,   93,   41,   37,  276,   44,   59,   41,
   42,   43,   44,   45,  200,   47,   55,  123,  155,   40,
   93,   31,   40,   33,   41,   44,   58,   59,   60,  215,
   62,   41,   91,   93,   37,  221,   41,  123,   41,   42,
   43,   44,   45,   37,   47,  231,  232,   40,   42,   43,
   40,   45,   46,   47,  191,   58,   59,   60,  214,   62,
   40,   93,   37,   40,  103,  276,   41,   42,   43,   44,
   45,   37,   47,   40,   59,   40,   42,   43,   40,   45,
   46,   47,   40,   58,   59,   60,   59,   62,   59,   59,
   93,  285,   61,  276,   37,  125,   40,   91,   41,   42,
   43,   44,   45,   41,   47,   91,   44,   41,   41,  276,
  257,  258,  259,  260,  261,   58,   59,   60,   93,   62,
   58,   59,  276,  276,  276,   91,   41,   41,   37,   40,
   44,  276,  279,   42,   43,   44,   45,   46,   47,   59,
   44,  276,   41,  276,   58,   59,  295,  265,  266,  267,
   93,   60,  276,   62,  276,   93,  276,  276,   41,  277,
  278,  276,  276,  295,   44,  262,  268,  288,  286,  287,
   41,  289,  290,  291,  292,  265,  266,  267,  275,   93,
   41,  261,   91,  261,   93,   37,  123,  277,  278,   41,
   42,   43,   59,   45,   46,   47,  286,  287,   41,  289,
  290,  291,  292,  262,   41,  265,  266,  267,   60,  276,
   62,   59,   41,    3,   13,   37,  275,  277,  278,   33,
   42,   43,  174,   45,   46,   47,  286,  287,   -1,  289,
  290,  291,  292,  265,  266,  267,   58,   -1,   60,   91,
   62,   -1,   37,   -1,   -1,  277,  278,   42,   43,   -1,
   45,   46,   47,   -1,  286,  287,   -1,  289,  290,  291,
  292,   -1,  265,  266,  267,   60,   -1,   62,   -1,   91,
   -1,   93,   37,   -1,  277,  278,   41,   42,   43,   -1,
   45,   46,   47,  286,  287,   -1,  289,  290,  291,  292,
  265,  266,  267,   -1,   59,   60,   91,   62,   93,   -1,
   -1,   -1,  277,  278,   -1,   -1,  257,  258,  259,  260,
  261,  286,  287,   -1,  289,  290,  291,  292,   -1,   -1,
  286,  287,  265,  266,  267,  276,   91,  265,  266,  267,
   -1,   -1,   37,   -1,  277,  278,   -1,   42,   -1,  277,
  278,   46,   47,  286,  287,   -1,  289,  290,  291,  292,
   37,  265,  266,  267,   41,   42,   43,  266,   45,   46,
   47,   -1,   -1,  277,  278,   -1,   -1,   -1,  277,  278,
   -1,   -1,   -1,   60,   -1,   62,   -1,  286,  287,   -1,
  289,  290,  291,  292,   -1,   -1,   91,   37,   -1,   -1,
   -1,   -1,   42,   43,   -1,   45,   46,   47,  257,  258,
  259,  260,  261,   -1,   91,   -1,   -1,   -1,   -1,   -1,
   60,   -1,   62,  265,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   37,   -1,  277,  278,   41,   42,   43,
   -1,   45,   46,   47,  286,  287,   -1,  289,  290,  291,
  292,   91,   -1,   -1,   -1,   -1,   60,   -1,   62,   -1,
   -1,   -1,   -1,   37,   -1,  277,  278,   41,   42,   43,
   -1,   45,   46,   47,  286,  287,   -1,  289,  290,  291,
  292,   -1,  267,   -1,   -1,   -1,   60,   91,   62,   37,
   -1,   -1,  277,  278,   42,   43,   44,   45,   46,   47,
   -1,  286,  287,   -1,  289,  290,  291,  292,   -1,   -1,
   -1,   -1,   60,   -1,   62,   -1,   -1,   91,   -1,   37,
   -1,   -1,  277,  278,   42,   43,   -1,   45,   46,   47,
   -1,  286,  287,   -1,  289,  290,  291,  292,   -1,   -1,
   58,   37,   60,   91,   62,   -1,   42,   43,   -1,   45,
   46,   47,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   37,   -1,   60,   -1,   62,   42,   43,   37,
   45,   46,   47,   91,   42,   43,   -1,   45,   46,   47,
   -1,   -1,   -1,   -1,   59,   60,   -1,   62,   -1,   -1,
   -1,   -1,   60,   -1,   62,   91,   -1,   93,   -1,   -1,
  277,  278,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  286,
  287,   -1,  289,  290,  291,  292,   91,   -1,   -1,   -1,
   -1,   -1,   -1,   91,   -1,   93,  266,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   37,   -1,  277,  278,   41,
   42,   43,   -1,   45,   46,   47,  286,  287,   -1,  289,
  290,  291,  292,   -1,   -1,   -1,   -1,   -1,   60,   -1,
   62,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   37,   -1,  277,  278,   41,   42,   43,   -1,   45,
   46,   47,  286,  287,   -1,  289,  290,  291,  292,   91,
   -1,   -1,   -1,   -1,   60,   -1,   62,   -1,   -1,   -1,
   -1,   37,   -1,  277,  278,   -1,   42,   43,   -1,   45,
   46,   47,  286,  287,   -1,  289,  290,  291,  292,   -1,
   -1,   -1,   -1,   -1,   60,   91,   62,   -1,   -1,  277,
  278,   -1,   -1,   41,   -1,   -1,   44,   -1,  286,  287,
   -1,  289,  290,  291,  292,   -1,   -1,   -1,   -1,   33,
   58,   59,   -1,   -1,   -1,   91,   40,   93,   -1,  277,
  278,   45,   -1,   -1,   -1,   -1,   -1,   -1,  286,  287,
   -1,  289,  290,  291,  292,   59,   -1,   -1,   -1,   -1,
   33,  277,  278,   -1,   -1,   93,   -1,   40,   -1,   -1,
  286,  287,   45,  289,  290,  291,  292,   -1,   -1,   -1,
   -1,   -1,  277,  278,   -1,   -1,   -1,   91,   -1,  277,
  278,  286,  287,   -1,  289,  290,  291,  292,  286,  287,
   37,  289,  290,  291,  292,   42,   43,   37,   45,   46,
   47,   -1,   42,   43,   -1,   45,   46,   47,   91,  123,
   -1,  125,   -1,   60,   -1,   62,   -1,   -1,   37,   -1,
   60,   -1,   62,   42,   43,   37,   45,   46,   47,   -1,
   42,   43,   -1,   45,   46,   47,   -1,   -1,   -1,   -1,
  123,   60,  125,   62,   91,  277,  278,   -1,   60,   -1,
   62,   91,   -1,   -1,  286,  287,   -1,  289,  290,  291,
  292,   37,   -1,   -1,   -1,   -1,   42,   43,   -1,   45,
   46,   47,   91,   -1,   -1,   -1,   -1,   -1,   -1,   91,
   -1,  277,  278,   -1,   60,   -1,   62,   -1,   -1,   -1,
  286,  287,   -1,  289,  290,  291,  292,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   33,   -1,   -1,   -1,
   -1,  277,  278,   40,   -1,   91,   -1,   -1,   45,   -1,
  286,  287,   -1,  289,  290,  291,  292,  265,  266,  267,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  277,
  278,   -1,   -1,  257,  258,  259,  260,  261,  262,   -1,
  264,  265,  266,  267,   -1,  269,  270,  271,  272,  273,
  274,  275,  276,   -1,   91,   -1,  280,  281,   -1,  283,
  284,  285,   -1,   -1,  257,  258,  259,  260,  261,  262,
   -1,  264,  265,  266,  267,   -1,  269,  270,  271,  272,
  273,  274,  275,   -1,   -1,   -1,  123,  280,  281,   -1,
  283,  284,   41,   -1,   43,   44,   45,   41,   -1,   -1,
   44,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   58,
   59,   60,   -1,   62,   58,   59,   60,   -1,   62,   -1,
  277,  278,   -1,   -1,   -1,   -1,   -1,  277,  278,  286,
  287,   33,  289,  290,  291,  292,  286,  287,   40,  289,
  290,  291,  292,   45,   93,   -1,   -1,   -1,  277,   93,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  286,  287,   -1,
  289,  290,  291,  292,  286,  287,   -1,  289,  290,  291,
  292,   -1,   -1,   -1,   41,   -1,   43,   44,   45,   41,
   -1,   -1,   44,   -1,   -1,   -1,   -1,   -1,   -1,   91,
   -1,   58,   59,   60,   -1,   62,   58,   59,   -1,   -1,
  286,  287,   -1,  289,  290,   -1,   33,   -1,   -1,   -1,
   -1,   -1,   -1,   40,   -1,   -1,   -1,   -1,   45,   -1,
  257,  258,  259,  260,  261,  262,   93,  264,  265,  266,
  267,   93,  269,  270,  271,  272,  273,  274,  275,   41,
   -1,   -1,   44,  280,  281,   41,  283,  284,   44,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   58,   59,   60,   -1,
   62,   -1,   58,   59,   91,   47,   93,   41,   -1,   -1,
   44,   -1,   -1,   -1,   -1,   41,   -1,   -1,   44,   -1,
   -1,   -1,   -1,   41,   58,   59,   44,   -1,   -1,   -1,
   -1,   93,   58,   59,   -1,   -1,   -1,   93,   33,   -1,
   58,   59,   -1,   -1,   -1,   40,   -1,   89,   -1,   -1,
   45,   -1,   -1,   -1,   -1,   -1,  265,  266,  267,   93,
   -1,  265,  266,  267,   33,   -1,   -1,   93,  277,  278,
   -1,   40,   -1,  277,  278,   93,   45,  286,  287,   -1,
  289,  290,  291,  292,   -1,  289,  290,  291,  292,   -1,
   -1,   -1,   -1,   -1,   33,   -1,   91,   -1,   93,  261,
  262,   40,  264,   -1,   -1,   -1,   45,   -1,   -1,  271,
   -1,  273,  274,  275,   -1,   -1,   -1,   -1,  280,   -1,
   -1,  283,   91,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  175,   -1,  177,   -1,   -1,  265,  266,
  267,   -1,   -1,  265,  266,  267,   -1,   -1,   -1,   -1,
  277,  278,   91,   -1,   -1,  277,  278,   -1,  200,  286,
  287,   -1,  289,  290,  291,  292,   -1,   -1,   -1,  291,
  292,   47,  214,  215,   -1,  262,   -1,  264,   -1,  221,
   -1,   -1,   -1,   -1,  271,   -1,  273,  274,  275,  231,
  232,   -1,   -1,  280,   -1,   -1,  283,   -1,   -1,   -1,
   -1,   -1,   -1,  265,  266,  267,   -1,   -1,   -1,  265,
  266,  267,   -1,   89,   -1,  277,  278,   -1,   -1,   -1,
   -1,  277,  278,   -1,  286,  287,   -1,  289,  290,  291,
  292,  265,  266,  267,   -1,  291,  292,   -1,   -1,  265,
  266,  267,   -1,  277,  278,   -1,   -1,  265,  266,  267,
   -1,  277,  278,   -1,   -1,   -1,   -1,  291,  292,   -1,
  278,   -1,   -1,   -1,   -1,  291,  292,  262,   -1,  264,
   -1,   -1,   -1,   -1,   -1,   -1,  271,   -1,  273,  274,
  275,   -1,   -1,   -1,   -1,  280,   -1,   -1,  283,   -1,
   -1,   -1,   -1,  262,   -1,  264,   -1,   -1,   -1,  175,
   -1,  177,  271,   -1,  273,  274,  275,  276,   -1,   -1,
   -1,  280,   -1,   -1,  283,   53,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  262,  200,  264,   64,   65,   66,   67,
   -1,   -1,  271,   -1,  273,  274,  275,   -1,  214,  215,
   -1,  280,   -1,   -1,  283,  221,   -1,   -1,   -1,   -1,
   88,   -1,   90,   -1,   -1,  231,  232,   -1,   -1,   97,
   -1,   -1,  100,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  112,  113,  114,  115,  116,  117,
  118,  119,  120,  121,  122,  123,  124,  125,  126,   -1,
  128,   -1,   -1,   -1,   -1,  133,   -1,   -1,   -1,   -1,
   -1,  139,   -1,  141,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  174,   -1,  176,   -1,
   -1,   -1,   -1,   -1,  182,   -1,   -1,  185,   -1,  187,
   -1,  189,   -1,   -1,   -1,  193,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  209,   -1,   -1,  212,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  220,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  229,
};
}
final static short YYFINAL=2;
final static short YYMAXTOKEN=295;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"'!'",null,null,null,"'%'",null,null,"'('","')'","'*'","'+'",
"','","'-'","'.'","'/'",null,null,null,null,null,null,null,null,null,null,"':'",
"';'","'<'","'='","'>'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,"'['",null,"']'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,"'{'",null,"'}'",null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,"VOID","BOOL","INT","STRING",
"CLASS","NULL","EXTENDS","THIS","WHILE","FOR","IF","ELSE","RETURN","BREAK",
"NEW","PRINT","READ_INTEGER","READ_LINE","LITERAL","IDENTIFIER","AND","OR",
"STATIC","INSTANCEOF","SCOPY","SEALED","VAR","FOREACH","GUARD","ARRAY_CONCAT",
"ARRAY_REPEAT","DEFAULT","LESS_EQUAL","GREATER_EQUAL","EQUAL","NOT_EQUAL",
"UMINUS","EMPTY","IN",
};
final static String yyrule[] = {
"$accept : Program",
"Program : ClassList",
"ClassList : ClassList ClassDef",
"ClassList : ClassDef",
"VariableDef : Variable ';'",
"Variable : Type IDENTIFIER",
"Type : INT",
"Type : VOID",
"Type : BOOL",
"Type : STRING",
"Type : CLASS IDENTIFIER",
"Type : Type '[' ']'",
"ClassDef : SealedClause CLASS IDENTIFIER ExtendsClause '{' FieldList '}'",
"SealedClause : SEALED",
"SealedClause :",
"ExtendsClause : EXTENDS IDENTIFIER",
"ExtendsClause :",
"FieldList : FieldList VariableDef",
"FieldList : FieldList FunctionDef",
"FieldList :",
"Formals : VariableList",
"Formals :",
"VariableList : VariableList ',' Variable",
"VariableList : Variable",
"FunctionDef : STATIC Type IDENTIFIER '(' Formals ')' StmtBlock",
"FunctionDef : Type IDENTIFIER '(' Formals ')' StmtBlock",
"StmtBlock : '{' StmtList '}'",
"StmtList : StmtList Stmt",
"StmtList :",
"OCStmt : SCOPY '(' IDENTIFIER ',' Expr ')'",
"Stmt : ForeachStmt",
"Stmt : OCStmt",
"Stmt : VariableDef",
"Stmt : SimpleStmt ';'",
"Stmt : IfStmt",
"Stmt : WhileStmt",
"Stmt : ForStmt",
"Stmt : ReturnStmt ';'",
"Stmt : PrintStmt ';'",
"Stmt : BreakStmt ';'",
"Stmt : StmtBlock",
"Stmt : GuardedStmt",
"SimpleStmt : LValue '=' Expr",
"SimpleStmt : Call",
"SimpleStmt :",
"Receiver : Expr '.'",
"Receiver :",
"LValue : Receiver IDENTIFIER",
"LValue : Expr '[' Expr ']'",
"LValue : VAR IDENTIFIER",
"Call : Receiver IDENTIFIER '(' Actuals ')'",
"Expr : LValue",
"Expr : Call",
"Expr : Constant",
"Expr : '[' Expr FOR IDENTIFIER IN Expr ']'",
"Expr : '[' Expr FOR IDENTIFIER IN Expr IF Expr ']'",
"Expr : Expr '[' Expr ']' DEFAULT Expr",
"Expr : Expr '[' Expr ':' Expr ']'",
"Expr : Expr ARRAY_CONCAT Expr",
"Expr : Expr '+' Expr",
"Expr : Expr '-' Expr",
"Expr : Expr '*' Expr",
"Expr : Expr '/' Expr",
"Expr : Expr '%' Expr",
"Expr : Expr ARRAY_REPEAT Expr",
"Expr : Expr EQUAL Expr",
"Expr : Expr NOT_EQUAL Expr",
"Expr : Expr '<' Expr",
"Expr : Expr '>' Expr",
"Expr : Expr LESS_EQUAL Expr",
"Expr : Expr GREATER_EQUAL Expr",
"Expr : Expr AND Expr",
"Expr : Expr OR Expr",
"Expr : '(' Expr ')'",
"Expr : '-' Expr",
"Expr : '!' Expr",
"Expr : READ_INTEGER '(' ')'",
"Expr : READ_LINE '(' ')'",
"Expr : THIS",
"Expr : NEW IDENTIFIER '(' ')'",
"Expr : NEW Type '[' Expr ']'",
"Expr : INSTANCEOF '(' Expr ',' IDENTIFIER ')'",
"Expr : '(' CLASS IDENTIFIER ')' Expr",
"Constant : LITERAL",
"Constant : ArrayConstant",
"Constant : NULL",
"ConstantList : ConstantList ',' Constant",
"ConstantList : Constant",
"ArrayConstant : '[' ConstantList ']'",
"ArrayConstant : '[' ']'",
"GuardedStmt : IF '{' IfBranch IfSubStmt '}'",
"GuardedStmt : IF '{' '}'",
"IfBranch : IfBranch IfSubStmt GUARD",
"IfBranch :",
"IfSubStmt : Expr ':' Stmt",
"ForeachStmt : FOREACH '(' BoundVariable IN Expr ')' Stmt",
"ForeachStmt : FOREACH '(' BoundVariable IN Expr WHILE Expr ')' Stmt",
"BoundVariable : VARTYPE IDENTIFIER",
"BoundVariable : Type IDENTIFIER",
"VARTYPE : VAR",
"Actuals : ExprList",
"Actuals :",
"ExprList : ExprList ',' Expr",
"ExprList : Expr",
"WhileStmt : WHILE '(' Expr ')' Stmt",
"ForStmt : FOR '(' SimpleStmt ';' Expr ';' SimpleStmt ')' Stmt",
"BreakStmt : BREAK",
"IfStmt : IF '(' Expr ')' Stmt ElseClause",
"ElseClause : ELSE Stmt",
"ElseClause :",
"ReturnStmt : RETURN Expr",
"ReturnStmt : RETURN",
"PrintStmt : PRINT '(' ExprList ')'",
};

//#line 568 "Parser.y"
    
	/**
	 * 打印当前归约所用的语法规则<br>
	 * 请勿修改。
	 */
    public boolean onReduce(String rule) {
		if (rule.startsWith("$$"))
			return false;
		else
			rule = rule.replaceAll(" \\$\\$\\d+", "");

   	    if (rule.endsWith(":"))
    	    System.out.println(rule + " <empty>");
   	    else
			System.out.println(rule);
		return false;
    }
    
    public void diagnose() {
		addReduceListener(this);
		yyparse();
	}
//#line 794 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    //if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      //if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        //if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        //if (yychar < 0)    //it it didn't work/error
        //  {
        //  yychar = 0;      //change it to default string (no -1!)
          //if (yydebug)
          //  yylexdebug(yystate,yychar);
        //  }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        //if (yydebug)
          //debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      //if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0 || valptr<0)   //check for under & overflow here
            {
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            //if (yydebug)
              //debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            //if (yydebug)
              //debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0 || valptr<0)   //check for under & overflow here
              {
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        //if (yydebug)
          //{
          //yys = null;
          //if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          //if (yys == null) yys = "illegal-symbol";
          //debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          //}
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    //if (yydebug)
      //debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    if (reduceListener == null || reduceListener.onReduce(yyrule[yyn])) // if intercepted!
      switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 58 "Parser.y"
{
						tree = new Tree.TopLevel(val_peek(0).clist, val_peek(0).loc);
					}
break;
case 2:
//#line 64 "Parser.y"
{
						yyval.clist.add(val_peek(0).cdef);
					}
break;
case 3:
//#line 68 "Parser.y"
{
                		yyval.clist = new ArrayList<Tree.ClassDef>();
                		yyval.clist.add(val_peek(0).cdef);
                	}
break;
case 5:
//#line 78 "Parser.y"
{
						yyval.vdef = new Tree.VarDef(val_peek(0).ident, val_peek(1).type, val_peek(0).loc);
					}
break;
case 6:
//#line 84 "Parser.y"
{
						yyval.type = new Tree.TypeIdent(Tree.INT, val_peek(0).loc);
					}
break;
case 7:
//#line 88 "Parser.y"
{
                		yyval.type = new Tree.TypeIdent(Tree.VOID, val_peek(0).loc);
                	}
break;
case 8:
//#line 92 "Parser.y"
{
                		yyval.type = new Tree.TypeIdent(Tree.BOOL, val_peek(0).loc);
                	}
break;
case 9:
//#line 96 "Parser.y"
{
                		yyval.type = new Tree.TypeIdent(Tree.STRING, val_peek(0).loc);
                	}
break;
case 10:
//#line 100 "Parser.y"
{
                		yyval.type = new Tree.TypeClass(val_peek(0).ident, val_peek(1).loc);
                	}
break;
case 11:
//#line 104 "Parser.y"
{
                		yyval.type = new Tree.TypeArray(val_peek(2).type, val_peek(2).loc);
                	}
break;
case 12:
//#line 110 "Parser.y"
{
						yyval.cdef = new Tree.ClassDef(val_peek(6).ident, val_peek(4).ident, val_peek(3).ident, val_peek(1).flist, val_peek(6).loc);
					}
break;
case 13:
//#line 116 "Parser.y"
{
						yyval.ident = "sealed";
					}
break;
case 14:
//#line 120 "Parser.y"
{
						yyval = new SemValue();
					}
break;
case 15:
//#line 126 "Parser.y"
{
						yyval.ident = val_peek(0).ident;
					}
break;
case 16:
//#line 130 "Parser.y"
{
                		yyval = new SemValue();
                	}
break;
case 17:
//#line 136 "Parser.y"
{
						yyval.flist.add(val_peek(0).vdef);
					}
break;
case 18:
//#line 140 "Parser.y"
{
						yyval.flist.add(val_peek(0).fdef);
					}
break;
case 19:
//#line 144 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.flist = new ArrayList<Tree>();
                	}
break;
case 21:
//#line 152 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.vlist = new ArrayList<Tree.VarDef>(); 
                	}
break;
case 22:
//#line 159 "Parser.y"
{
						yyval.vlist.add(val_peek(0).vdef);
					}
break;
case 23:
//#line 163 "Parser.y"
{
                		yyval.vlist = new ArrayList<Tree.VarDef>();
						yyval.vlist.add(val_peek(0).vdef);
                	}
break;
case 24:
//#line 170 "Parser.y"
{
						yyval.fdef = new MethodDef(true, val_peek(4).ident, val_peek(5).type, val_peek(2).vlist, (Block) val_peek(0).stmt, val_peek(4).loc);
					}
break;
case 25:
//#line 174 "Parser.y"
{
						yyval.fdef = new MethodDef(false, val_peek(4).ident, val_peek(5).type, val_peek(2).vlist, (Block) val_peek(0).stmt, val_peek(4).loc);
					}
break;
case 26:
//#line 180 "Parser.y"
{
						yyval.stmt = new Block(val_peek(1).slist, val_peek(2).loc);
						
					}
break;
case 27:
//#line 187 "Parser.y"
{
						yyval.slist.add(val_peek(0).stmt);
					}
break;
case 28:
//#line 191 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.slist = new ArrayList<Tree>();
                	}
break;
case 29:
//#line 198 "Parser.y"
{
						yyval.stmt = new OCStmt(val_peek(3).ident, val_peek(1).expr, val_peek(5).loc);
					}
break;
case 30:
//#line 203 "Parser.y"
{
						yyval.stmt = val_peek(0).foreachStmt;
					}
break;
case 31:
//#line 207 "Parser.y"
{
						yyval.stmt = val_peek(0).stmt;
					}
break;
case 32:
//#line 211 "Parser.y"
{
						yyval.stmt = val_peek(0).vdef;
					}
break;
case 33:
//#line 216 "Parser.y"
{
                		if (yyval.stmt == null) {
                			yyval.stmt = new Tree.Skip(val_peek(0).loc);
                		}
                	}
break;
case 42:
//#line 233 "Parser.y"
{
						yyval.stmt = new Tree.Assign(val_peek(2).lvalue, val_peek(0).expr, val_peek(1).loc);
					}
break;
case 43:
//#line 237 "Parser.y"
{
                		yyval.stmt = new Tree.Exec(val_peek(0).expr, val_peek(0).loc);
                	}
break;
case 44:
//#line 241 "Parser.y"
{
                		yyval = new SemValue();
                	}
break;
case 46:
//#line 248 "Parser.y"
{
                		yyval = new SemValue();
                	}
break;
case 47:
//#line 254 "Parser.y"
{
						yyval.lvalue = new Tree.Ident(val_peek(1).expr, val_peek(0).ident, val_peek(0).loc);
						if (val_peek(1).loc == null) {
							yyval.loc = val_peek(0).loc;
						}
					}
break;
case 48:
//#line 261 "Parser.y"
{
                		yyval.lvalue = new Tree.Indexed(val_peek(3).expr, val_peek(1).expr, val_peek(3).loc);
                	}
break;
case 49:
//#line 265 "Parser.y"
{
                		yyval.lvalue = new Tree.VarIdent(val_peek(0).ident, val_peek(1).loc);
                	}
break;
case 50:
//#line 271 "Parser.y"
{
						yyval.expr = new Tree.CallExpr(val_peek(4).expr, val_peek(3).ident, val_peek(1).elist, val_peek(3).loc);
						if (val_peek(4).loc == null) {
							yyval.loc = val_peek(3).loc;
						}
					}
break;
case 51:
//#line 280 "Parser.y"
{
						yyval.expr = val_peek(0).lvalue;
					}
break;
case 54:
//#line 286 "Parser.y"
{
                		yyval.expr = new Tree.PyArray(val_peek(5).expr, val_peek(3).ident, val_peek(1).expr, new Literal(Tree.BOOL, true, val_peek(1).loc), val_peek(6).loc);
                	}
break;
case 55:
//#line 290 "Parser.y"
{
                		yyval.expr = new Tree.PyArray(val_peek(7).expr, val_peek(5).ident, val_peek(3).expr, val_peek(1).expr, val_peek(8).loc);
                	}
break;
case 56:
//#line 294 "Parser.y"
{
                		yyval.expr = new Tree.IndexedDefault(val_peek(5).expr, val_peek(3).expr, val_peek(0).expr, val_peek(5).loc);
                	}
break;
case 57:
//#line 298 "Parser.y"
{
                		yyval.expr = new Tree.SubArray(val_peek(5).expr, val_peek(3).expr, val_peek(1).expr, val_peek(5).loc);
                	}
break;
case 58:
//#line 302 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.ARRAYCONCAT, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 59:
//#line 306 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.PLUS, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 60:
//#line 310 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.MINUS, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 61:
//#line 314 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.MUL, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 62:
//#line 318 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.DIV, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 63:
//#line 322 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.MOD, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 64:
//#line 326 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.ARRAYREPEAT, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 65:
//#line 330 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.EQ, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                		
                	}
break;
case 66:
//#line 335 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.NE, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 67:
//#line 339 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.LT, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 68:
//#line 343 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.GT, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 69:
//#line 347 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.LE, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 70:
//#line 351 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.GE, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 71:
//#line 355 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.AND, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 72:
//#line 359 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.OR, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 73:
//#line 363 "Parser.y"
{
                		yyval = val_peek(1);
                	}
break;
case 74:
//#line 367 "Parser.y"
{
                		yyval.expr = new Tree.Unary(Tree.NEG, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 75:
//#line 371 "Parser.y"
{
                		yyval.expr = new Tree.Unary(Tree.NOT, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 76:
//#line 375 "Parser.y"
{
                		yyval.expr = new Tree.ReadIntExpr(val_peek(2).loc);
                	}
break;
case 77:
//#line 379 "Parser.y"
{
                		yyval.expr = new Tree.ReadLineExpr(val_peek(2).loc);
                	}
break;
case 78:
//#line 383 "Parser.y"
{
                		yyval.expr = new Tree.ThisExpr(val_peek(0).loc);
                	}
break;
case 79:
//#line 387 "Parser.y"
{
                		yyval.expr = new Tree.NewClass(val_peek(2).ident, val_peek(3).loc);
                	}
break;
case 80:
//#line 391 "Parser.y"
{
                		yyval.expr = new Tree.NewArray(val_peek(3).type, val_peek(1).expr, val_peek(4).loc);
                	}
break;
case 81:
//#line 395 "Parser.y"
{
                		yyval.expr = new Tree.TypeTest(val_peek(3).expr, val_peek(1).ident, val_peek(5).loc);
                	}
break;
case 82:
//#line 399 "Parser.y"
{
                		yyval.expr = new Tree.TypeCast(val_peek(2).ident, val_peek(0).expr, val_peek(0).loc);
                	}
break;
case 83:
//#line 405 "Parser.y"
{
						yyval.expr = new Tree.Literal(val_peek(0).typeTag, val_peek(0).literal, val_peek(0).loc);
					}
break;
case 84:
//#line 409 "Parser.y"
{
						yyval.expr = val_peek(0).expr;
					}
break;
case 85:
//#line 413 "Parser.y"
{
						yyval.expr = new Null(val_peek(0).loc);
					}
break;
case 86:
//#line 421 "Parser.y"
{
						yyval.clist1.add(val_peek(0).expr);
					}
break;
case 87:
//#line 425 "Parser.y"
{
						yyval.clist1 = new ArrayList<Expr> ();
						yyval.clist1.add(val_peek(0).expr);
					}
break;
case 88:
//#line 432 "Parser.y"
{
						yyval.expr = new ArrayConstant(val_peek(1).clist1, val_peek(2).loc);
					}
break;
case 89:
//#line 436 "Parser.y"
{
						yyval.expr = new ArrayConstant(new ArrayList<Expr> (), val_peek(1).loc);
					}
break;
case 90:
//#line 443 "Parser.y"
{
						val_peek(2).ilist.add(val_peek(1).ifSubStmt);
						yyval.stmt = new GuardStmt(val_peek(2).ilist, val_peek(4).loc);
						
					}
break;
case 91:
//#line 449 "Parser.y"
{
						yyval.stmt = new GuardStmt(new ArrayList<IfSubStmt> (), val_peek(2).loc);
					}
break;
case 92:
//#line 455 "Parser.y"
{
						yyval.ilist.add(val_peek(1).ifSubStmt);
					}
break;
case 93:
//#line 459 "Parser.y"
{
						yyval.ilist = new ArrayList<IfSubStmt> ();
					}
break;
case 94:
//#line 465 "Parser.y"
{
						
						yyval.ifSubStmt = new IfSubStmt(val_peek(2).expr, val_peek(0).stmt, val_peek(2).loc);
					}
break;
case 95:
//#line 472 "Parser.y"
{
						yyval.foreachStmt = new ForeachStmt(val_peek(4).boundVariable, val_peek(2).expr, new Literal(Tree.BOOL, "true", val_peek(2).loc), val_peek(0).stmt, val_peek(6).loc);
					}
break;
case 96:
//#line 476 "Parser.y"
{
						yyval.foreachStmt = new ForeachStmt(val_peek(6).boundVariable, val_peek(4).expr, val_peek(2).expr, val_peek(0).stmt, val_peek(8).loc);
					}
break;
case 97:
//#line 482 "Parser.y"
{
						yyval.boundVariable = new BoundVariable(val_peek(1).type, val_peek(0).ident, val_peek(1).loc);
					}
break;
case 98:
//#line 486 "Parser.y"
{
						yyval.boundVariable = new BoundVariable(val_peek(1).type, val_peek(0).ident, val_peek(1).loc);
					}
break;
case 99:
//#line 492 "Parser.y"
{
						yyval.type = new Tree.TypeIdent(Tree.VAR, val_peek(0).loc);
					}
break;
case 101:
//#line 500 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.elist = new ArrayList<Tree.Expr>();
                	}
break;
case 102:
//#line 507 "Parser.y"
{
						yyval.elist.add(val_peek(0).expr);
					}
break;
case 103:
//#line 511 "Parser.y"
{
                		yyval.elist = new ArrayList<Tree.Expr>();
						yyval.elist.add(val_peek(0).expr);
                	}
break;
case 104:
//#line 518 "Parser.y"
{
						yyval.stmt = new Tree.WhileLoop(val_peek(2).expr, val_peek(0).stmt, val_peek(4).loc);
					}
break;
case 105:
//#line 524 "Parser.y"
{
						yyval.stmt = new Tree.ForLoop(val_peek(6).stmt, val_peek(4).expr, val_peek(2).stmt, val_peek(0).stmt, val_peek(8).loc);
					}
break;
case 106:
//#line 530 "Parser.y"
{
						yyval.stmt = new Tree.Break(val_peek(0).loc);
					}
break;
case 107:
//#line 536 "Parser.y"
{
						yyval.stmt = new Tree.If(val_peek(3).expr, val_peek(1).stmt, val_peek(0).stmt, val_peek(5).loc);
					}
break;
case 108:
//#line 542 "Parser.y"
{
						yyval.stmt = val_peek(0).stmt;
					}
break;
case 109:
//#line 546 "Parser.y"
{
						yyval = new SemValue();
					}
break;
case 110:
//#line 552 "Parser.y"
{
						yyval.stmt = new Tree.Return(val_peek(0).expr, val_peek(1).loc);
					}
break;
case 111:
//#line 556 "Parser.y"
{
                		yyval.stmt = new Tree.Return(null, val_peek(0).loc);
                	}
break;
case 112:
//#line 562 "Parser.y"
{
						yyval.stmt = new Print(val_peek(1).elist, val_peek(3).loc);
					}
break;
//#line 1549 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    //if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      //if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        //if (yychar<0) yychar=0;  //clean, if necessary
        //if (yydebug)
          //yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      //if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
//## The -Jnorun option was used ##
//## end of method run() ########################################



//## Constructors ###############################################
//## The -Jnoconstruct option was used ##
//###############################################################



}
//################### END OF CLASS ##############################