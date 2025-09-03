package StringClass2;

import java.util.Arrays;
import java.util.List;

public class StreamPeekExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "peek", "example");

        words.stream()
             .peek(s -> System.out.println("Original: " + s))   
             .map(String::toUpperCase)                         
             .peek(s -> System.out.println("After toUpperCase: " + s)) 
             .filter(s -> s.length() > 4)                      
             .peek(s -> System.out.println("After filter: " + s))  
             .forEach(s -> System.out.println("Final output: " + s));
    }
}

