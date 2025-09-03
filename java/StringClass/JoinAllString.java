package StringClass;
import java.util.*;
import java.util.stream.Collectors;
public class JoinAllString {
	
	
	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("Abir", "Buddha", "Sahu", "Java");

	        // Join strings with comma delimiter
	        String result = names.stream()
	                             .collect(Collectors.joining(","));

	        System.out.println(result);
	    }
	


}
