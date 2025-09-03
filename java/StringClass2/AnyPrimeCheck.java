package StringClass2;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.IntStream;

public class AnyPrimeCheck {
	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 8, 9, 20,11);
	        System.out.println(numbers.stream()
	                             .filter(AnyPrimeCheck::isPrime)
	                             .toList());
	    }

	 public static boolean isPrime(int x) {
		    boolean flag = true;
		    for (int i = 2; i < x; i++) {
		        if (x % i == 0) {
		            flag = false;
		            break;
		        }
		    }
		    return flag;
		}
}
