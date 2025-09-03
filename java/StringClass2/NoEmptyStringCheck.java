package StringClass2;

import java.util.Arrays;
import java.util.List;

public class NoEmptyStringCheck {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");

        boolean noEmpty = words.stream()
                               .noneMatch(String::isEmpty);

        if (noEmpty) {
            System.out.println("No string in the list is empty.");
        } else {
            System.out.println("There is at least one empty string in the list.");
        }
    }
}

