 
/*Groovy supports the slashy strings, which use / as the opening 
and closing delimiter. 
Slashy strings are particularly useful for defining regular 
expressions and patterns, as there is no need to escape with backslashes.*/
 
 def slashyDigitMatchingPattern = /\d/
 println "The slashyDigitMatchingPattern is $slashyDigitMatchingPattern"
 
 def digitMatchingPattern = "\\d"
 def nonDigitMatchingPattern = "\\D"
 def whiteSpaceMatchingPattern = "\\s"
 
 println "The digitMatchingPattern in normal string is $digitMatchingPattern"
 
 //Only forward slashes to be escaped with a backslash
 def escapedSlashString = /The character \/ is a forward slash/
 println "The escapedSlashString is $escapedSlashString"
 
 def multilineSlashyString = /one
 two
 three/
 println "The multilineSlashyString is $multilineSlashyString"

 //Slashy with interpolation
 def color = 'red'
 def interpolatedSlashyString = /This is a ${color} Car/
 println "The interpolatedSlashyString is $interpolatedSlashyString"
 println "The interpolatedSlashyString is instance of GString \
: ${interpolatedSlashyString instanceof GString}"

 //An emopty An empty slashy string cannot be represented with 
 //a double forward slash: it is treated as line comments
 //def data = //
 //a slashy string can’t end with a backslash which will escape the 
 //slashy string terminator
 
 //def slashyEnd = /the string\/
 
 backSlashString = '\\'
 
 //def slashyWithBackSlash = /Ends with slash ${backSlashString}/
 def slashyWithBackSlash = /Ends with slash ${'\\'}/
 println "The slashyWithBackSlash is $slashyWithBackSlash"
 
 /*The nDollar slashy strings are multiline GStrings delimited
  with an opening $/ and and a closing /$. 
  The escaping character is the dollar sign, and it can escape
   another dollar, or a forward slash*/
   
 def name = "Guillaume"
 def date = "March, 15th"
 
 def dollarSlashyString = $/
	 Hello $name,
	 today's date is ${date}.
 
	 $ dollar sign
	 $$ escaped dollar sign
	 \ backslash
	 / forward slash
	 $/ escaped forward slash
	 $$$/ escaped opening dollar slashy
	 $/$$ escaped closing dollar slashy
 /$
   
 
    println "The dollarSlashyString is $dollarSlashyString" 
  
 
 