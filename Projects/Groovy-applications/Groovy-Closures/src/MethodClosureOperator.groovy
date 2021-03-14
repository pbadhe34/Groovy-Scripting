 

 def list = ["Chaya","John","Vikas"]

// each takes a closure
list.each { println it }

String printName(String name) {
  println name
}

// & causes the method to be accessed as a closure
list.each(this.&printName)