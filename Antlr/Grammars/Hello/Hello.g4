grammar Hello;

stmt	:	'hello' ID	;
ID	:	[a-z]+		;
WS	:	[ \t\r\n]+ -> skip ;