 
/*Dynamic Groovy supports multiple dispatch ( multimethods). 
When calling a method, the actual method invoked is determined 
 dynamically based on the run-time type of methods arguments.
   First the method name and number of arguments will be considered 
    (including allowance for varargs),
	 and then the type of each argument. */
	  
 class TestClass{
def testOverloaded(Object o1, Object o2) { 
	  println "testOverloaded with objects as params"
	  'o/o'//default return value
	 }
def testOverloaded(Integer i, String  s) {
	println "testOverloaded with int and string  as params"
	 'i/s' 
	 }
def testOverloaded(String  s, Integer i) {
	println "testOverloaded with string and int  as params"
	 's/i'
	  }
}
  obj = new TestClass()
  obj1= new Object()
  obj2 =  new Object()
  obj.testOverloaded(obj1 , obj2)
  obj.testOverloaded(1234, "data hh")
  obj.testOverloaded("abcd", 1234)
  
  