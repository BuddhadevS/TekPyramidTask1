package StringClass;

import java.util.Arrays;
import java.util.List;

public class SkipFirst2 {
	
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        // Skip first 2 elements, take next 3
        List<Integer> result = numbers.stream()
                                      .skip(2)   // skip first 2 elements
                                      .limit(3)  // take next 3 elements
                                      .toList();

        System.out.println(result);

}
}
