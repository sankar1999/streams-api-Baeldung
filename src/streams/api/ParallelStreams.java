package streams.api;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product(100, "Apple"),
                new Product(200, "Orange"),
                new Product(300, "Mango")
        );

        Stream<Product> streamOfCollection = productList.parallelStream();
        boolean isParallel = streamOfCollection.isParallel();
        boolean bigPrice = streamOfCollection
                .map(product -> product.getPrice() * 10)
                .anyMatch(price -> price > 2000);
        System.out.println(bigPrice);

        IntStream intStreamParallel = IntStream.range(1, 150).parallel();
        boolean isParallel2 = intStreamParallel.isParallel();
        System.out.println(isParallel2);

        IntStream intStreamSequential = intStreamParallel.sequential();
        boolean isParallel3 = intStreamParallel.isParallel();
        System.out.println(isParallel3);

    }

    public static class Product {
        private int price;
        private String name;

        public Product() {
        }

        public Product(int price, String name) {
            this.price = price;
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
