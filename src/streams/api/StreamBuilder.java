package streams.api;

import java.util.stream.Stream;

public class StreamBuilder {

    public static void main(String[] args) {

        Stream<String> streamBuilder = Stream.<String>builder().add("aaa")
                .add("bbb")
                .add("ccc")
                .build();
        streamBuilder.forEach(System.out::println);
    }
}
