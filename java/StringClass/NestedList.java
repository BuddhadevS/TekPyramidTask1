package StringClass;
import java.util.*;
import java.util.stream.Collectors;
public class NestedList {
	

	    public static void main(String[] args) {
	        List<List<Integer>> nestedList = Arrays.asList(
	            Arrays.asList(1, 2, 3),
	            Arrays.asList(4, 5),
	            Arrays.asList(6, 7, 8)
	        );

	        // Flatten into a single list
	        List<Integer> flatList = nestedList.stream()
	                                           .flatMap(List::stream) // flatten each inner list
	                                           .toList();
	        

	        System.out.println(flatList);
	    
	}


}
