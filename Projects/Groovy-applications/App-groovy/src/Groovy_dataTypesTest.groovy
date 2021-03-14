 

class Groovy_dataTypesTest {

	public static void main(args){
		int i = 10 // Short form for Integer i = new Integer(1)
		//int j = "Gehhe"
		def data = "Hello"
		println data.getClass().getName()
		data = 123
		println data.getClass().getName()
		data = true ; //data = 'c'
		println data.getClass().getName()
		 
		println i.getClass().getName()
		//println j.getClass().getName()
		data = 'c'
		println data.getClass().getName()
		 
		
		// Automatic type assignement
		def value = 1.0F
		println value.getClass().getName()
		def value2 = 1;
		println value2.getClass().getName()
		value2 = value2 / 2;
		println value2
		println value2.getClass().getName()
	  }
}
