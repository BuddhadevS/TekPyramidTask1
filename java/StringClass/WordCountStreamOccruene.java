package StringClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountStreamOccruene {
	
	public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "apple", "banana", "apple", "orange", "banana", "apple"
        );

        Map<String, Integer> wordCount = new HashMap<>();

        words.stream()
             .forEach(word -> wordCount.put(word, wordCount.getOrDefault(word, 0) + 1));

        System.out.println(wordCount);
    }

}
