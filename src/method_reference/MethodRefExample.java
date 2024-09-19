package method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodRefExample {
    public static void main(String[] args) {
        List<String> laptopNames= Arrays.asList("BenQ","Philips","LG");
        //using method ref instead of lambda
        //System.out::println is a method reference that calls the println method for each element in the list.
        laptopNames.forEach(System.out::println);
    }
}
