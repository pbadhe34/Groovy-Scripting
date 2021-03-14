class StringSplitTest extends GroovyTestCase {
	
  void testFullSplit() {
    def splitAr = "groovy.util.GroovyTestCase".split("\\.")		
    def expect = ["groovy", "util", "GroovyTestCase"].toArray()
    assertArrayEquals(expect, splitAr)		
  }	
}
