
class Call_Java_From_Groovy {
	static void main(args) {
		def groovyObject = new POGO_Class(firstName:"Babu", lastName:"Khinde")
		def javaObject = new POJO_Class(firstName:"Raam", lastName:"Rachayya")
		
		println groovyObject.firstName
		println javaObject.firstName
	}
  
}
