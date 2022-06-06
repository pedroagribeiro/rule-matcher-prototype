grammar firmwareVersion;

/*
 * Parser rules
*/
expression: complex_expression EOF ;
complex_expression: (SEMANTIC_VERSION_EXPRESSION | PARTIAL_SEMANTIC_VERSION_EXPRESSION) WHITESPACE* (LOGIC_AND | LOGIC_OR)? WHITESPACE* complex_expression? ;


/*
 * Lexer rules
*/
EQUAL        : 'eq';
GREATER_THAN : 'gt';
LOWER_THAN   : 'lt';
MAJOR        : 'major';
MINOR        : 'minor';
PATCH        : 'patch';
NUMBER       : [0-9]+;

LOGIC_AND    : 'and';
LOGIC_OR     : 'or';

SEMANTIC_VERSION: NUMBER '.' NUMBER '.' NUMBER;

SEMANTIC_VERSION_EXPRESSION: (EQUAL | GREATER_THAN | LOWER_THAN) WHITESPACE SEMANTIC_VERSION;
PARTIAL_SEMANTIC_VERSION_EXPRESSION: (MAJOR | MINOR | PATCH) WHITESPACE NUMBER;

WHITESPACE   : (' ' | '\t') ;
NEWLINE      : ('\r'? '\n' | '\r')+ ;