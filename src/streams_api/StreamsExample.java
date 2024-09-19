package streams_api;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> cars = Arrays.asList("Lexus","Prado","Volvo","Pajero");
        // Using Stream to filter and print names that start with 'P'
        //stream() creates a stream from the list.
        cars.stream()
                //filter() filters elements based on a predicate.
                .filter(carNames -> carNames.startsWith("P"))
                //forEach() performs an action on each element.
                .forEach(System.out::println);
    }
}
