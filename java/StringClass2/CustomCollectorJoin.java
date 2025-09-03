package StringClass2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomCollectorJoin {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("A", "B", "C", "D");

        String result = words.stream()
                             .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(result);  // [A, B, C, D]
    }
}

