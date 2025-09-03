package StringClass2;

import java.util.Arrays;
import java.util.List;

public class AllPositiveCheck {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 10, 2);

        boolean allPositive = numbers.stream()
                                     .allMatch(n -> n > 0);

        System.out.println("All numbers are positive? " + allPositive);
        
    }
}
