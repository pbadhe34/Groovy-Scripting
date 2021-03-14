
def myClass = new com.user.Account();
data = myClass.getClass();

def classes = [String, List, File,data,Date]
for (clazz in classes) {
	println "The package is ${clazz.package.name}"
}

//Read in GPath way with spread operator
//println( [String, List, File,data]*.package*.name )