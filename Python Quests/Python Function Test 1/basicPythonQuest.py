# Basic Python Quest
# Complete the code for these functions & submit to website for testing
# When returning lists of values, order is not important unless specified

__STUDENT_ID__  = "46536169"     # replace with your 8 digit student id
__CODING_NAME__ = "MCWatts"        # replace with your coding name -

def isSorted(list):
    list2 = sorted(list)
    
    
    if list2 == list:
        return True
    else:
        return False



def isSortedAndUnique(list):
    if isSorted(list) and hasUniqueValues(list):
        return True
    else:
        return False


def hasUniqueValues(my_list):
    a = set('')
    for x in my_list:
        a.add(x)

    if len(my_list) == len(a):
        return True
    else:
        return False


def genSortedArrayUniqueValues(my_list):
    a = set('')
    for x in my_list:
        a.add(x)

    list_2 = list(a)

    list_2 = sorted(list_2)
    
    
    return list_2


def listToMapTwoByTwo(my_list):
    my_list.reverse()
    a = {}
    while len(my_list) > 0:
        key = my_list.pop()
        value = my_list.pop()
        a[key] = value
    return a


def mapKeysToList(my_map):
    a = []
    for keys in my_map.keys():
        a.append(keys)
    
    return a


def wordsInStringToList(s):
    a = s.split(' ')
    for x in a:
        if x == '':
            a.remove(x)
    for c in s:
        for x in a:
            if x == '':
                a.remove(x)
        
    filter(None,a)
    return a


def wordsInStringToDictWordCount(s):
    a = wordsInStringToList(s)
    b = {}
    for x in a:
        compare = x
        count = 0
        for y in a:
            if compare == y:
                count = count + 1
        b[compare] = count

    return b


def reverseWordsInString(s):
    a = ""
    b = wordsInStringToList(s)
    while len(b) > 0:
        a = a + b.pop()
        a+= " "
    
    a = a [:-1]
    
    return a


def isPrime(int1):
    if int1 == 2:
        return True
    else:
        if int1 % 2 == 0:
            return False
        else:
            return True


def genListOfOverlaps(list1, list2):
    a = []
    for b in list1:
        compare1 = b
        for c in list2:
            if compare1 == c:
                a.append(compare1)
    a = list(set(a))
    a = sorted(a)
    
    return a


def genListOfFibonacci(n):
    a = [1]
    if n == 0:
        a.pop()
    n1 = 0
    n2 = 1
    while n > 1:
        n= n - 1
        answer = n1 + n2
        n1 = n2
        n2 = answer
        a.append(answer)
        
    
    return a


def removeDupsNoSet(my_list):
    a = []
    
    for x in my_list:
        if not a.__contains__(x):
            a.append(x)
    
    return a


def removeDupsUseSet(my_list):
    a = list(set(my_list))
    
    return a

def computePercentScoreMultiAnsMC(ansStr, usersAns, numberAnswers):
    score = 0
    answers = list(ansStr)
    user = list (usersAns)
    overlap = genListOfOverlaps(answers,user)
    score = numberAnswers - (len(answers) - len(overlap)) - (len(user) - len(overlap))
    
    return score

if __name__ == '__main__':
    #write your own test code here
    print ('ready to go')
    
    