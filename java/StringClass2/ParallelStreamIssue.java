package StringClass2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamIssue {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        IntStream.rangeClosed(1, 1000)
                 .parallel()
                 .forEach(list::add);

        System.out.println("List size = " + list.size());
    }
}
