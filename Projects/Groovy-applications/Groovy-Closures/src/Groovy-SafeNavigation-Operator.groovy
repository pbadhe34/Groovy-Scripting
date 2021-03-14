/*The Safe Navigation operator is used to avoid a NullPointerException. 
Typically with reference to an object to verify that it is not null
 before accessing methods or properties of the object. 
 To avoid this, the safe navigation operator  simply returns null
  instead of throwing an exception
*/
class Person{
	int num
	String name
	Person(){
		
	}
	
	//constructor with positional parameters
	Person(String uName,int id){
		name = uName
		num = id
	}
	
}
class DbService{
	Person findById(int id){
		if(id > 3){
			//constructor with named parameters
		  return new Person(num:id,name:'Bana')
		}
		else return null
	}
}
service = new DbService()
def person = service.findById(7)   
if(person!=null) {
	println "Person found with $person.name and $person.num"
   
}
else println "The Person Not found"
  
  //With safe Navigation

def name = person?.name
println "The Person name is $name"

