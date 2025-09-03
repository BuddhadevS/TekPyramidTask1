package StringClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseListOfString {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Banana", "Apple", "Mango", "Cherry");

        List<String> sortedNames = names.stream()
                                        .sorted(Collections.reverseOrder())
                                        .toList();

        System.out.println(sortedNames);
        
	}

}
