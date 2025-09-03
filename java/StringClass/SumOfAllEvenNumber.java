package StringClass;

import java.util.*;
import java.util.stream.*;
public class SumOfAllEvenNumber {
	
	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        int sumEven = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .reduce(0,(a,b)->(a+b));
                    //.reduce(0, Integer::sum);
	        

	        System.out.println("Sum of even numbers: " + sumEven);
	    }
	


}
