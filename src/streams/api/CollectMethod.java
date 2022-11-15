package streams.api;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectMethod {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product(101, "Apple"),
                new Product(102, "Orange"),
                new Product(103, "Mango"));

       List<String> collectorCollection = productList.stream().map(Product::getProductName)
               .collect(Collectors.toList());
       collectorCollection.forEach(System.out::println);

       String listToString = productList.stream().map(Product::getProductName)
               .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(listToString);

        double averagePrice = productList.stream()
                .collect(Collectors.averagingInt(Product::getId));
        System.out.println(averagePrice);

        int summingPrice = productList.stream()
                .collect(Collectors.summingInt(Product::getId));
        System.out.println(summingPrice);

        IntSummaryStatistics statistics = productList.stream()
                .collect(Collectors.summarizingInt(Product::getId));
        System.out.println(statistics);

        Map<Boolean, List<Product>> mapPartioned = productList.stream()
                .collect(Collectors.partitioningBy(element -> element.getId() > 102));
        System.out.println(mapPartioned);

        Set<Product> unmodifiableSet = productList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        Collections::unmodifiableSet));
        unmodifiableSet.forEach(System.out::println);

        Collector<Product, ?, LinkedList<Product>> toLinkedList =
                Collector.of(LinkedList::new, LinkedList::add,
                        (first, second) -> {
                    first.addAll(second);
                    return first;
                        });

        LinkedList<Product> linkedListOfPersons = productList.stream()
                .collect(toLinkedList);
        linkedListOfPersons.forEach(System.out::println);

    }

    static class Product {
        private int id;
        private String productName;

        public Product() {}

        public Product(int id, String productName) {
            this.id = id;
            this.productName = productName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
    }
}
