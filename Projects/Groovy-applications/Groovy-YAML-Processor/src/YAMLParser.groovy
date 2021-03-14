import groovy.yaml.YamlSlurper

reader = new YamlSlurper()
 file = new File("car.yaml")
 
 Object data = reader.parse(file)
 println data.records.car.name
 
 println data.records.car.record.model.dealer.name
 
