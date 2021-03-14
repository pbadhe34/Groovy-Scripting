 

def update ( name ) {
    def salutation = "Hello"
    
	//the name from outer scope is accessible
    def greeter = { println salutation + ", " + name }
    
    greeter()
}

update("Viju")
