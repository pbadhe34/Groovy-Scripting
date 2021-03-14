package com.server

public class Person{
  String firstName
  String lastName
  public int age
  def address
  
  static void main(def args) {
    Person p = new Person()
    // use the generated access methods
   // p.setFirstName(123)
	p.setFirstName("Biju..")
    // This will still use the generated access method, it is not a direct access!
    p.lastName = "Mourya" 
	
	//Note the type assignments
    p.address = ("MG Road 3");
	p.address = 1213
    println(p.firstName + " " + p.lastName+" "+p.address);
    // use the generated constructor
    p = new Person(firstName: "Viju", lastName:"Bhosale");
    println(p.firstName + " " + p.lastName);
  }
  
} 
