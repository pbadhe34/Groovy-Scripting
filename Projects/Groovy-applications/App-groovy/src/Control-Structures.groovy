if (false) assert false                                 

//the null is with false value
if (null)                                              
{                                                       
    assert false
}
else
{
    assert true
}

def i = 0                                              
while (i < 10) {                                        
    i++                                               
}                                                      
assert i == 10                                        

def clinks = 0                                         
for (remainingGuests in 0..9) {                        
    clinks += remainingGuests                          
}                                                       
assert clinks == (10*9)/2                              

def list = [0, 1, 2, 3]   

//The for in list                             
for (j in list) {                                      
    assert j == list[j]                                 
}                                                      

//The each method with a customized closure action during iteration
list.each() { item ->                                  
    assert item == list[item]                          
}                                                     

switch(3)  {                                          
    case 1 : assert false; break                       
    case 3 : assert true;      break
	
	//compare with differnt data types
	case String     : assert false ;                    //Type case
	
	case com.user.Account     : assert false ;
	
	case {it%4 == 1}: assert false ; break
    default: assert false                               
}  
     

println "all done"                                                
 
