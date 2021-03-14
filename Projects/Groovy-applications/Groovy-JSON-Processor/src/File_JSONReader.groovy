 
import groovy.json.JsonSlurper
import java.io.File
import java.io.Reader
import java.io.FileReader
import java.io.BufferedReader

 

 def slurper = new JsonSlurper() 
  

 BufferedReader inReader = new BufferedReader(new FileReader("jsondata.txt"));

 Reader readJson = inReader ;
  
 def result = slurper.parse(readJson)



 //println "The json result is  "+result
 
 
 println "User name is $result.users.user3.name"
 println "User age is $result.users.user3.age"
 println "User balance is $result.users.user3.balance"
  
  

