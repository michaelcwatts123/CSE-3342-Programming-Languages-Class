grammar banking4;

@header {
    import java.util.*;
}

@parser::members {

    // member data ---
    Map < String, Integer > customers = new HashMap < String, Integer >();
    // member functions ---
    void makeDeposit(String user, int amt) {
        if (customers.containsKey(user)) {
            System.out.println("Existing customer: " + user);
        } else {
	    System.out.println("New User: " + user);
        }
        customers.put(user, amt);
        System.out.println("Deposit of " + amt + " has been processed");
    }
    void makeWithdrawal(String user, int amt) {
        if (customers.containsKey(user)) {
            System.out.println("Existing customer: " + user);
        } else {
            System.out.println("New Customer " + user);
	    customers.put(user, 0);
        }
	if(customers.get(user) > amt) {
	int x = customers.get(user) - amt;
        customers.put(user, x);
        System.out.println("Withdrawal of " + amt + " has been processed");
	} else {
	System.out.println("Withdraw of $" + amt + " has been denied for " + user);
	}
    }
} // end of @parser block
s: (transaction | print) + ;
transaction: deposit | withdraw;
deposit: ID DEPOSIT NUM {
    makeDeposit($ID.text, $NUM.int);
};
withdraw: ID WITHDRAW NUM {
    makeWithdrawal($ID.text, $NUM.int);
};
print: PRINTTOK ID {
    if (customers.get($ID.text) != null) {
      System.out.println($ID.text + " : $" + customers.get($ID.text));
    } else {
      System.out.println($ID.text + " : $" + 0);
    }
};

//LEXER RULES
DEPOSIT: 'dep';
WITHDRAW: 'withdraw';
PRINTTOK: 'print';
NUM: DIGIT+;
DIGIT: [0-9];
ID: [a-z]+;
WS: [ \r\n\t]+ -> skip;