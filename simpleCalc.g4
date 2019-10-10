grammar simpleCalc;

start   :  prog=program EOF ;

program : (as+=assign)* (c=condition | e=expression | f=ifstatement | l=loop)*;

assign : x=ID '=' e=expression;

/* A grammar for arithmetic expressionessions */

expression : x=ID    	              		# Variable
     | c=FLOAT	              				# Constant
     | e1=expression '*' e2=expression    	# Multiplication
     | e1=expression '/' e2=expression	  	# Division
     | e1=expression op=OP e2=expression  	# Addition
     | '(' e=expression ')'	      			# Parenthesis
     | op=OP f=FLOAT          				# SignedConstant
;

ifstatement : 'if' '(' (c1=condition)+ ')' '{' p1=program '}'
				(('elseif' | 'else if') '(' (c2+=condition)+ ')' '{' p2+=program '}')*
				 'else' '{' p3=program '}';

loop : 'while' '(' (condition)+ ')' '{' program '}';



condition : c1=condition op=AND c2=condition 	# AND
	| c1=condition op=OR c2=condition 			# OR
	| e1=expression op=EQ e2=expression 		# EQUALS
	| e1=expression op=NOTEQ e2=expression 		# NOTEQ
	| e1=expression op=GREAT e2=expression 		# GREATER
	| e1=expression op=GREATEQ e2=expression 	# GRETEREQ
	| e1=expression op=LESS e2=expression 		# LESS
	| e1=expression op=LESSEQ e2=expression 	# LESSEQ
;


// Lexer:

OP : ('-'|'+') ;

// Requirements
AND : '&&';
OR : '||';
REQ : ('&&'|'||');

// condition
GREAT 	: '>';
GREATEQ : '>=';
LESS 	: '<';
LESSEQ	: '<=';
EQ 		: '==';
NOTEQ	: '!=';

ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : NUM+ ('.' NUM+)? ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
