package lambda_expression;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bharath","Parthiv");
        //Using lambda expression
        names.forEach(name -> System.out.println(name));
    }
}
