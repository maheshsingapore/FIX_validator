grammar FixRules;

rules: rule+;

ifRule          : onlyIf tag stmt (andOr openBracket? tag stmt closeBracket?)*;
rule            :  tag stmt (ifRule)? ';' (ACTION_DIRECTOR action)? NEWLINE?;

stmt            : listOperator list
                | monoOperandOperator tagStmt
                | monoOperandOperator monoOperand
                | logicalCondition;

action          : 'INCOMPLETE' | 'INVALID' | 'INCONSISTENT' | 'NOTUNIQ';

tagStmt         : tag ('+' tag)+;

monoOperandOperator       :   EQ|GR|GE|LS|LE|NE|MT;
monoOperand : operand | tag;

tag : 'tag(' INT ')' ;

operand : FLOAT | INT | STRING;

biOperandOperator: between;
biOperand: '(' FLOAT ','FLOAT')'
         | '(' INT ','INT')'
         | '(' date ','date')';

listOperator: not? 'in';
list: '['? operand (',' operand)* ']'?;

logicalCondition: logicalOperator logicalOperand ( andOr openBracket* logicalCondition closeBracket* )*;

logicalOperator: is|mustBe|mustNotBe;
logicalOperand: present|absent|mandatory|valid|consistent|numeric|alphanumeric|before|after
                |listOperator list
                |biOperandOperator biOperand
                |greaterThan monoOperand
                |lessThan monoOperand
                |equalTo monoOperand
                |match stringOperand
                ;

stringOperand: STRING;

andOr : and|or;
or: 'or ';
and: 'and ';
not: 'not ';
is :  'is ' not?;
mustBe: 'must be';
mustNotBe: 'must not be';

between: 'between';
equalTo: 'equal to';
match : 'match';
greaterThan: 'greater than';
lessThan: 'less than';

present: 'present';
absent: 'absent';
alphanumeric: 'alphanumeric';
mandatory: 'mandatory';
valid: 'valid';
consistent: 'consistent';
numeric : 'numeric';

before: 'before ' date;
after: 'after ' date;

dateToday: 'today';
dateTomorrow: 'tomorrow';
dateYesterday: 'yesterday';

date: dateToday | dateTomorrow | dateYesterday;

onlyIf: 'if ';

openBracket:'{';
closeBracket: '}';

//Lexer rules
ID      :   [a-zA-Z]+ ;                             // match identifiers
INT     :   '-'? [0-9]+;                            // match integers
FLOAT   :   '0'..'9'+('.'('0'..'9')*)? ;            // match float
NEWLINE :'\r'? '\n' ;                               // return newlines to parser (end-statement signal)
WS      : [ \t\n\r]+ -> skip ;                       // toss out whitespace
EQ      :   '=';
GR      : '>';
GE      : '>=';
LS      : '<';
LE      : '<=';
NE      : '!=';
MT      : '~=';
T       : 't'|'T';
A       : 'a'|'A';
G       : 'g'|'G';
STRING  : '"' (' '..'~')* '"';
ACTION_DIRECTOR : '->';
