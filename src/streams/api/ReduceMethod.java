package streams.api;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceMethod {
    public static void main(String[] args) {

        OptionalInt reduced = IntStream.rangeClosed(1, 4).reduce((a, b) -> (a + b));
        System.out.println(reduced);

        int reducedTwoParams = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println(reducedTwoParams);

        int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    System.out.println("Combiner was called...");
                    return a+b;
                });

        System.out.println(reducedParallel);
    }
}
