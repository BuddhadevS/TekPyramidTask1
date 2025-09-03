package StringClass;
import java.util.*;
import java.util.stream.*;
public class FindTheAvarage {
	

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

	        double avg = numbers.stream()
	                            .mapToInt(Integer::intValue) // Convert Integer -> int
	                            .average().orElse(0);
	                                           

	        System.out.println("Average: " + avg);
	    }
	


}
