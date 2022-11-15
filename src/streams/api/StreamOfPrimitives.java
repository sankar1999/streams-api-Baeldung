package streams.api;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamOfPrimitives {
    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1, 5);
        LongStream longStream = LongStream.rangeClosed(1, 5);

        intStream.forEach(System.out::println);
        longStream.forEach(System.out::println);
    }
}
