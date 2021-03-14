  //def name
import groovy.transform.Field

   @Field def name = "Mohan"
  
void update(){
	  x = 20
	  println "The global name insiode update is $name"
	  def name = "Baba" //local inside the method
	  //Binding binding = new Binding();
	  Binding binding = this.getBinding()
	  binding.setVariable("userName", name);
	  println "The local name inside update is ${binding.userName}"
  }
  
   String readName()
   {
	  // Binding binding = new Binding();
	   Binding binding = this.getBinding()
	   println "Inside readName()"
	   //userLocal = binding.getVariable("userName");
	   println "The name defined locally by update() is ${binding.userName}"
	  //The last is the return data from this method
	    name ="Returned Name is Kishor"
		//return name //the return is optional
   }
   
   println "The script is started"
   update()
   println "The  name returned from method is ${readName()}"
   println "The global userName by script binding is ${ this.getBinding().userName}"
   println "The global name by @Field is ${name}"
   