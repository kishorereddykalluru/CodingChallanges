package javaprogramming.java8.streampractise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            listInt.add(i);
        }

        System.out.println("listInt = " + listInt);
        List<Integer> collect = IntStream.range(0, 10).mapToObj(x -> x).collect(Collectors.toList());
        System.out.println("collect = " + collect);


    }
}
