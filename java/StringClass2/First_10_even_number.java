package StringClass2;


import java.util.stream.Stream;

public class First_10_even_number {
	public static void main(String[] args) {
        Stream.iterate(2, n -> n + 2)
              .limit(10)                
              .forEach(System.out::println);
    }
	
}
