/* The interpolated strings(GString) can be used in place of plain 
 * Java strings.
 * But Java strings are immutable, whereas the resulting String 
 * representation of a GString can vary, depending on its interpolated
 *  values. Even for the same resulting string, GStrings and Strings
 *   don’t have the same hashCode.
 *   GString and Strings having different hashCode values for the 
 *   same value assigned.
 *   */
 
 string1 = "1"
 string2 = "$string1"
 println "The String hashCode value is ${string1.hashCode()}"
 println "The GString hashCode value is ${string2.hashCode()}"
 
 //Try for the intergers
 num = new Integer(23) 
 println "The integer hashCode value is ${num.hashCode()}"
 num = 67 + 34
 println "The new integer hashCode value is ${num.hashCode()}"
 
 //After the String is modified
 string1 = "1345"
 string2 = "$string1"
 println "The new String hashCode value is ${string1.hashCode()}"
 println "The new GString hashCode value is ${string2.hashCode()}"
 
 //Avoid GString as map keys
 def key = "abcd"
 //define the map record with key
 def m = ["${key}": "letter ${key}"]
 
 //No value since the String and GString have different hashCode values
 println "The value of the string key is ${m['abcd']}" 
 //Use GString expression 
 println "The value of the GString key is $m[${key}}"
 
 