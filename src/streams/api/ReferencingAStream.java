package streams.api;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferencingAStream {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("a", "b", "c").filter(element -> element.contains("c"));
        Optional<String> anyElement = stream.findAny();
        System.out.println(anyElement);

//        Optional<String> firstElement = stream.findFirst();
//        System.out.println(firstElement);

        List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("b"))
                .collect(Collectors.toList());
        Optional<String> anyElement2 = elements.stream().findAny();
        System.out.println(anyElement2);

        Optional<String> firstElement = elements.stream().findFirst();
        System.out.println(firstElement);
    }
}
