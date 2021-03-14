 
class Worker {
	   private String name
	   String lastname
	   private int id
	   
	   private String nickName

	   String toString() { "${name} ${lastname}" }
	   def getFullName() { "${name} ${lastname}" }
	}

	Worker person = new Worker( name: 'Ram', lastname: 'Sahay' )
	println person
	
	person.lastname = "Bhosale"
	println person.toString()
	
	person['lastname'] = "Mourya"
	println person.toString()
	
	person.id = 123
	person.nickName="Tonu"
	
	println person.toString()
	
	println person.fullName //through getter method
	
	
	
	//to access a field directly use '@.' operator
	println person.@name  //Direct access
	println person.name //through getter method
	
	println person.nickName
	println person.@nickName
	
	//println person.@fullName //Direct field access
	