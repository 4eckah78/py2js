grammar py2js;
/*
 * Parser Rules
 */

start                       : methodDeclarations? | EOF ;
methodDeclarations          : methodDeclaration+ ;
methodDeclaration           : methodHeader methodBody ;
methodHeader                : 'def' methodName '(' ')' ':' NEWLINE*;
methodBody                  : statement* ;
statement                   : emdeddedStatement NEWLINE*;
emdeddedStatement                  
                            : localVariableDeclaration
                            | methodCall
                             ;

localVariableDeclaration    : variableName '=' variableValue ;
methodCall                  : methodName '(' ')' ;
methodName                  : WORD ;
variableName                : WORD ;
variableValue               
                            : BOOL 
                            | INT
                            | STRING
                            ;

/*
 * Lexer Rules
 */

INT                         : ('-')? [0-9]+;
BOOL                        : 'True' | 'False' ;
STRING                      : '"' .*? '"' ;
WORD                        : [a-zA-Z]+ ;
WHITESPACE                  : (' ')+ -> skip;
NEWLINE                     : ('\r'? '\n' | '\r')+ ;
ANY                         : . ;       
IDENT                       : '\t' ;