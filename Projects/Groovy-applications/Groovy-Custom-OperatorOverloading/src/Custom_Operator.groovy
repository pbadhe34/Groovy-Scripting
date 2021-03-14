 
Number.metaClass.buyFor { Integer val ->
   delegate * val
}

def price = 200
def result = price.buyFor(10)
println "The result is $result"


Number.metaClass."#" {Integer x -> delegate * x}

num = 20

print (num.'#' (12))

