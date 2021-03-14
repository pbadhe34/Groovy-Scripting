
package com.test

import com.server.TestClass
import com.server.User


//def obj = new TestClass()

TestClass.myCommon()



//obj.main(null)

/*StringData = obj.testAccess()

println "The string data is  $StringData"

typeValue = StringData.getClass().getName()
println "the type of StringData in accountlocal test now is $typeValue"
*/

///def obj = new User('java',1234)
//private variables of user init in the constructor(still the default constructor)

println "Creating the user instance  in test class with name=bhau and num = 1234 "

def obj = new User( 'num':1234,name:'bhau')

println ""
//private variables of user set by setter methods(default generated.
/*obj.name = "Java"
obj.num = 1234
*/ 

println ""
println "Reading the user properties in test class"
println ""
def uName = obj.name
def uNum = obj.num

println "The user name from getter is  $uName"
println "The user num from getter is  $uNum"

def actualName = obj.@name
def actualNum = obj.@num
println ""

println "The user name direct from property access  is  $actualName"
println "The user num direct from property access  is  $actualNum"
println ""
obj.update()


//access private method
obj.dataTest()

//access protected  method
obj.accessInSubClass()

def test  = new TestClass()



 
//test.main(null)


test.testParam(value: 334,uname:"gaga") //invoke by passing the map of parameters

println "The TestClass instance  in accountLocal  is  $test" 

println "The variable map for test in accountLocal  is  ${test.getBinding().variables}"
 


test.testMethod()

test.secondMethod()

test.testParam2 "Hello"

test.testAccess()

 

//print obj.simpleVar

//println obj.data

//obj.userObj.update()obj.userObj.update()


def obj2 = new User()

obj2.update()
obj2.accessInSubClass()

obj2.dataTest()

 




