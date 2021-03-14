 
def user1 = new PersonClass()
user1.userAddress = new Address() //location is null

def user2 = new PersonClass() //address is null
 

def user3 = new PersonClass()

def location = new Location()
location.streetName = "M G Road"
location.houseNumber = 4578

def address = new Address()
address.data=location

user3.userAddress = address

def newUser = null

//def roadName = user1.userAddress.data.streetName

//def roadName = newUser.userAddress.data.streetName

def roadName = user1?.userAddress?.data?.streetName

 
println "The house is  is on  $roadName"


class Person{
	Address  userAddress	
}

class Address
{
	Location data
}

class Location{
	
	String streetName
	int houseNumber
}