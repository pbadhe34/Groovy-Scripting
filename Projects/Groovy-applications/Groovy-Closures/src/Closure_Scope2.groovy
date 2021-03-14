 

class Greeter {
def separator = ", "
def greeting ( name ) {
    def salutation = "Hello"
    
    def greeter = { println salutation + separator + name }
    
    greeter()
}
}

Greeter greeter = new Greeter()
greeter.greeting("Dolly")
