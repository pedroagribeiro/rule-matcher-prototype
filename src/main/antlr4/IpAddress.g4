grammar IpAddress;

/*
 * Parser rules
*/
expression: complex_expression EOF;
complex_expression: (IP_ADDRESS_SINGLE_EXPRESSION | IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION) WHITESPACE* (LOGIC_AND | LOGIC_OR)? WHITESPACE* complex_expression?;

/*
 * Lexer rules
*/
EQUAL       : 'eq';
GREATER_THAN: 'gt';
LOWER_THAN  : 'lt';
STARTSWITH  : 'startswith';
ENDSWITH    : 'endswith';

LOGIC_AND   : 'and';
LOGIC_OR    : 'or';

IP_ADDRESS_REGULAR_EXPRESSION: '^(?:[0-9]{1,3}.){3}[0-9]{1,3}$';
IP_ADDRESS_SINGLE_EXPRESSION: (EQUAL | GREATER_THAN | LOWER_THAN) WHITESPACE IP_ADDRESS_REGULAR_EXPRESSION;
IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION: (STARTSWITH | ENDSWITH) WHITESPACE WORD;

WORD         : ~[\])]+;
WHITESPACE   : (' ' | '\t') ;
NEWLINE      : ('\r'? '\n' | '\r')+ ;