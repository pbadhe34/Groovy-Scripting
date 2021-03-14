 //Use equals method used instead of == to confirm result type

assert 12.equals(3 << 2)
assert 24L.equals(3L << 3)
 

assert 4095 == -200 >>> 20
assert -1 == -200 >> 20
 
 

//Conditional operators
def data ="App data"
def emptyString=''

assert (!true)    == false //the negation of true is false
assert (!'data')   == false // non empty string, evaluating to true
assert (!'')      == true //an empty string, evaluating to false

///Ternary operator
name = "Baba"
if (name!=null && name.length()>0) {
	result = 'Found'
} else {
	result = 'Not found'
}

result = (name!=null && name.length()>0) ? 'Found' : 'Not found'

println "The result is $result"

groovyTerneryResult = name ? 'Found' : 'Not found'
println "The groovyTerneryResult is $groovyTerneryResult"

//The "Elvis operator" is a shortening of the ternary operator.
//returns a 'sensible default' value if an expression resolves to false
//displayName = user.name ? user.name : 'Anonymous'
//Elvis opertaor: Elvis operator, the value, which is tested, 
// is used if it is not false-Ish
displayName = name ?: 'Anonymous'
println "The displayName is $displayName"



