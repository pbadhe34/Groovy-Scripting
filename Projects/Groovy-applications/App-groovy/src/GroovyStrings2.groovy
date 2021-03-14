//String processing in groovy with GString class

def startingAndEndingWithANewline  = '''line one
line two
line three'''

println ("Is this String ? : ${startingAndEndingWithANewline instanceof String}")
println ("Is this GString ? : ${startingAndEndingWithANewline instanceof GString}")
println startingAndEndingWithANewline

def strippedFirstNewline = '''\
line one
line two
line three'''


println()
println ("Is this now String ? : ${strippedFirstNewline instanceof String}")
println ("Is this now GString ? : ${strippedFirstNewline instanceof GString}")


println strippedFirstNewline

//Use of backlash for escape characetrs
 data = 'an escaped single quote: \'User\' with a backslash'
 println data
 
 dataDouble = "an escaped double quote: \"App Test\" with a backslash"
 println dataDouble
 
 euroChallan = 'The Euro currency symbol is : \u20AC'
 println euroChallan
 
 poundChallan = 'The Pound currency symbol is : \u00A3'
 println poundChallan
 
 dollarChallan = 'The Dollar currency symbol is : \u0024'
 println dollarChallan
 
 //Use of string interpolation with GString
 //interpolate(evaluate and place it) any expressions inside the ${} placeholder
 
def singleQString = 'app data'
doubleQString = "This is doubled"

println "Intrepolated singleQString is $singleQString"
println "Intrepolated doubleQString is $doubleQString"
println "Intrepolated string is ${singleQString}"

//println (doubleQString instanceof String)

println ("Is it String ? : ${doubleQString instanceof String}")
println ("Is it GString ? : ${doubleQString instanceof GString}")

//evaluation in interploation
 testData = "${doubleQString instanceof GString}"
 println ("Is testData GString ? : ${testData instanceof GString}")
 

def name = 'Baba' // a plain string
//def greeting = 'Hello ${name}' //No interpolation with singke qoutes
def greeting = "Hello ${name}"

println "Greeting is $greeting"

println ("Is greeting String ? : ${greeting instanceof String}")
println ("Is greeting GString ? : ${greeting instanceof GString}")

 
def sum = "The sum of 11 and 73 equals ${11 + 73}"   
//println 'The value of sum is $sum'
println "The value of sum is $sum"
println ("Is sum as  GString ? : ${greeting instanceof GString}")

def person = [name: 'ashok', age: 36]
description = "$person.name is $person.age years old"
println description //evaluated string by GString

def appNum = 12345
//No such property: toString for class: java.lang.Integer
//println "$appNum.toString()"  //invalid since type is Not string

println "$appNum"

appNum = "This is new value"//dynamic value chnages the type on left side

println "$appNum" //valid--no experseeion to evaluate
//println "$appNum.toString()"  //Invalid without curly braces
println "${appNum.toString()}" //valid with curly braces

//To escape the $ or ${} placeholders in a GString to
// avoid the interpolation with Gstring

userName = "Mohan"
//left is not evaluated and right is evaluated
//assert '${userName}' == "${userName}"

//left is not evaluated and right is also NOT  evaluated
assert '${userName}' == "\${userName}"
println "\${userName}" //NO evaluation
 