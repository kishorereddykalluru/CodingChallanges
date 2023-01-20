package javaprogramming.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {

        //1. predicate in filter
//        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);
//
//        List<Integer> collect = integers.stream().filter(x -> x > 5).collect(Collectors.toList());
//
//        System.out.println("collect = " + collect);
//
//        //2. predicate and() function
//        Predicate<Integer> noGreaterThan5 = x -> x > 5;
//        Predicate<Integer> noLessThan8 = x -> x < 8;
//
//        List<Integer> collect1 = integers.stream().filter(noGreaterThan5.and(noLessThan8)).collect(Collectors.toList());
//
//        System.out.println("collect1 = " + collect1);
//
//        //3. predicate or() function
//        Predicate<Integer> noGreaterThan8 = x -> x > 8;
//        Predicate<Integer> noLessThan2 = x -> x < 2;
//
//        List<Integer> collect2 = integers.stream().filter(noGreaterThan8.or(noLessThan2)).collect(Collectors.toList());
//        System.out.println("collect2 = " + collect2);
        //4.
//         Predicate<Integer> p = x->x%2==0;
//
//        System.out.println("p = " + p.test(10));
//        System.out.println("p = " + p.test(15));
        //5.

        System.out.println("1st Random Number: " + Math.random());
        System.out.println("2nd Random Number: " + Math.random());
        System.out.println("3rd Random Number: " + Math.random());
        System.out.println("4th Random Number: " + Math.random());


    }
}
