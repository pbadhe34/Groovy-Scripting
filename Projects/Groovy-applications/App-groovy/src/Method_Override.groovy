 

class Parent {
	
	 def update()
	 { 
		 println 'parent update'
     } 
	 Parent(){
	  println "Parent Default Constructor.."
	 }
}
class Child extends Parent { 
	
	def update()
	{ 
	 super.update()
	 println 'Child Update'
	} 
	
	Child()
	{
		println "Child Default Constructor.."
	}
}

def p = new Parent()
p.update()
c = new Child()
c.update()

def date = new Date()
println "The current date is  "+date.toString()


/*
 * to redefine a method from an existing library..
 * use categories. This is done to avoid name conflicts
 or to patch functionality with local modifications without changing
 original code
 */
 
 
class DateCategory {
	 
	static toString(Date self) {
		  println "DateCategory toString"
		 'not revealing the Date'
		  }
}
use (DateCategory.class) {
	 def date2 = new Date()
	 println date2.toString()
}
