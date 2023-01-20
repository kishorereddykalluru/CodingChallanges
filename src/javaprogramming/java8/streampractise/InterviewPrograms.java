package javaprogramming.java8.streampractise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterviewPrograms {

    public static void main(String[] args) {

        // List of integers find all the even numbers exist in the list
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,5,6,7,8,9,10,11,12,13,14);
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        //List out numbers that starts with 1
        List<Integer> startWithOne = Arrays.asList(2,5,7,11,16,13,14,19,44,65,34,54);
        startWithOne.stream().map(s -> s +"").filter(s -> s.startsWith("1")).forEach(System.out::println);

        //find duplicates elements in given integer list
        List<Integer> duplicatesList = Arrays.asList(2,5,7,11,16,13,14,19,14,5,34,54);
        System.out.println("removeDuplicates = " + removeDuplicatesUsingSet(duplicatesList));

        //find duplicates using map
        List<Integer> duplicates = Arrays.asList(2,5,7,11,16,13,14,19,14,5,34,54);
        removeDuplicatesUsingMap(duplicates).entrySet().stream()
                .filter(x -> x.getValue() > 1).forEach(x -> System.out.println(x.getKey()));

        //find first element in list
        List<Integer> firstElement = Arrays.asList(2,5,7,11,16,13,14,19,14,5,34,54);
        firstElement.stream().findFirst().ifPresent(System.out::println);

        //find total number of elements present in the list
        List<Integer> totalNumberOfElements = Arrays.asList(2,5,7,11,16,13,14,19,14,5,34,54);
        System.out.println((long) totalNumberOfElements.size());
    
        //find sum of elements present in list
        List<Integer> sumOfElements = Arrays.asList(2,5,7,11,16,13,14,19,14,5,34,54);
        Integer reduce = sumOfElements.stream().reduce(0, Integer::sum);
        System.out.println("reduce = " + reduce);

        //find max of elements present in list
        List<Integer> maxOfElements = Arrays.asList(2,5,7,11,16,13,14,19,14,5,34,54);
        Integer max = maxOfElements.stream().reduce(0, Integer::max);
        System.out.println("reduce = " + max);

        List<Integer> sumAndMaxReduce = Arrays.asList(2,5,7,11,16,13,14,19,14,5,34,54);
        sumAndMaxReduce.stream().reduce(Integer::sum).ifPresent(System.out::println);
        sumAndMaxReduce.stream().reduce(Integer::max).ifPresent(System.out::println);
        sumAndMaxReduce.stream().max(Integer::compare).ifPresent(System.out::println);
        
        //given a string find first non-repeating character
        String str = "Java Hungry Blog Alive is Awesome";
        IntStream.range(0, str.length()).mapToObj(str::charAt).map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

        str.chars().mapToObj(s -> Character.valueOf((char)s)).map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

        //give a list of strings sort values present in list
        List<Integer> sort = Arrays.asList(2,5,7,11,16,13,14,19,14,5,34,54);
        sort.stream().distinct().sorted().forEach(System.out::println);
        sort.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        sort.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }

    public static <T> Set<T> removeDuplicatesUsingSet(List<T> list) {
        Set<T> set = new HashSet<>();
        return list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
    }

    public static <T> Map<T, Long> removeDuplicatesUsingMap(List<T> list) {
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

}
