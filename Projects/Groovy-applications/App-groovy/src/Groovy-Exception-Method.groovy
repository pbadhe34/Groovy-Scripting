class TestError{
	def readFromFile() {
		new File('test.txt').text
	}

  def shouldFailWith(FileNotFoundException) {
	readFromFile()
 }
}

 obj = new TestError()
 println obj.shouldFailWith()