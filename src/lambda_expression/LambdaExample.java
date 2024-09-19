package lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bharath","Parthiv");

        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Prado");

        //Using lambda expression
        names.forEach(name -> System.out.println(name));
        cars.forEach(car -> System.out.println(car));
    }
}
