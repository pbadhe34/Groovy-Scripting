abstract class Functor {
 //  arithmetic (binary, left commute and right commute)
 public static Closure bMultiply     = { x, y -> return x * y }
 public static Closure rMultiply     = { y, x ->; return x * y }
 public static Closure lMultiply     = { x, y -> return x * y }
 
 // ...
 // composition
 public static Closure composition   = { f, g, x -> return f(g(x)) }
    
 // lists
 public static Closure map    = 
   { action, list -> return list.collect(action) }
    
 public static Closure apply  = { action, list -> list.each(action) }
    
 public static Closure forAll = { predicate, list ->
                                  for(element in list) {
                                    if(predicate(element) == false) {
                                        return false
                                    }
                                  }
                                  return true
                               }
    // ...
}

class Employee { 
  int id 
  String name 
  Map staff = [ : ] 
  def manager = null 
    
  String toString() { 
    return "Employee: ${id} ${name}" 
  } 
    
  def addToTeam(employee) { 
    staff[employee.id] = employee 
    employee.manager = this 
  } 
} 

class Company { 
  String name 
  Map employees = [ : ] 
    
  def hireEmployee(employee) { 
    employees[employee.id] = employee 
  } 
    
  def displayStaff() { 
    println "Company: ${name}" 
    println "====================" 
    employees.each { entry -> 
      println "${entry.value}" 
    } 
  } 
} 


def co = new Company(name : 'Napier') 
def emp1 = new Employee(id : 123, name : 'Bhava') 
def emp2 = new Employee(id : 456, name : 'Kais') 
def emp3 = new Employee(id : 789, name : 'Mohan') 
co.hireEmployee(emp1) 
co.hireEmployee(emp2) 
co.hireEmployee(emp3) 
emp3.addToTeam(emp1) 
emp3.addToTeam(emp2) 
co.displayStaff() 
//  Architectural closures 
def hasManager = { employee -> return (employee.manager != null) } 
def everyEmployeeHasManager = Functor.forAll.curry(hasManager) 
def staff = new ArrayList(co.employees.values()) 
println "Every employee has a manager?: ${everyEmployeeHasManager.call(staff)}"
// false 

