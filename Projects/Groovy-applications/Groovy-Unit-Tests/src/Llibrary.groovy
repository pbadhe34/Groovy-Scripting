class Book {    
  String title 
  String author 
  String catalogNumber 
  boolean onLoan = false 

  String toString() { 
    return "Title: ${title}; author: ${author}" 
  } 
} 

class Library { 
  String name 
  Map stock = [:] 
    
  def addBook(title, author, catalogNumber) { 
    def bk = new Book(title:title, 
                      author:author, 
                      catalogNumber:catalogNumber) 
    stock[catalogNumber] = bk 
  } 

  def lendBook(catalogNumber) { 
    stock[catalogNumber].onLoan = true 
  } 

  def displayBooksOnLoan() { 
    println "Library: ${name}" 
    println "Books on loan" 
    stock.each { entry -> 
      if(entry.value.onLoan == true) println entry.value 
    } 
  } 

  def displayBooksAvailableForLoan() { 
    println "Library: ${name}" 
    println "Books available for loan" 
    stock.each { entry -> 
      if(entry.value.onLoan == false) println entry.value 
    } 
  }    
} 


def lib = new Library(name : 'MyLib') 
lib.addBook('Groovy-Pro', 'KenB', 'CS123') 
lib.addBook('Java', 'Stanley', 'CS456') 
lib.addBook('UML', 'Viju Seth', 'CS789') 
lib.lendBook('CS123') 
lib.displayBooksOnLoan() 
// Title: Groovy; author: KenB 
lib.displayBooksAvailableForLoan() 
// Title: UML; author: Ken and John 
// Title: Java; author: JohnS 
