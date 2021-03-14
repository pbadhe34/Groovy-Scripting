import com.user.Account

def list = [1, 2, 3]
while (list) {
	list.remove(0)
}
assert list == []

while (list.size() < 3) 
list << list.size() + 1 //append to the list
assert list == [1, 2, 3]

def store = ''                                         
for (String s in 'a'..'c') store += s                   
assert store == 'abc'                                  

store = ''                                             
for (i in [1, 2, 3]) {                                 
	store += i                                          
}                                                      
assert store == '123'    
//Groovy range
myString = 'Groovy range index'                        
store = ''                                              
for (i in 0 ..< myString.size()) {                      
	store += myString[i]                               
}                                                      
assert store == myString

myString = 'Groovy String'                           
store = ''
//String as Colection                                              
for (s in myString) { 
    //println s.class.name                                
	store += s                                         
}                                                       
assert store == myString

//work with range

(0..9).each { print it }

println()

//for loop in Rnage
for (x in 10..14) { print x }

//NUL iterate
for (x in null) println 'This will not get printed!'


println()

//Object itertaion
for (x in new Account()) 
 println "Printed once for object $x"




println()

//Regular expressions itertaion
def pattern = '12xy3'=~/\d/   //find match of  of numbers only
for (match in pattern)
 println match

 
println "All Done"