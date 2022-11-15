package streams.api;

import java.util.stream.Stream;

public class StreamPipeline {
    public static void main(String[] args) {

        Stream<String> onceModifiedStream = Stream.of("aaa", "bbb", "ccc", "ddd").skip(2);
        onceModifiedStream.forEach(System.out::println);

        Stream<String> twiceModifiedStream = onceModifiedStream.skip(1)
                .map(element -> element.substring(0, 1));
        System.out.println(twiceModifiedStream);
    }
}
