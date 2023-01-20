package javaprogramming.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {
        // predicate test
        /**
         * @FunctionalInterface
         * public interface Predicate<T> {
         *       Evaluates this predicate on the given argument.
         *
         *       @param t the input argument
         *       @return {@code true} if the input argument matches the predicate,
         *       otherwise {@code false}
         *
         *      boolean test (T t);
         */
//        Predicate<Integer> p = x -> x%2 == 0;
//        System.out.println("p.test(10) = " + p.test(10));
//        System.out.println("p.test(15) = " + p.test(15));
//
//        // predicate to check whether length of string is > 5 or not
//        Predicate<String> p1 = s -> s.length() > 5;
//        System.out.println("p1 = " + p1.test("Kishore"));
//        System.out.println("p1 = " + p1.test("On"));

        //Function test
        /**
         * @FunctionalInterface
         * public interface Function<T, R> {
         *       Applies this function to the given argument.
         *
         *       @param t the function argument
         *       @return the function result
         *
         *R apply (T t);
         */
//        Function<Integer, Integer> f = i -> i * i;
//        System.out.println("f.apply(3) = " + f.apply(3));
//        Function<String, Integer> f1 = s -> s.length();
//        System.out.println("f1.apply(\"Kishore\") = " + f1.apply("Kishore"));

//               Function<Integer, Integer> f = i -> i * i * i;
//               Function<Integer, Integer> f1 = s -> s * 2;
//            System.out.println("f.apply(3) = " + f.andThen(f1).apply(2));
//        System.out.println("f1.compose(f).apply(3) = " + f1.compose(f).apply(3));


        //Supplier test
        /**
         * @FunctionalInterface
         * public interface Supplier<T> {
         *
         *
         *       Gets a result.
         *
         *       @return a result
         *
         *T get ();
         */
//        Supplier<Integer> su = () -> 2 * 2;
//        System.out.println("su.get() = " + su.get());
//        //Consumer test
//        Consumer<Integer> c = a -> System.out.println("a = " + a);
//        c.accept(su.get());

        // how to generate OTP
        Supplier<String> oneTimePassword = () -> {
            String otp = "";
            for(int i=0; i < 6; i++){
                otp += (int)(Math.random() * 10);
            }
            return otp;
        };

        System.out.println("oneTimePassword = " + oneTimePassword.get());

    }
}
