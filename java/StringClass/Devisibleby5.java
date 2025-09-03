package StringClass;

import java.util.*;
import java.util.stream.*;
public class Devisibleby5 {
	
	
		    public static void main(String[] args) {
		        List<Integer> numbers = Arrays.asList(3, 7, 10, 12, 15, 22);
		        
		        boolean anyDivisibleBy5 = numbers.stream()
		                                         .anyMatch(n -> n % 5 == 0);
		        

		        System.out.println("Is any number divisible by 5? " + anyDivisibleBy5);
		        
	}

}
