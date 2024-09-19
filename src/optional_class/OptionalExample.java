package optional_class;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //Optional.ofNullable("Hello") creates an Optional object that may contain a non-null value.
        Optional<String > optional = Optional.ofNullable("Hello");
        // If a value is present, print it
        optional.ifPresent(System.out::println);
        // If value is not present, provide a default
        String defaultValue = optional.orElse("Default value");
        System.out.println(defaultValue);
    }
}
