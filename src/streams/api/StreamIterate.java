package streams.api;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {

        Stream<Integer> streamIterated = Stream.iterate(1, n-> n+2).limit(10);
        streamIterated.forEach(System.out::println);
    }
}
