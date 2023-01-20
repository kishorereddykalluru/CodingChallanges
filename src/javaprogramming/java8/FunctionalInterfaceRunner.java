package javaprogramming.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceRunner {

    public static void main(String[] args) {
        //Supplier
        Supplier<Double> s = () -> Math.random();
        System.out.println("s = " + s.get());

        //Predicate
        Predicate<Integer> p = x -> x < 5;
        System.out.println("p " + p.test(40));
        
        //Function
        Function<Integer, Double> func = x -> x * 15.4;
        System.out.println("func " + func.apply(15));

        //Consumer
        Consumer<String> consumer = a -> System.out.println("a = " + a);
        consumer.accept("Java");

    }
}
