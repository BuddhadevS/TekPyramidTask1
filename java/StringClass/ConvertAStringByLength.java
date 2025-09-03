package StringClass;

import java.util.*;
import java.util.stream.Collectors;
public class ConvertAStringByLength {
	

	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("Abir", "Buddha", "Sahu", "Java");
	        List<Integer> lengths = names.stream()
	                                     .map(String::length) // transform each string
	                                     .toList();
	        

	        System.out.println(lengths);
	    
	}


}
