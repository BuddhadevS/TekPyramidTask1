package StringClass;

import java.util.*;
import java.util.stream.Collectors;
public class FindDuplicateElement {
	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1);

	        Set<Integer> seen = new HashSet<>();

	        // Filter duplicates
	        Set<Integer> duplicates =  numbers.stream()
	                                        .filter(n -> !seen.add(n)) // add returns false if already present

	                                        .collect(Collectors.toSet());

	        System.out.println("Duplicate elements: " + duplicates);
	    }
	


}
