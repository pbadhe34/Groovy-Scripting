//String processing in groovy
def map = [:]
//New Dynamic identifiers get added at runtime with a space and double quotes
map."app data" = "Data is available"
map.'test'=  34567
map.user = "Baba"
map.'''Triple Single'''="Three Times"
map."""Triple Double"""="Double Three Times"

map./slashy string key/= 5678
map.$/dollared slashy key/$='sggs'

def name = "Kishor"
map."Gupta-${name}" = "K Gupta"


println map

class UserApp{ }

/*uob =  new UserApp()
uob."appName"="app here"
println UserApp.appName
*/


println map."app data"
println map.test
println map."test"
println map.user
println map.'Triple Single'
println map.'Triple Double'
println map./slashy string key/
println map.$/dollared slashy key/$

println map."Gupta-Kishor"

/******************/

def user = 'King'
 //Formatted output with escape characters
//escaping for single quote and new line characters
def template = "Dear Mr \'${user}\', \nYou're the winner of the Life lottery! \n Yours sincerly,  \nBhagwan"
println "The message ealier is"
println template

/*No escaping is neeeded in triple-double-quoted strings for double quotes or single quotes  
*/
  
   //No escape for single quote and new line characters
def template2 = """
    Dear Mr '${user}',

    You're the winner of the Life lottery!

    Yours sincerly,

    Bhagwan
"""
 

println "The message is $template2"

//Use of Character Literals

char c1 = 'A' //specify the char type
//verify the type with assert
assert c1 instanceof Character

def c2 = 'B' as char // type coercion with the as operator
assert c2 instanceof Character

def c3 = (char)'C'//a cast to char operation

assert c3 instanceof Character

 