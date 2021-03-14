abstract class FunctorTest {
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


class BookUse{
    String name
    String author
    BigDecimal price
    String category
}

def bk = new Book(name:'Groovy', 
                  author:'KenB', 
                  price:25, 
                  category:'CompSci')
// constants
def discountRate = 0.1
def taxRate = 0.17
//  book closures
def calcDiscountedPrice = Functor.rMultiply.curry(1 - discountRate)
def calcTax = Functor.rMultiply.curry(1 + taxRate)
def calcNetPrice = 
  Functor.composition.curry(calcTax, calcDiscountedPrice)
//  now calculate net prices
def netPrice = calcNetPrice(bk.price)
println "netPrice: ${netPrice}"		// netPrice: 26.325