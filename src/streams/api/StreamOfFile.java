package streams.api;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamOfFile {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/sankar/Json Files/employees.json");
        Stream<String> streamOfStrings = Files.lines(path);
        //streamOfStrings.forEach(System.out::println);
        Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
        streamWithCharset.forEach(System.out::println);
    }
}
