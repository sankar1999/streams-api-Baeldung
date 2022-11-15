package streams.api;

import java.util.stream.Stream;

public class EmptyStream {
    public static void main(String[] args) {

        Stream<String> streamEmpty = Stream.empty();
        System.out.println(streamEmpty);
    }
}
