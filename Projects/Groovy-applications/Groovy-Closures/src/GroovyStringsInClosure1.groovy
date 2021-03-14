//Verify  with assert statement
//Evlauation of expression within a clousre

//The placeholders are embedded closures.
def paramLessClosure = "1 + 2 == ${-> 3}"

//Verify with assert statement
assert paramLessClosure == '1 + 2 == 3'

println "The paramLessClosure evaluation is $paramLessClosure"

//The ebmbedded closure expression  allows only with zero or one parameter 

//append content with the << leftShift operator

def parameterizedClosure = "1 + 2 == ${ w -> w << 3}"
assert parameterizedClosure == '1 + 2 == 3'

println "The parameterizedClosure evaluation is $parameterizedClosure"

//closures have lazy evaluation over the expressions

def number = 1
def quickGString = "value=${number}"
def lazyGString = "value=${ -> number }"

assert quickGString == "value=1"
assert lazyGString ==  "value=1"
 
println "The quickGString value is $quickGString"
println "The lazyGString value is $lazyGString"

println "Lazy Evaluation in closures"
number = 2
assert quickGString == "value=1"
assert lazyGString ==  "value=2"

println "The quickGString value is $quickGString"
println "The lazyGString value is $lazyGString"
