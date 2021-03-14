//Method with default parameters

class MethodArgsTest{
//The parameter userAge is default
def calculateAge(String userName, Integer userAge = 16) {
	 [name: userName, age: userAge] 
}
}

/*Default arguments make parameters optional. 
If the argument is not supplied, the method assumes a default value.
 No mandatory parameter can be defined after a default parameter 
 is present, only other default parameters.
*/

obj = new MethodArgsTest()
res = obj.calculateAge("Baba", 34)
println "The calculateAge result is $res"

res = obj.calculateAge("Mohan")
println "The calculateAge result with default Age is $res"


//Method with varrages parameters
//methods with a variable number of arguments

class UserVarArgsMethod{
	def methodWithVarAgs(Object... args) {
		println "methodWithVarAgs called with " 
		for(data in args) { 
		 println "The arg is $data"
		}
		//safe navigation for args NULL check
		args?.length  //default return value 
		 }
	
	def methodWithVarAgs(Object x) 
	{ 
		println "Overloaded methodWithVarAgs as single parameter"
		2 
	}
	
}

obj = new UserVarArgsMethod()
assert obj.methodWithVarAgs() == 0
//assert obj.methodWithVarAgs(4) == 1 with org method
assert obj.methodWithVarAgs(4) == 2 //with overloaded methjod
assert obj.methodWithVarAgs(6, 9) == 2
assert obj.methodWithVarAgs(8, 19, 90) == 3
//assert obj.methodWithVarAgs(null) == null
assert obj.methodWithVarAgs(null) == 2

 /*if a varargs method is called with an array as an argument, 
 then the argument will be that array instead of an array of 
 length one containing the given array as the only element.*/
Integer[] ints = [1, 2]
assert obj.methodWithVarAgs(ints) == 2

/*Another important aspect of varargs is in combination with
 method overloading. 
 In case of method overloading Groovy will select the most
  specific method.*/
 
assert obj.methodWithVarAgs(4) == 2

