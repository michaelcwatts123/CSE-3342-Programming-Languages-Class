
# Testfile for basicPythonQuest.py
from collections  import Counter
import re, pytest, os
import basicPythonQuest

__version__ = "Version1"

#TESTS

def test_isSorted1():
	assert basicPythonQuest.isSorted([2,4,7,7,99,122])==True

def test_isSorted2():
	assert basicPythonQuest.isSorted(['a','b','c'])==True

def test_isSorted3():
	assert basicPythonQuest.isSorted(['a','z','b','c'])==False

def test_isSortedAndUnique1():
	assert basicPythonQuest.isSortedAndUnique([2,4,7,7,99,122])==False

def test_isSortedAndUnique2():
	assert basicPythonQuest.isSortedAndUnique(['a','b','c'])==True

def test_isSortedAndUnique3():
	assert basicPythonQuest.isSortedAndUnique(['a','z','b','b','c'])==False


def test_hasUniqueValues1():
	assert basicPythonQuest.hasUniqueValues([2,4,7,7,99,122])==False

def test_hasUniqueValues2():
	assert basicPythonQuest.hasUniqueValues(['a','b','c'])==True

def test_hasUniqueValues3():
	assert basicPythonQuest.hasUniqueValues(['a','z','b','b','c'])==False



def test_listToMapTwoByTwo1():
	assert basicPythonQuest.listToMapTwoByTwo(['foo','bar'])=={'foo':'bar'}

def test_listToMapTwoByTwo2():
	assert basicPythonQuest.listToMapTwoByTwo(['a',2,3,'foo'])=={'a':2,3:'foo'}

def test_listToMapTwoByTwo3():
	assert basicPythonQuest.listToMapTwoByTwo([])=={}


def test_mapKeysToList1():
	assert basicPythonQuest.mapKeysToList({'foo':'bar'})==['foo']

def test_mapKeysToList2():
	assert set(basicPythonQuest.mapKeysToList({'a':2,3:'foo'}))==set(['a',3])

def test_mapKeysToList3():
	assert basicPythonQuest.mapKeysToList({})==[]



def test_wordsInStringToList1():
	assert sorted(basicPythonQuest.wordsInStringToList('foo bar   baz'))==sorted(['foo','bar','baz'])

def test_wordsInStringToList2():
	assert basicPythonQuest.wordsInStringToList('')==[]



def test_wordsInStringToDictWordCount1():
	assert basicPythonQuest.wordsInStringToDictWordCount('foo bar   bar')=={'foo':1, 'bar':2}

def test_wordsInStringToDictWordCount2():
	assert basicPythonQuest.wordsInStringToDictWordCount('')=={}



def test_reverseWordsInString1():
	assert basicPythonQuest.reverseWordsInString('foo bar bar baz')=='baz bar bar foo'



def test_isPrime1():
	assert basicPythonQuest.isPrime(5)==True

def test_isPrime2():
	assert basicPythonQuest.isPrime(10463)==True

def test_isPrime3():
	assert basicPythonQuest.isPrime(4)==False



def test_genListOfOverlaps1():
	assert set(basicPythonQuest.genListOfOverlaps([2,4,6,8],[6,2,2,9,7]))==set([2,6])

def test_genListOfOverlaps2():
	assert set(basicPythonQuest.genListOfOverlaps([2,4,6,8],[2,4,6,8]))==set([2,4,6,8])

def test_genListOfOverlaps3():
	assert basicPythonQuest.genListOfOverlaps([2,4,6,8],[1,1,9,7])==[]



def test_genListOfFibonacci1():
	assert basicPythonQuest.genListOfFibonacci(5)==[1,1,2,3,5]

def test_genListOfFibonacci2():
	assert basicPythonQuest.genListOfFibonacci(13)==[1,1,2,3,5,8,13,21,34,55,89,144,233]


def test_removeDupsNoSet1():
	assert set(basicPythonQuest.removeDupsNoSet([1,1,2,2,5,6]))==set([1,2,5,6])

def test_removeDupsUseSet1():
	assert set(basicPythonQuest.removeDupsUseSet([1,1,2,2,5,6]))==set([1,2,5,6])



def test_computePercentScoreMultiAnsMC1():
	assert basicPythonQuest.computePercentScoreMultiAnsMC('ABC', 'ABC', 5)==5

def test_computePercentScoreMultiAnsMC2():
	assert basicPythonQuest.computePercentScoreMultiAnsMC('ABC', 'AB', 7)==6

def test_computePercentScoreMultiAnsMC3():
	assert basicPythonQuest.computePercentScoreMultiAnsMC('ABC', 'ABCDE', 5)==3

def test_computePercentScoreMultiAnsMC4():
	assert basicPythonQuest.computePercentScoreMultiAnsMC('ABC', 'DEF', 7)==1

   
if __name__  == '__main__':
    print("running main doing nothing")

