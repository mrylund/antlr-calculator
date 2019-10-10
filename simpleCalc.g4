grammar simpleCalc;

start   :  prog=program EOF ;

program : (as+=assign)* (e=expression | d=ifstatement | l=loop)*;

assign : x=ID '=' e=expression;

/* A grammar for arithmetic expressionessions */

expression : x=ID    	              		# Variable
     | c=FLOAT	              				# Constant
     | e1=expression '*' e2=expression    	# Multiplication 
     | e1=expression '/' e2=expression	  	# Division
     | e1=expression op=OP e2=expression  	# Addition
     | '(' e=expression ')'	      			# Parenthesis
     | op=OP f=FLOAT          				# SignedConstant
     | e1=expression op=OR e2=expression  	# orstatement
;

ifstatement : 'if' '(' (condition)+ ')' '{' program '}' 
				(('elseif' | 'else if') '(' (condition)+ ')' '{' program '}')*
				 'else' '{' program '}';

loop : 'while' '(' (condition)+ ')' '{' program '}';



condition : e1=condition op=AND e2=condition 	# AND
	| e1=condition op=OR e2=condition 			# OR
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
