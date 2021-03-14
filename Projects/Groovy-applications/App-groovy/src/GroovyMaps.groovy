def colorsMap = [red: '#FF0000', green: '#00FF00', blue: '#0000FF']

assert colorsMap['red'] == '#FF0000' //subscript notation
assert colorsMap.green  == '#00FF00'   //property notation t

colorsMap['pink'] = '#FF00FF' 
colorsMap.yellow  = '#FFFF00'

assert colorsMap.pink == '#FF00FF'
assert colorsMap['yellow'] == '#FFFF00'

//To access a key which is not present in the map:

assert colorsMap.unknown == null

assert colorsMap instanceof java.util.LinkedHashMap

////
def key = 'name'
def person = [key: 'Baba']

assert !person.containsKey('name')
assert person.containsKey('key')