class Human { String name }

class Twin {
Human one, two

def iterator() {
  return [one, two].iterator()
}
}

//add humans into tweens
def tweens = new Twin(one: new
Human(name:'Raj'), two: new Human(name:'Vira'))

//readvthe name for all the tween huamns

def names = tweens.collect{ it.name } 

println "The tweens mames are  $names"

//Using spread operator
def spreadNames = tweens*.name
println "The tweens mames with spread action opp  are  $spreadNames"


 
 