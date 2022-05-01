package algoexpert.arrays.easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyMapJava8 {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1,4,2,3,4,2,3,6,5,7,8,4,3,5,6,8,100);

        Map<Integer, Long> collect = nums.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        TreeMap::new,
                        Collectors.counting()
                )
        );

        collect.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
