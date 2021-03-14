
//Java code
 String processString(String message) {
	//assert message instanceof String
	 //groovy code
	 println "Is message a String inside ? : ${message instanceof String}"
	 println "Is message a GString inside ? : ${message instanceof GString}"
	 
	 return message
}
value = "Welcome"
def groovyText = "The groovyText value evaluated is ${value}"
println "Is groovyText a GString at evaluation : ${groovyText instanceof GString}"
println "Is groovyText a String at evaluation : ${groovyText instanceof String}"


//Invoke java code
def result = processString(groovyText)
println "The result is $result"
 