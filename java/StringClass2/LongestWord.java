package StringClass2;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java Streams are very powerful and useful";

        String longestWord = Arrays.stream(sentence.split(" "))
                                   .reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2)
                                   .orElse(null);

        System.out.println("Longest word: " + longestWord);
    }
}

