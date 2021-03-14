 
 import groovy.json.JsonSlurper


 def slurper = new JsonSlurper()
 def result = slurper.parseText('{"person":{"name":"Sindbad","age":30,"pets":["dog","cat","monkey"]}}')


 println "The json result is  "+result
 println "The json result is  "+result.getClass().getName()
 println "The json person is  "+result.person.getClass().getName()

 Map personMap = result.person
 String uName = personMap.get('name');
 
 println "The json person name from the map is  "+uName  

 println "The person age is  "+result.person.age 
 assert result.person.pets.size() == 3

 println "The json person pets is  "+result.person.pets.getClass().getName()

 //assert result.person.pets[0] == "dog"
 //assert result.person.pets[1] == "cat"
 println "The json person pets content is  "+result.person.pets[2]

