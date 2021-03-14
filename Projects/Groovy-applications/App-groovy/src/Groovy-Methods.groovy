import groovy.transform.Field
//Return types of methods



//no return type declared and no parameter
def testMethod() { 'testMethod called here' } 

//Method with explicit return type and no parameter with 
//optional return value
String returnTypeMethod() { 
	 'another method called'
	 //The last declkared is the return value
	  data = "The Optional Returned Data"
	  }

class UserData{
//Method with a parameter with no data type defined
def methodWithParam(job) { 
	"$job passed in  UserData methodWithParam()"
	 job.getClass().getName()  //return value
	 }

def testWithOrder(Map args) {
	 "testWithOrder as ${args.name}: ${args.age}" 
	 }

def testWithPositionParameters(Map args, Integer number) {
	"testWithPositionParameters as ${args.name}: ${args.age}, and the number is ${number}"
	 }

def testWithSecondParamasMap(Integer number, Map args) { 
	"${args.name}: ${args.age}, and the number is ${number}"
	 }


}

//Static method with a String parameter
static String updateStatic(String param1) { 
	"Staticallly $param1 is passed"
	 }

println "testMethod data is ${testMethod()}"


println "returnTypeMethod data is ${returnTypeMethod()}"

//def data_param="wetasd"
def data_param=1234

obj = new UserData()
//No Type check for parameter type
def res = obj.methodWithParam(data_param)  

println "paramMethod param type is $res"

//res = updateStatic(123) //Type check
res = updateStatic("Hi")
println "updateStatic res  is $res"


//all supplied parameters must be named.
println (obj.testWithOrder(name: 'Baba', age: 34))



res = obj.testWithPositionParameters(name: 'kk', age: 45, 56)
println "testWithPositionParameters result is $res"
res = obj.testWithPositionParameters(34, name: 'MJ', age: 16)
println "testWithPositionParameters result is $res"

//error : because the named argument Map parameter is not defined as the first argument
  println (obj.testWithSecondParamasMap(name: 'babab', age: 14, 23))
  
  //Explicit Map argument in place of named arguments makes invocation valid

  println (obj.testWithSecondParamasMap(23, [name: 'dada', age: 33]))
  
  