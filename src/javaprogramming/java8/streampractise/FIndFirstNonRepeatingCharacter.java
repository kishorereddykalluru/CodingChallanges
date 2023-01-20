package javaprogramming.java8.streampractise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FIndFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        
        
        String str = "abcdefghijajfghi";

        Character ch = str.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst().get();


        System.out.println("ch = " + ch);
    }
}
