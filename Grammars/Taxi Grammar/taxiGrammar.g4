grammar taxiGrammar ;
s	:	(stringdec | numdec)+ ;
stringdec : Q STR Q 'is waiting at' TTOK* 'Writer\'s Depot.';
numdec	:  NUM 'is waiting at' TTOK* 'Starchild Numerology.';

NUM: DIGIT+ ;
DIGIT: [0-9]+ ;
Q: '"' ;
TTOK: 'the' ;
STR: [A-z0-9]+ ;
WS	: [ \r\n\t]+ -> skip ;