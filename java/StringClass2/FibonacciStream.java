package StringClass2;


import java.util.stream.Stream;

public class FibonacciStream {
    public static Stream<Integer> getFibStream() {
        return Stream.iterate(new Integer[] {0, 1}, 
                              s -> new Integer[]{s[1], s[0] + s[1]})
                     .map(s -> s[0]); 
        
    }

    public static void main(String[] args) {
        getFibStream()
            .limit(15)
            .forEach(System.out::println);
    }
}


