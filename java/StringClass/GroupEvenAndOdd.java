package StringClass;

import java.util.*;
import java.util.stream.Collectors;
public class GroupEvenAndOdd {
	

	    public static void main(String[] args) {
	    
	    	        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

	    	        // Even numbers
	    	        List<Integer> evenNumbers = numbers.stream()
	    	                                           .filter(n -> n % 2 == 0)
	    	                                           .toList();

	    	        // Odd numbers
	    	        List<Integer> oddNumbers = numbers.stream()
	    	                                          .filter(n -> n % 2 != 0)
	    	                                          .toList();

	    	        System.out.println("Even numbers: " + evenNumbers);
	    	        System.out.println("Odd numbers: " + oddNumbers);
	    	    
	    
	    
	}


}
