package StringClass;
import java.util.*;
import java.util.stream.*;
public class GetFirstElementFromListOfString {

	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("Java", "Spring", "Hibernate", "React");

	        // Get first element if present
	        Optional<String> firstElement = names.stream().findFirst();

	        // Print safely
	        firstElement.ifPresent(s -> System.out.println("First element: " + s));
	    }
	


}
