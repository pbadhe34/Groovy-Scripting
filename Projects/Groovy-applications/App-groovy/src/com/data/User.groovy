package com.data

/**@
 * groovydoc for Human
 */
class Human {
    int num= 45
	static main(args) {
	  println "Hello Human"
	  Human obj = new Human()
	  println obj.getProperties()
	  
	  //Current object properties
	  println obj.properties
	  .sort{it.key}
	  .collect{it}	
	  .findAll{!['active'].contains(it.key)}
	  .join('\n')
	  
	  //The Class properties
	  println()
	  println()
	  	  
	  println "The class properties"
	  println Human.class.properties
	  .sort{it.key}
	  .collect{it}
	  .join('\n')
	  
	  
	}

}

////.findAll{!['class', 'active'].contains(it.key)}

 /*println "This is outside Human class ${args.size()}"
 for (i = 0; i < args. size(); i++) {
	 println(i + ' ' + args[i])
	 }
*/
 