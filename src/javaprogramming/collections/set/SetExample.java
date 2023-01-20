package javaprogramming.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> stringHashSet = new HashSet<>();
        stringHashSet.add("one");
        stringHashSet.add("two");
        stringHashSet.add("three");
        stringHashSet.add("four");
        stringHashSet.add("five");

        stringHashSet.forEach(x -> System.out.println("[HashSet] x = " + x));

        Set<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("one");
        stringLinkedHashSet.add("two");
        stringLinkedHashSet.add("three");
        stringLinkedHashSet.add("four");
        stringLinkedHashSet.add("five");

        stringLinkedHashSet.forEach(x -> System.out.println("[LinkedHashSet] x = " + x));

        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("one");
        stringTreeSet.add("two");
        stringTreeSet.add("three");
        stringTreeSet.add("four");
        stringTreeSet.add("five");

        stringTreeSet.forEach(x -> System.out.println("[TreeSet] x = " + x));

    }
}
