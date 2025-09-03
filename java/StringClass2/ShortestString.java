package StringClass2;

import java.util.Arrays;
import java.util.List;

public class ShortestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "is", "powerful");

        String shortest = words.stream()
                               .reduce((s1, s2) -> s1.length() <= s2.length() ? s1 : s2)
                               .orElse(null);

        System.out.println("Shortest string: " + shortest);
    }
}
