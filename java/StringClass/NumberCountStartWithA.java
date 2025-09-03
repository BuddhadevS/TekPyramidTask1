package StringClass;

import java.util.Arrays;
import java.util.List;

public class NumberCountStartWithA {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Mango", "Ant");

        // Count strings starting with "A"
        long count = names.stream()
                          .filter(s -> s.startsWith("A")) // keep only those starting with "A"
                          .count();

        System.out.println("Number of strings starting with A: " + count);
	}

}
