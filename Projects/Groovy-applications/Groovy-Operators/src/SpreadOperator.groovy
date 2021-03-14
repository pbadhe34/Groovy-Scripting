//Using the Spread Operator  *.

class Test {
   String firstName
   String lastName

/*
 User(String f,String l)
{
   firstName = f;
   lastName = l; 
}
*/
   
   def printFullName = {
      println "${firstName} ${lastName}"
   }

}

// Instantiate a User using the named parameters constructor
//User chris = new User("Chris","Broadly")
//User joseph = new User("Joshi", "Raju")


Test baji = new Test(firstName:"baji", lastName: "Singham")
Test kaji = new Test(lastName: "Singham",firstName:"kajol")

Test villian = new Test(firstName:"Raut")

//def list = [chris,joseph,baji,kaji,villian]

def listUsers = [baji,kaji,villian]
 



println "Using collect closure"

listUsers.collect { println it.printFullName() }

println "\n\nUsing Spread Operator : "

listUsers*.printFullName()

//list*.printFullName()
 