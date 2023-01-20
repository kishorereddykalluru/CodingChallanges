package javaprogramming.java8.streampractise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) throws IOException {

        //1. Integer Stream
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();

        //2. Integer Stream with skip
        IntStream.range(1, 10).skip(5).forEach(System.out::println);
        System.out.println();

        //Integer Stream with sum
        System.out.println(
                IntStream.range(1,5).sum()
        );

        //Stream.of, sorted, findFirst
        Stream.of("Avi", "Aashvi","Heshika", "Ira")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //Stream from Array, sort, filter, and print
        String[] names = {"Al", "Arvind", "Kishore", "Sudhi", "Saanvi", "Saraswathi", "Zara"};
        Arrays.stream(names).filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        //Array Stream with average
        Arrays.stream(new int[]{1,2,3,4,5})
                .map(a  -> a * a)
                .average()
                .ifPresent(System.out::println);

        //Stream from List, filter, and print
        List<String> people = Arrays.asList("Al", "Arjun", "Simha", "Sumo", "Baachi", "Badri", "Catsy", "Camle", "Dobby", "Hermoine");
        people.stream().map(String::toLowerCase)
                .filter(x -> x.startsWith("a")).forEach(System.out::println);

        //8. Stream rows from text file, sort, filter, and print
        Stream<String> lines = Files.lines(Paths.get("./src/javaprogramming/java8/streampractise/bands.txt"));
        lines.filter(x -> x.length() > 13)
                .sorted()
                .forEach(System.out::println);
        lines.close();
        
        //reduce

        Double reduce = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (a, b) -> a + b);
        System.out.println("reduce = " + reduce);

        Integer reduce1 = Stream.of(1, 3, 4, 5, 6, 7)
                .reduce(0, (a, b) -> a + b);
        System.out.println("reduce1 = " + reduce1);

        IntSummaryStatistics intSummaryStatistics = IntStream.of(3, 5, 90, 45, 20, 9, 56, 73)
                .summaryStatistics();
        System.out.println("intSummaryStatistics = " + intSummaryStatistics);
        System.out.println("intSummaryStatistics.getAverage() = " + intSummaryStatistics.getAverage());

        DoubleSummaryStatistics doubleSummaryStatistics = DoubleStream.of(3.4, 6.5, 77.4, 34.6, 30.5, 90.3)
                .summaryStatistics();
        System.out.println("doubleSummaryStatistics = " + doubleSummaryStatistics);


    }
}
