
public class CallGroovyFromJava {
	public static void main(String[] args) {
        POGO_Class groovyObject = new POGO_Class();
        
        groovyObject.setFirstName("Fred");
        groovyObject.setLastName("DCosta");
        
        System.out.println("Pogo : " + groovyObject.getFirstName() );

        POJO_Class javaObject = new POJO_Class();
        
        javaObject.setFirstName("Liz");
        javaObject.setLastName("Tailor");
        
        System.out.println("POJO : " + javaObject.getFirstName());
    }

}
