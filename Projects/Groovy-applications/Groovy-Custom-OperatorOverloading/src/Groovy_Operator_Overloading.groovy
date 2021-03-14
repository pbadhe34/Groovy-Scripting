import com.server.Person

 

/*
Groovy supports operator overloading and supports 
it  by following a naming convention for methods.
*/

class Employee {
	String name
	int id
 }

def profession = "Programing"
def text = profession - "ing" + "er"
println "The text is "+text
 
def text3 = "ing"
def text4 = "er"

def text2 = profession.minus(text3).plus(text4)

println "The text2  is "+text2

def list1 = [1,2,3]
def list2 = [4,5,6]
def list3 = list1 + list2

println "The list3 contents are "+list3

 
list3 << 7   // list.leftShift(7) -> list.add(7)
 
println "The list3 contents modified are "+list3

str = "A" * 5
println "The str contents is "+str

str = "ABCDE"
def str2=  str[1..2]  // str.getAt([1..2]); ranged operation

println "The str2  contents are "+str2
str2 = str[2]  // str2.getAt(2) -> str2.charAt(2)
println "Now the str2  is "+str2
//array sorting
def nums = [2,4,6,1,5,3]
nums.sort()
println "The sorted array is  "+nums

//nums.sort{b,a -> a <=> b } //pass a closure
println "The reverse sorted array is  "+nums

def list = ["10","11","12"].reverse()
println "The reverse  of list is  "+list

def list4 = ["10","11","12"]*.reverse()
println "The reversing of elements in the list is  "+list4

//The use of as operator which enables Groovy casting,
// a better way to convert a type into another.

def person = new Person()

println "The type of person is "+person.class


person = [name: 'BabuRam', id:101] as Employee
println "The type of person Now is "+person.class
 
println "The person name is  "+ person.name

def hypotenuse(side1, side2) {
	java.lang.Math.sqrt(side1**2 + side2**2)    // sqrt in Math package
}
def diagonal = hypotenuse(3, 4)
 println diagonal

// the star operator converts an Array into a "tuple"
a = [5, 12]
println  hypotenuse(*a) 
//Another use of Spread opeartor

class Name {
	def name	
	
	def greet(greeting) {
		println greeting + " " + name
	}

}


def names = [ new Name(name:"Aaron"),  new Name(name:"Biju"), new Name(name:"Maya")]

def getAll ( a, b, c) {
	println "Hello " + a + "," + b + "," + c
}

// Spread the names
getAll(*names.name)

names*.greet("Welcome")





