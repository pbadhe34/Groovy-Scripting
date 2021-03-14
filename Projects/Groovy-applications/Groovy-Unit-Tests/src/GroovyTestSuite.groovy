import junit.framework.*

static Test suite() {
    def suite = new TestSuite()
    def gsuite = new GroovyTestSuite()
    suite.addTestSuite(gsuite.compile("Calculator_Test.groovy"))
    suite.addTestSuite(gsuite.compile("Hash_Test.groovy"))
    return suite
}

junit.textui.TestRunner.run(suite())