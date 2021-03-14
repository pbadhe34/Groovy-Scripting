import groovy.transform.Field


//@Field  // make the variable part of instance of script class
List data = [1, 2, 3] //default is the variable declared inside main

def globalData = 1234

println "The global is ${globalData}"

//def getSum() { data.sum() }  
//println "The sum is ${getSum()}"                      
//assert getSum() == 6
//The variable data is an instance field of our script

binding.setVariable("c", 1234);
binding.setVariable("node", "jjd");

value = binding.getVariable("c")
println "The binding c is ${value}"

println "The data  is ${data}"