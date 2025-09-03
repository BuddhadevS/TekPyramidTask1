package StringClass;

import java.util.*;
import java.util.stream.*;

public class PrintAllEvenNumber {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 4, 6, 8, 10, 12, 13, 17, 250, 4, 6, 8);

        // Filter only even numbers
        List<Integer> evenNo = li.stream()
                                 .filter(n -> n % 2 == 0)   // keep only evens
                                 .collect(Collectors.toList()); // collect into List

        System.out.println(evenNo);
    }
}
