package StringClass;

import java.util.*;
import java.util.stream.Collectors;
public class GetNumaricString {
	
	
	    public static void main(String[] args) {
	        List<String> mixedList = Arrays.asList("123", "abc", "456", "def", "789", "0x12");

	        // Keep only numeric strings
	        List<String> numericStrings = mixedList.stream()
	                                               .filter(s -> s.matches("[a-zA-Z]+")) // matches only digits \\d+
	                                               .toList();

	        System.out.println(numericStrings);
	    }
	


}
