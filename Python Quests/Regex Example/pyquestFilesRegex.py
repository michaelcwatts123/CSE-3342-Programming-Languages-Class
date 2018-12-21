#Python Quest2

# tests will be run using the files quest2.txt and quest2.html
# see content of those files below

import pytest, re, collections

__STUDENT_ID__  = "46536169"     # replace with your 8 digit student id
__CODING_NAME__ = "MCWATTS"        # replace with your coding name -

def mapof_top_words_in_file(nwords, filename, ignorecase=True):
    '''return a map/dict of the top nwords and their count
       ignore case depending on third parameter
    '''
    d = dict()
    l = list()
    fileObj = open(filename,'r')
    fileString = fileObj.read()
    if(ignorecase):
        fileString = fileString.lower() #converts entire string to lower case to ignore case
    l = re.sub(r"[^\w]", " ",  fileString).split() #removes non letter characters
    for i in l:
        if i in d: #increments if already in dictionary
            d[i] += 1
        else: #adds to dictionary
            d[i] = 1


    fileObj.close()
    d = sorted(d.items(), key=lambda x: x[1], reverse=True) #sorts dictionary from highest count to lowest
    d = dict(d)
    d2 = dict()
    for key in d.keys():
        if(nwords == 0): #breaks loop if dictionary has enough words
            break
        else: #else adds current word from begining to end to new dictionary
            nwords-=1
            value = d[key]
            d2[key] = value
    return d2

def mapof_top_words_in_file_counter(nwords, filename, ignorecase=True):
    '''read the docs for Counter at https://docs.python.org/3.1/library/collections.html
     and use the Counter class to implement your solution
     '''
    cnt = collections.Counter()
    if(ignorecase):
        words = re.findall(r'\w+', open(filename).read().lower()) #turns all to lower case
        cnt = collections.Counter(words).most_common(nwords)
    else:
        words = re.findall(r'\w+', open(filename).read())
        cnt = collections.Counter(words).most_common(nwords)
    d = dict(cnt)
    return d

def sum_nums_in_file(filename, ignoreFloatNums=True):
    '''return the sum of all the integer/float numbers in the file.
       valid integer numbers: 2  1,200
       valid floats:  22.3  1,234.556
       do not be fooled by phone numbers:    222.333.4444
    '''
    fileObj = open(filename,'r')
    fileString = fileObj.read()
    sum = 0
    
   
    allNum = re.findall(r'(\d+(\.|-)*\d*(\2)*)\d*', fileString) #gets all digits in a file
    for i in range(0, len(allNum)):
        if(ignoreFloatNums):
            
            if(allNum[i][1] != '.' and (allNum[i][2] != '.' and allNum[i][2] != '-')): #ignores if picks up . or -
                
                sum += int(allNum[i][0])
        else:
            if((allNum[i][2] != '.' and allNum[i][2] != '-')): #ignores if picks up multiple . or any -
                sum += float(allNum[i][0])
    return sum

def get_top_phone_number(filename):
    '''
        return as a string the most frequent phone number without dots or dashes.
        consider 1112223333 the same as 111.222.3333 or 111-222-3333
        do not accept 111-222.3333 as a phone number
    '''
    cnt = collections.Counter()
    fileObj = open(filename,'r')
    fileString = fileObj.read()
    words = re.findall(r'(\d{3})(.?)(\d{3})(\2)(\d{4})', fileString)
    print(words)
    listOWords = list()
    for i in range(0,len(words)): 
        s = str()
        s = words[i][0] + words[i][2] + words[i][4] #strips away - and .
        listOWords.append(s)
    cnt = collections.Counter(listOWords).most_common(1) #finds the most common number
    fileObj.close()
    l = [i[0] for i in cnt]
    l = str(l)
    #removes excess characters from string
    l = l.lstrip('[')
    l = l.lstrip("'")
    l = l.rstrip(']')
    l = l.rstrip("'")
    
        
    return l
    

def dict_meta_attributes_from_html(filename):
    '''  Find all the <meta ../> elements  and extract name and content attributes as dict
    :param filename:  the file containing the html
    :return: dict of attribute names and value
    >>> dict_meta_attributes_from_html('quest2.html')
          -> {'author':'Jill Barker', 'book': 'TensorFlow in 100 Hours'}
    '''
    fileObj = open(filename,'r')
    fileString = fileObj.read()
    
    names = re.findall(r'name.*?".*?"', fileString) #finds all meta tag characteristics
    contents = re.findall(r'content.*?".*?"', fileString)
    fileObj.close()
    listONames = list()
    listOfContent = list()
    for i in range(0,len(names)): #strips excess characters
        s = str(names[i])
        s = s[6:]
        s = s[:-1]
        listONames.append(s)
    for i in range(0,len(contents)): #strips excess characters
        s = str(contents[i])
        s = s[9:]
        s = s[:-1]
        listOfContent.append(s)
    myDict = dict(zip(listONames,listOfContent)) #zips content into dictionary
    
    
    return myDict
if __name__ == '__main__':
   dict = {'a':22,'b':77}
   print(dict.items())


