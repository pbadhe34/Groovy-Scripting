 

class LoopTest2 {
	public static void main(args){
		5.times {println "Times + $it "}
		1.upto(3) {println "Up + $it "}
		4.downto(1) {print "Down + $it "}
		print "\n"
		def sum = 0
		1.upto(100) {sum += 1}
		print "final Sum = "+sum
		print "\n"
		(1..6).each {print "Range $it"}
	}
}
