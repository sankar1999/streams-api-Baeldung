package streams.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamOfCollection {
    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList("justin", "zayn", "drake");
        Stream<String> streamOfCollection = collection.stream();
        streamOfCollection.forEach(System.out::println);
    }
}
