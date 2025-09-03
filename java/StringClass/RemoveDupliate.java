package StringClass;

import java.util.*;
import java.util.stream.Collectors;
public class RemoveDupliate {

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1, 6);

	        List<Integer> distinctNumbers = numbers.stream()
	                                               .distinct() // removes duplicates
	                                               .toList();

	        System.out.println(distinctNumbers);
	    }
	


}
