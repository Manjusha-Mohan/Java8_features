package functional_interface;

import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        //Predicate<Integer> is a functional interface with a single method test.
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(12));
        System.out.println(isEven.test(11));
    }
}
