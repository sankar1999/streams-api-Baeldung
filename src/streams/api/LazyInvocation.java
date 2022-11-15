package streams.api;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyInvocation {

    private static int counter;

    private static void wasCalled() {
        counter++;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaa1", "bbb2", "ccc3");
        counter = 0;
        Stream<String> stream = list.stream().filter(element -> {
            wasCalled();
        return element.contains("b");
        });

        stream.forEach(System.out::println);
        System.out.println(counter);
    }
}
