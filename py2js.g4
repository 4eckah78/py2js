grammar py2js;
/*
 * Parser Rules
 */

start                       : commentText* variableDeclarations? methodDeclarations? EOF ;
variableDeclarations        : globalVariableDeclaration+ commentText* ;
methodDeclarations          : methodDeclaration+ ;

globalVariableDeclaration   : variableName '=' expr commentText? ;
methodDeclaration           : methodHeader methodBody commentText* ;
methodHeader                : 'def' methodName parameters ':' commentText? ;
parameters                  : '(' typedargslist? ')' ;
typedargslist               : arg ( '=' expr )? ( ',' arg ( '=' expr )? )* ;
arg                         : variableName | variableValue ;
methodBody                  : '{' statement* '}' ; 

expr                        : assign                                     # assignop
                            | '(' expr ')'                               # bracketsop
                            | expr '**' expr                             # deg
                            | unaryExpr                                  # unoExpr
                            | expr op=('*'|'/'|'%'|'//') expr            # mulop
                            | expr op=('+'|'-') expr                     # sumop
                            | expr op=('<<'|'>>') expr                   # arrowsop
                            | expr '&' expr                              # bitmulop
                            | expr '^' expr                              # xorop
                            | expr '|' expr                              #  sumop
                            | expr op=('<'|'>'|'<='|'>='|'=='|'!=') expr # comparisop
                            | expr 'and' expr                            # andop
                            | expr 'or' expr                             # orop
                            ;

assign                      : variableName ('=' | augassign) expr ;

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
 | '**=' 
 ;

unaryExpr                   : variableValue                                 # varvalue
                            | op=('~'|'not'|'-'|'+') unaryExpr              # unoop
                            ;

variableValue               : variableName                                  # varname
                            | variableName '[' expr ']'                     # arrcall
                            | '(' expr ')'                                  # bracketsval
                            | variableName parameters                       # funcall
                            | BOOL                                          # boolval
                            | NUMBER                                        # numval
                            | STRING                                        # strval
                            | '[' variableValue (',' variableValue)* ']'    # listval
                            ;

methodName                  : WORD ;
variableName                : WORD ;

statement                   : emdeddedStatement commentText? ;

emdeddedStatement           : methodCall            
                            | passStatement
                            | continueStatement
                            | breakStatement
                            | returnStatement
                            | commentText
                            | assign
                            | ifStatement
                            | forStatement
                            | whileStatement
                            | yieldStatement
                            | arrayStatement
                            ;
                            
arrayStatement              : variableName '[' expr ']' ('=' | augassign) expr ;
methodCall                  : methodName parameters ;
ifStatement                 : 'if' expr ':' methodBody (elifStatement)* (elseStatement)? ;
passStatement               : PASS ;
continueStatement           : 'continue' ;
returnStatement             : 'return' expr ;
yieldStatement              : 'yield' unaryExpr ;
breakStatement              : 'break' ;
whileStatement              : 'while' expr ':' methodBody ;
forStatement                : 'for' variableName 'in' 'range' '(' variableValueList ')' ':' methodBody ;
variableValueList           : variableValue (',' variableValue (',' variableValue)? )? ;
expr_list                   : expr (',' expr)* ;

elifStatement               :'elif' expr ':' methodBody ;
elseStatement               :'else:' methodBody ;

commentText                 : COMMENT ;



/*
 * Lexer Rules
 */

PASS                        : 'pass' -> skip ;
NUMBER                      : [0-9]+ ('.' [0-9]*)* ;
BOOL                        : 'True' | 'False' ;
STRING                      : '"' .*? '"' | '\'' .*? '\'' ;
WORD                        : [a-zA-Z_] [a-zA-Z0-9_.]* ;
WHITESPACE                  : (' ')+ -> skip ;
NL                          : ('\r'? '\n' | '\r')+ -> skip ; // NEWLINE
COMMENT                     : '#' ~[\r\n\f]* ;
ANY                         : . ;       
