// 定义语言名称
grammar Qing;

// 定义解析规则
// 根规则:所有的代码文本只有`variable`和`print`两种类型,EOF表示文件结束
compilationUnit : ( variable | print )* EOF;
// 声明赋值语句，例: var a = 5
variable : VARIABLE ID EQUALS value;
// 打印语句，例: print a
print : PRINT ID ;
value : NUMBER | STRING ; //must be NUMBER or STRING value (defined below)

// 符号规则，代码切割为符号的规则
VARIABLE : 'var' ;
PRINT : 'print' ;
EQUALS : '=' ;
NUMBER : [0-9]+ ; // 数字
STRING : '"'.*'"' ; // "任意值"
ID : [a-zA-Z0-9]+ ; // 需要是字母和数字值
WS: [ \t\n\r]+ -> skip ; // 用来过滤空行的特殊符号
