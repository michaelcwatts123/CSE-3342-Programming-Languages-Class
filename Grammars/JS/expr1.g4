grammar expr1 ;

@parser::header {
import java.util.*;
}
@parser::members {
    Map<String,Integer> mem = new HashMap<String,Integer>();
    
  // member functions ---  
  
  /**
   * getValue - returns the value of var  
   * @param var - name of existing variable 
   * @return value of var or 0 if no such var AND display error message
   */
  int getValue(String var) {
     if (mem.containsKey(var) ) {
             return mem.get(var);
     }
     else {
       System.out.println("Error: undefined var : " + var) ;
       return 0;
     }  
  }
   
  /**
   * setVarVal - set memory var to the value of val. 
   *             if no such var, create it.  
   * @param var - name of existing variable
   * @param val - value to assign to var
   * @return - no value returned
   */
  void setVarVal(String var, int val) {    
        mem.put(var,val);
  }
  
   /**
    * incVarVal - increment memory var by the value of val.
    *             if no such variable, print error message
    * @param var - name of existing variable
    * @param val - value to increment by 
    * @return - no value returned
   */
  void incVarVal(String var, int val) {
     if (mem.containsKey(var) ) {
        int oldval = mem.get(var);
        mem.put(var,oldval+val);
     }
     else System.out.println("Error: undefined var : " + var) ;
  } 
  
  /**
   * printvalue - print the value of var
   *             if no such variable, print error message
   * @param var - name of existing variable
   * @return - no value returned
   */
  void printvalue (String var) {

    if (mem.containsKey(var) ) {
     System.out.println( mem.get(var) );
    }
    else {
      System.out.println("ReferenceError: " + var +  " is not defined");
    }  
  } 
  
}

// GRAMMAR Rules

s 		: ((declare | inc | print | dec ) SPACE? ENDTOK)+ 				;
inc		: ID SPACE* PLUSEQ SPACE* expr  	{incVarVal($ID.text, $expr.val);        };
dec		: ID SPACE* MINUSEQ SPACE* expr  	{incVarVal($ID.text, ($expr.val * -1));        };
print 	        : PRINT SPACE* LP ID RP       	{printvalue($ID.text);          };
declare		: VAR? SPACE* ID SPACE* '=' SPACE* expr     	{setVarVal($ID.text, $expr.val);	       	};
		

expr returns [int val]
    :   a=expr SPACE? MUL SPACE? b=expr   {$val = $a.val * $b.val; } 
    |	a=expr SPACE? DIV SPACE? b=expr   {$val = $a.val / $b.val; } 
    |	a=expr SPACE? MODULO SPACE? b=expr   {$val = $a.val % $b.val; } 		
    |	a=expr SPACE? ADD SPACE? b=expr   {$val = $a.val + $b.val; }
    |	a=expr SPACE? SUB SPACE? b=expr   {$val = $a.val - $b.val; }  	                                                                     
    |   NUM                 {$val = $NUM.int;        }			                        
    |   ID  	            {$val = getValue($ID.text); }    
    |   '(' SPACE? e=expr SPACE? ')'      {$val = $e.val;             }       
    ;


//LEXEMES  reuse, remove or add as needed --------------------------
MUL 	:   '*' ; 
DIV 	:   '/' ;
ADD 	:   '+' ;
SUB 	:   '-' ;
MODULO  :   '%' ;
PLUSEQ 	:  '+=' ;
MINUSEQ :  '-=' ;
PRINT 	:  'console.log';
LP	:  '(' ;
RP      :  ')' ;
ENDTOK	:  ';' ;
SPACE	:  ' ' ;
VAR	:  'var';

COMMENT :  '#'~('\n'|'\r')*  -> skip	;

// Put most general Lexemes at end
NUM	: [0-9]+ ;
ID	: [a-zA-Z_-]+(NUM|[a-zA-Z_-])* ;
WS	: [ \n\r\t]+ -> skip ;