#Quest 4  TEST FILE
#identifiers and semicolon
a1_b2 = 3;
console.log(a1_b2);  #expect 3

#division, subtraction, parens and modulo
b2 = (100 - 50) / (13 % 8) ;
console.log(b2) ;  #expect 10

#plus eq
c1 = 2;
c1 += 3;
console.log (c1);  #expect 5

#minus eq
d1 = 10;
d1 -= 4;
console.log(d1);  #expect 6

#show error when var not declared
#expect: ReferenceError:  f is not defined
#expect: 10 as value of e1
e1 = 10 + f;
console.log(e1);
