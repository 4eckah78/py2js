grammar py2js;
/*
 * Parser Rules
 */
tokens { INDENT, DEDENT }

/*
 * parser rules
 */

start:  (NEWLINE | stmt)* EOF;

funcdef: DEF NAME parameters ( '->' test )? ':' suite;
parameters: '(' typedargslist? ')';
typedargslist
 : tfpdef ( '=' test )? ( ',' tfpdef ( '=' test )? )* ( ',' ( '*' tfpdef? ( ',' tfpdef ( '=' test )? )* ( ',' '**' tfpdef )? 
                                                            | '**' tfpdef 
                                                            )? 
                                                      )?
 | '*' tfpdef? ( ',' tfpdef ( '=' test )? )* ( ',' '**' tfpdef )? 
 | '**' tfpdef;

tfpdef: NAME ( ':' test )?;

stmt: simple_stmt | compound_stmt;

simple_stmt: small_stmt NEWLINE;

small_stmt
 : expr_stmt 
 | pass_stmt 
 | flow_stmt 
 | import_stmt 
 | assert_stmt;

expr_stmt
: testlist_star_expr ( augassign (testlist) 
                     | ( '=' testlist_star_expr)*
                     );       
testlist_star_expr: ( test | arith_expr ) ( ',' ( test |  arith_expr ) )* ','?;

testlist
 : test ( ',' test )* ','?
 ;

augassign
 : '+=' 
 | '-=' 
 | '*='
 | '/=' 
 | '%=' 
 | '&=' 
 | '|=' 
 | '^=' 
 | '<<=' 
 | '>>=' 
 | '**=';
pass_stmt: PASS;
flow_stmt
 : break_stmt 
 | continue_stmt 
 | return_stmt 
 | raise_stmt 
 | yield_stmt;
break_stmt: BREAK;
continue_stmt: CONTINUE;
return_stmt: RETURN testlist?;
yield_stmt: YIELD NAME;
raise_stmt: RAISE; // --->  throw in js

import_stmt: import_name | import_from;
import_name: IMPORT NAME;
import_from                             // import * as user from './user.js';
 : FROM ( ( '.' | '...' )* NAME
        | ('.' | '...')+ 
        )
   IMPORT ( '*' 
          | import_as_name
          )         
 ;
import_as_name: NAME ( AS NAME )?;
assert_stmt: ASSERT test;

compound_stmt
 : if_stmt 
 | while_stmt 
 | for_stmt 
//  | try_stmt
//  | with_stmt 
 | funcdef 
//  | classdef 
//  | decorated
 ;

if_stmt: IF test ':' suite ( ELIF test ':' suite )* ( ELSE ':' suite )?;
while_stmt: WHILE test ':' suite;
for_stmt: FOR NAME IN testlist ':' suite;

suite
 : simple_stmt 
 | NEWLINE INDENT stmt+ DEDENT;

test: or_test;//| lambdef;
test_nocond: or_test; //| lambdef_nocond;

// lambdef: LAMBDA varargslist? ':' test; // varargslist almost the same as typedargslist

// lambdef_nocond: LAMBDA varargslist? ':' test_nocond;

or_test: and_test ( OR and_test )*;
and_test: not_test ( AND not_test )*;
not_test: NOT not_test | comparison;
comparison: arith_expr ( comp_op arith_expr )*;
comp_op
 : '<'
 | '>'
 | '=='
 | '>='
 | '<='
 | '!='
 ;
arith_expr
 : term ( '+' term | '-' term )*
 ;

term
 : factor ( '*' factor
          | '/' factor
          | '%' factor 
          | '//' factor 
          )*
 ;
 
factor
 : '+' factor 
 | '-' factor 
 ;

atom
 : NAME 
 | NUMBER 
 | STRING 
 | NONE
 | TRUE
 | FALSE
 ;

exprlist
 : arith_expr ( ',' arith_expr )* ','?
 ;

/*
 * lexer rules
 */

DEF : 'def';
RETURN : 'return';
RAISE : 'raise';
FROM : 'from';
IMPORT : 'import';
AS : 'as';
ASSERT : 'assert';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
IN : 'in';
LAMBDA : 'lambda';
OR : 'or';
AND : 'and';
NOT : 'not';
NONE : 'None';
TRUE : 'True';
FALSE : 'False';
YIELD : 'yield';
PASS : 'pass';
CONTINUE : 'continue';
BREAK : 'break';

NEWLINE : ( '\r'? '\n' | '\r' | '\f' ) SPACES?;
SPACES: [ \t]+ ;
NAME: [a-zA-Z_] [a-zA-Z0-9_]* ;
STRING: '\'' (~[\\\r\n\f'] )* '\''
       | '"' (~[\\\r\n\f"] )* '"';
NUMBER: [0-9]+ ('.' [0-9]+)?;

SKIP_: (SPACES) -> skip;

COMMENT : '#' ~[\r\n\f]* ;