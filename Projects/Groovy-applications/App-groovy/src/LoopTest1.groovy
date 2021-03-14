 

class LoopTest1 {
	public static void main(def args){
		
			def list = ["Namo", "Baba", "Jack"]
		
			// using a variable assignment
		
			list.each{firstName->
		
			  println firstName
		
			}
		
			println""
			// using the it variable
		
			list.each{println it}
		
		  }
		
}
