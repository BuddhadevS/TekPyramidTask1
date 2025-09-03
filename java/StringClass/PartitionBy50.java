package StringClass;

import java.util.*;
import java.util.stream.Collectors;
public class PartitionBy50 {
	public static void main(String[] args) {
		
	
	        List<Integer> numbers = Arrays.asList(10, 55, 70, 30, 90, 45, 60);
	        List<Integer> greaterThan50 = numbers.stream()
	                                             .filter(n -> n > 50)
	                                             .collect(Collectors.toList());

	        List<Integer> lessOrEqual50 = numbers.stream()
	                                            .filter(n -> n <= 50)
	                                            .collect(Collectors.toList());

	        System.out.println("Greater than 50: " + greaterThan50);
	        System.out.println("Less than or equal to 50: " + lessOrEqual50);
	}
}


