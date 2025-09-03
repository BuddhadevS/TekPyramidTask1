package StringClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMaxNumberFromList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 3, 67, 89, 45);

        int maxNum = Collections.max(numbers);

        System.out.println("Maximum number: " + maxNum);
        
        
        
     // Find maximum number
       //Optional<Integer> maxNum = numbers.stream().max(Integer::compareTo);

     // maxNum.ifPresent(n -> System.out.println("Maximum number: " + n));
	}

}
