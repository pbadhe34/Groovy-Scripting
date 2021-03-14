def checkOS() {
	//return from function is the last value declared
	if (System.properties.'os.name'.contains('Mac'))
	{
		"We're on Mac." 
		123 
	}
	else
	{
		"Oh, well ..."   
		"Good To see you"
	}
}
println checkOS()

def check() {
	//default return from switch
	switch(System.properties.'os.name') {
		case 'Mac OS X': "We're on Mac."; break  
		default: "No,this is assmebled mc ..."          
	}
}
println check()