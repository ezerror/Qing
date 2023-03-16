// 定义语言名称
grammar Qing;

// 定义解析规则
// 根规则:所有的代码文本只有`variable`和`print`两种类型,EOF表示文件结束
compilationUnit : classDeclaration  EOF;
classDeclaration : CLASS_IDENTIFIER className '{' classBody '}';
classBody :  ( function )* ;


functionName : ID;
parameterName : ID;
function: functionDeclaration '{' (functionStatement SEMICOLON)* '}' ;
functionDeclaration: FUCTION_IDENTIFIER functionName '(' parametersList? ')'  functionReturn;
parametersList: parameter (',' parameter)*;
parameter: parameterName COLON type;
functionReturn: (POINT type)?;
functionStatement : variableDeclarationStatement | printStatement |returnStatement;




variableDeclarationStatement : (type | VAR_IDENTIFIER) name EQUALS expression;
printStatement : PRINT expression ;
returnStatement: RETURN expression;




name :ID;
expression : variableReference #VarReference
           | value        #ValueExpr
           ;
variableReference : ID ;



value : NUMBER | STRING ; //must be NUMBER or STRING value (defined below)


type: primitiveType;
primitiveType: 'boolean' ('[' ']')* |
               'string' ('[' ']')*|
               'char' ('[' ']')*|
               'byte' ('[' ']')*| 
               'short' ('[' ']')*|
               'int' ('[' ']')*|
               'long' ('[' ']')*|                   
               'float' ('[' ']')*|   
               'double' ('[' ']')*|  
               'void' ('[' ']')* ;


// 符号规则，代码切割为符号的规则
CLASS_IDENTIFIER : 'type';
FUCTION_IDENTIFIER : 'fn';
VAR_IDENTIFIER : 'var' ;

RETURN : 'return';
PRINT : 'print' ;
EQUALS : '=' ;
NUMBER : [0-9]+ ; // 数字
STRING : '"'~('"')*'"' ; // "任意值"
ID : [a-zA-Z0-9]+ ; // 需要是字母和数字值
WS: [ \t\n\r]+ -> skip ; // 用来过滤空行的特殊符号
className : ID ;




STRING_DOUBLEQUOTE:'"';
COLON:':';
SEMICOLON:';';
POINT:'->';
