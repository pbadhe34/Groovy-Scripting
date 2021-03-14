 

class Class1 {
    def field = "Class1 field member"
    def closure = {
        def field = "Class1 closure local variable"
        println this.field
        println this.class.name
        println owner.class.name
        println delegate.class.name
		
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
            }
        nestedClosure()
    }
}

def closure2 = {
    println this.class.name
    println owner.class.name
    println delegate.class.name
}

def clos = new Class1().closure

clos.delegate = this
clos()

closure2()
