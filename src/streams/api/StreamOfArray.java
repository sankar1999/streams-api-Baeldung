package streams.api;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOfArray {
    public static void main(String[] args) {

        Stream<String> streamOfArray = Stream.of("aaa", "bbb", "ccc");
       // streamOfArray.forEach(System.out::println);

        String[] strArr = new String[]{"aaa", "bbb", "ccc", "ddd"};
        Stream<String> streamOfArrayFull = Arrays.stream(strArr);
        Stream<String> streamOfArrayPart = Arrays.stream(strArr, 1, 4);
        streamOfArrayPart.forEach(System.out::println);
    }
}
