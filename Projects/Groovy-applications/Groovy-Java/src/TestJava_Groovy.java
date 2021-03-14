import com.server.Person;


public class TestJava_Groovy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//usde groovy class in java
		Person p = new Person();
		p.setFirstName("Maya");
		//p.lastName="Nayadu";
		p.age = 23;
		p.setAddress("Pune");
		//p.setAddress(123);
		System.out.println("The Person address is  "+p.getAddress());
		
		 
		
	}

}
