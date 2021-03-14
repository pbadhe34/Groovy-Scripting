def numbers = [1, 2, 3]

assert numbers instanceof List
def mixedTypeList = [1, "a", true]

def arrayList = [1, 2, 3]
assert arrayList instanceof java.util.ArrayList

def linkedList = [2, 3, 4] as LinkedList
assert linkedList instanceof java.util.LinkedList

LinkedList otherLinked = [3, 4, 5]
assert otherLinked instanceof java.util.LinkedList

////

def letters = ['a', 'b', 'c', 'd']

assert letters[0] == 'a'
assert letters[1] == 'b'

//access  elements from the end of the list with negative index
assert letters[-1] == 'd'
assert letters[-2] == 'c'

letters[2] = 'C'
assert letters[2] == 'C'
//the << leftShift operator to append an element at the end of the list

letters << 'e'
assert letters[ 4] == 'e'
assert letters[-1] == 'e'

//Access two elements at once, returning a new list containing those two elements
assert letters[1, 3] == ['b', 'd']

//a range to access a range of values from the list, 
//from a start to an end element position
assert letters[2..4] == ['C', 'd', 'e']

//multi-dimensional lists:

def multi = [[0, 1], [2, 3]]
assert multi[1][0] == 2

