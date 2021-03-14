 


/*
 * A closure in Groovy is :

    a block of code that can access variables in the scope where it is declared.
    a function that can take arguments and always returns a result (may be null)
    an object that has properties and methods with and without side-effects
    
    Calling a closure if thread-safe if the implementation is thread-safe
 */

  

//define and invoke  the closure
 def x = { println it }
//To invoke the clousre : two options 
 
 x('Welcome..!')
 x.call('Hello Groovy Users')
 
 //another closure
 def data = { 
	 print "Inside data closure \n" 
	 def num = 456 	 
 }
 
 //passing a closure to function
 def update(num,T)
 {
	 //T may be an Object, Closure or no explicit type.
	 print "The num is  $num\n"
	 print "Invoking the closure\n"
	 T.call("This is a closure call")
 }
 
 def res = update(101,x)
 println "The first closure call result is  $res"
 
 res = update(500,data)
 println "The second closure result is  $res"
   
 //pass the "block" as normal argument
 res = update(435,{x = 100/10})
 println "The third closure result is  $res"
 
 
 def getBiggest = { number1, number2 ->
	 number1 < number2 ? number2 : number1
 }
  
 def result = getBiggest.call(7, 10)
 println result
 assert result == 10
 //The closure reference can be used as if it were a method
 result = getBiggest(3, 5)
 assert result == 5
 println "The big number is "+result
 
 
 println "The closure inline code"
 def isList = { myList -> myList instanceof List }
 
 //test this closure
 if (isList([])) 
  println "This is a List"
  else  println "This is NOT a List"
 
 
 /*
  * If variable arguments and Closures are combined ,
  *  the closure needs to be the last argument, 
  *  and the parameter enabling variable arguments 
  *  also needs to be the last one too. 
  *   
  */
 
 def test(Object[] args) 
 {
	 println "Running the test.."
	 if (!args || !(args[-1] instanceof Closure)) {
	   println("The Last argument must be a closure")
	 }
	 else
	 {
		 println("Invoking the  closure")
		 args[-1].call()
	 }
	 
	 
  }
 
 test(123,data)
 test(123,87)
 test 12
 
