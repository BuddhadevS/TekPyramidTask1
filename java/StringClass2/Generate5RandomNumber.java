package StringClass2;

import java.util.Random;
import java.util.stream.Stream;

public class Generate5RandomNumber {
	
	public static void main(String[] args) {
        Random random = new Random();

        Stream.generate(() -> random.nextInt(100))
              .limit(5)                            
              .forEach(System.out::println);       
    }
	

}
