package streams.api;

import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfString {
    public static void main(String[] args) {

        IntStream streamOfChars = "abc".chars();
        streamOfChars.forEach(System.out::println);

        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");
        streamOfString.forEach(System.out::println);
    }
}
