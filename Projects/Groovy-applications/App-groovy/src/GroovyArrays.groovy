 
/*Define  literals arrays, explicitely define the type of the array 
through coercion or type declaration.
*/
 
 String[] arrStr = ['Ananas', 'Banana', 'Papaya']
 
 assert arrStr instanceof String[]
 assert !(arrStr instanceof List)
 
 def numArr = [1, 2, 3] as int[] //array of ints with as opertaor
 
 assert numArr instanceof int[]
 assert numArr.size() == 3
 
 //multi-dimensional arrays:
 
 def matrix3 = new Integer[3][3]
 assert matrix3.size() == 3
 
 Integer[][] matrix2
 matrix2 = [[1, 2], [3, 4]]
 assert matrix2 instanceof Integer[][]
 
 //access and modify the elements in array
 String[] names = ['Cliopatra', 'HUman', 'Mummy', 'Soros']
 assert names[0] == 'Cliopatra'
 
 names[2] = 'Soloman'
 assert names[2] == 'Soloman'
 
  
 //java style array
 
 int[] primes = [2, 3, 5, 7, 11]
 
 //def primes = new int[] {2, 3, 5, 7, 11}
 
// println primes.getClass()
 
 assert primes.size() == 5 
 assert primes.class.name == '[I'
 
// def pets = new String[] 
 String[] pets =['cat', 'dog']
 assert pets.size() == 2 && pets.sum() == 'catdog'
 assert pets.class.name == '[Ljava.lang.String;'
 
 // traditional Groovy alternative  
 String[] groovyBooks = [ 'Groovy in Action', 'Making Java Groovy' ]
 assert groovyBooks.every{ it.contains('Groovy') }
 