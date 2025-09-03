package StringClass2;

import java.util.Arrays;
import java.util.List;

public class ConcatenateWithReduce {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Streams", "are", "powerful");

        String result = words.stream()
                             .reduce("", (a, b) -> a + " " + b)
                             .trim(); // remove leading space

        System.out.println("Concatenated string: " + result);
    }
}

