import groovy.transform.ToString

@ToString
class Element {
	String name
	int atomicNumber
}

//def Hydelement = new Element(name: 'Hydrogen')
def Hydelement = new Element()  //name not assigned
Hydelement.with {
	name = name ?: 'Oxygen'   // existing Elvis operator
	 
	atomicNumber ?= 5   // new Elvis assignment shorthand in Groovy 3.0
	 
}
//assert Hydelement.toString() == 'Element(Hydrogen, 2)'

println "The Hydelement is $Hydelement"