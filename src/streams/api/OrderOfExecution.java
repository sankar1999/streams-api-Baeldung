package streams.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderOfExecution {
    private static int counter;

    private static void wasCalled() {
        counter++;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaa1", "bbb2", "ccc3", "ddd4");
        counter = 0;
        Stream<String> stream = list.stream().filter(element -> {
            wasCalled();
            return element.contains("b");
        });

        //stream.forEach(System.out::println);
        //System.out.println(counter);

        long size = list.stream().map(element -> {wasCalled(); return element.substring(0, 3);
        }).skip(2).count();
        System.out.println(size);

        List<String> getRemain = list.stream().skip(3).collect(Collectors.toList());
        getRemain.forEach(System.out::println);
    }
}
