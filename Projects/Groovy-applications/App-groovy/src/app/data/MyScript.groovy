package app.data

 println "app.data.MyScript Main "
  int num = 34
 obj = new App()
 obj.update()
 App.test()
 
 script = new MyScript()
 println script.getProperties().toString()
 
   assert 1==1
 println(args. size())
 for (i = 0; i < args. size(); i++) {
	 println(i + ' ' + args[i])
	 }
 
  
  class App{
	   
	  void update(){
		  println "app update"
	  }
	  
	   
	  static void test(){
		  println "app test"
	  }
  }
