#!/usr/bin/env python3

import cgitb, cgi
import quest7

#the following two statements should always be the first after imports
cgitb.enable()
print ("Content-Type: text/html\n")

#CALL YOUR CODE TO SET UP YOUR File
quest7.init()

#RETURN JSON STRING OF INITIAL GAME STATE
print (quest7.getState() )







