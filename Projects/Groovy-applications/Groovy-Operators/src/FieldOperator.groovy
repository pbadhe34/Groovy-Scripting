//Using the Direct Field Operator  @

class Data {
   private String name
   
   /*def getName() {
      println "Getting the Name"
      return name       
   }*/
 
}

def user = new Data(name: "Kishor")
println "Name using getter "+user.name

println "Name using direct the field operator "+user.@name

 