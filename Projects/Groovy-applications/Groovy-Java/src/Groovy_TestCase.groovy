
 
	class Groovy_TestCase extends GroovyTestCase {
		
	  void testFullSplit() {
		def splitAr = "groovy.util.GroovyTestCase".split("\\.")
		def expect = ["groovy", "util1", "GroovyTestCase"].toArray()
		assertArrayEquals(expect, splitAr)
		
		
		shouldFail{
			println "Test failed"
		  }
	  }
	  
	  void testGroovy() {
		  
	  }
	}
	

 
