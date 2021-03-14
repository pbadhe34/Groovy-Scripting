 
 
//Closures with arguments
def checkStringValue = {
	String s ->
	if (s.length() < 4) 
     s = "update"
	 else
	 s= "test"
	 
	 s // return keyword is not required
	}
	def result = checkStringValue "1234" // parentheses are not required
    println "Thye result is  $result"
	
	//Resursive closure call 
	 
	def factorial = { int i -> i == 1 ? 1 : i * call(i - 1) }
	println "The factorial of 10 is "+factorial(10)
	
	//Closure can access the variables in the scope where it is declared:
	
	def pi = 22 / 3
    def calculateSurfaceArea = { radius -> pi * (radius * radius) }
	def surface = calculateSurfaceArea 10
	
	println "The SurfaceArea for Radious of 10 is "+surface
	
	
	  
