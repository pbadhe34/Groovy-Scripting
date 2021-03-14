import groovy.yaml.YamlBuilder
def builder = new YamlBuilder()
builder.records {
	car {
		name 'WagonR'
		make 'Suzuki'
		year 2006
		country 'India'
		homepage new URL('http://agile.org')
		record {
			type 'high speed'
			description 'production pickup truck with speed of 271kph'
			model{
				make 'Maruti'
				price 1000
				dealer{
					name 'Sai Service'
				}
			}
		}
	}
}

  println  builder.toString()
  
  FileWriter fileWriter = new FileWriter("car.yaml")
  
  
  fileWriter.write(builder.toString())
  
  //builder.writeTo(fileWriter)
  
  //fileWriter << builder.toString()
  
  //builder.dump(builder.config(),fileWriter);
  fileWriter.close()
  