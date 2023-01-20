package javaprogramming.java8;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

       List<String> li = List.of("abc", "xyz", "lmn", "nop", "qrs", "abc", "mno", "qrs", "tuv");

        List<String> li1 = List.of("abc", "xyz", "lmn", "acv", "bcv", "dcv", "zcv", "accv",
                "aecv", "acfv", "acgv", "acav", "ascv", "acv");

        List<String> collect = li1.stream().filter(x -> !li.contains(x)).collect(Collectors.toList());

        System.out.println("collect.size() = " + collect.size() + " <-----> li1.size() = "+li1.size());

        collect.forEach(System.out::println);
    }
}
