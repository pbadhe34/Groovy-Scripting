package com.server

println "My test script";

myCommon()

User.testVarBinding()

//static userGlobal ="UserAdmin"

/*def size = args.length

if(size > 0)
{

 def varA = args[0]
 
 println "The   arg values are  "+args.length
 
println "The first  arg value is  "+args[0]

println "The second  arg value is  "+args[1]
}
*/
/*User userObj  = new User()
userObj.update()*/

//def for local scope

def  name = "Sunil Sahu"
name = new User()
typeValue = name.getClass().getName()
println "the type of name in now is $typeValue"

def myData = 1345
myData = "ert"//scope for myData?

//No def is global scope
 UserName = "Vijay babu"

def uData =  "My String"

typeValue = uData.getClass().getName()
println "the type of uData in second test now is $typeValue"

typeValue = UserName.getClass().getName()
println "the type of UserName is $typeValue"

UserName = 123

typeValue = UserName.getClass().getName()
println "the type of UserName now is $typeValue"

//add dynamic variable with value into current instance

this.binding.setVariable("MyVar", "UVal")

//public access 
uData = 123.45

typeValue = uData.getClass().getName()

if(typeValue.equalsIgnoreCase("java.lang.String"))
  boi = uData.substring(1)
 else
 println "The uData type is not matching" 

println "UData is $uData"
println "name is $name"



typeValue = uData.getClass().getName()
println "the type of uData in second test now is $typeValue"

name = "ddd"
//This fails oif name is NOT string
sE = name.substring(1)

sE1 = name.toUpperCase()

println "se is $sE1"

/*def userGroovy = new User()
userGroovy.update()
*/
def testO = new TestClass()

println "This in global main  method is  $this"
println "This new instance in  global main  method is  $testO"

testO.binding.setVariable("My", 12367)

//read map of variables/fields

def varData = testO.getBinding().variables
println "varData map   in   new  class instance   is  $varData"


println "The variable data map in current instance  is  ${this.binding.variables}"
 


println " "

testAccess()

println " After the metjod call.."

def mapData = this.binding.variables

println "variable map  after  testAccess groovy call  is  $mapData"

def dVal = this.getBinding().getVariable("FromLocal")
println "The FromLocal added  from  method  groovy code is  $dVal"


/*String testAccess()
{
	println "testAccess invoked here"
	String data = "Test data"
	
	return data
}*/

//public String dName

static def myCommon()
{
	println "This inside static method is  $this"
	
	//def varData = this.binding.variables
	//def varData = this.getBinding().variables //runtime error
	
	//def varData = this.getBinding().getVariables()
	//def varData = this.getBinding().getVariable("MyVar")
	
	//println "variable map  inside  static at class level are  $varData"
	
	
}


 

def testAccess()
{
	println "testAccess groovy method invoked here"	
	
	
	//define local variables
	def varData = this.binding.variables
	
	println "variable map  inside  testAccess groovy method is  $varData"
	
	
	if(this.getBinding().hasVariable("MyVar")==true)
	{
	def myVal = this.getBinding().getVariable("MyVar")
	println "The variable accessed  from outside  inside method with $myVal"
	}
	else
	println "The current instance  accessed  from outside  class doesnot have  value with myVal"
 
	
	 println "This inside method is  $this" 	
	
	/*def nData = this.getBinding().getVariable("UserName")
	println "The UserName from  global  groovy code is  $nData"
	*/
	
	//The code here fails and hence check if it contains
	
	if(this.getBinding().hasVariable("name")==false)
	println "The name from  global  groovy code is NOT available"
	
	/*def nval = this.getBinding().getVariable("name")
	if(nval==null)
	println "The name from  global  groovy code is NOT available"
	else
	println "The UserName from  global  groovy code is  $nval"
	*/
	varData = 'My Data Value'  //local scope
	
	def varLocal ="dd"////local scope
	//add one more varikable in global access
      this.getBinding().setVariable("FromLocal","Data456")
	
	def  flag = true
	def data =""
	if(flag)
	 data = "Test groovy data"
	 else
	 data = 100	
	 println "The last defined  value is the return value.."
	 def val = "My alst value"
	//return data
	
}

 simpleVar = "My Name" 
 
 msg = "message"

def testMethod(){
	
	println "local test method"
	println " "
}

 private void secondMethod() {
	
	println "private secondMethod run"
	println " "
}

 
 public  testParam(Map map)
 {	 
   def uname = map.get('uname') 
	 def value = map.get("value")
	 println "public testParam method with $uname and $value"
	 println " "
 }

 protected testParam2(String val)
 {
     println "protected testParam2 on User 2method with   $val"
	 println " "
 }
 
 //println "The data here is  $data"

  class User{
	
	/*static void main(String [] args)
	{	
		println "user main"
	}*/

	  User()
	  {
		  println "User default  constructor"
	  }
	 private String name
	 
	 private int num
	 
	 public String getName() {
		 println "getting the user name"
		return "Mr. "+ name ;
	}
	 
	 static String userlocal ="UserAdmin"
	 
	 static void testVarBinding()
	 {
		 println "static  testVarBinding.."
		 println "This User inside static method is  $this"
		 
		/* def varData = this.binding.variables
		 println "This User static data binding map  $varData"*/
		 
		 //def varData = this.getBinding().variables //runtime error
	 }

	public void setName(String name) {
		println "setting the user name"
		this.name = name;
	}

	public int getNum() {
		println "getting the user num"
		return num -10;
	}

	public void setNum(int num) {
		println "setting the user num"
		this.num = num;
	}
	
	 
	private void dataTest()
	{
		println "private user dataTest"
	}
	
	//default is public
	void testDefault()
	{
		println " user testDefault aceess"
	}
	public void update()
	{
		println "public user update with $name and $num"
	}
	protected  void accessInSubClass()
	{
		println "protected user accessInSubClass"
	}
}


