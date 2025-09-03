package StringClass;

import java.util.*;
import java.util.stream.Collectors;
public class PalindromeString {
	public static void main(String[] args) {
		
		        List<String> words = Arrays.asList(
		            "madam", "racecar", "apple", "level", "hello", "noon"
		        );

		        // Filter palindromic strings
		        List<String> palindromes = words.stream()
		                                        .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
		                                        .toList();

		        System.out.println("Palindromes: " + palindromes);
		    
		

	}

}
