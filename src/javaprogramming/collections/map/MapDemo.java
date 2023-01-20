package javaprogramming.collections.map;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(4, 5);
        map.put(5,6);
        map.put(9, 1);
        map.put(34, 90);
        map.put(22, 12);
        map.put(80, 1);

        map.forEach((k,v) -> System.out.println("[From Hashmap] k = " + k + " v = " +v));

        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(4, 5);
        linkedHashMap.put(5,6);
        linkedHashMap.put(9, 1);
        linkedHashMap.put(34, 90);
        linkedHashMap.put(22, 12);
        linkedHashMap.put(80, 1);
        
        linkedHashMap.forEach((k, v) -> System.out.println("[From LinkedHashMap] k = " + k + " v = "+v));

        Map<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(4, 5);
        treeMap.put(5,6);
        treeMap.put(9, 1);
        treeMap.put(34, 90);
        treeMap.put(22, 12);
        treeMap.put(80, 1);

        treeMap.forEach((k, v) -> System.out.println("[From TreeMap] k = " + k + " v =" + v));

    }
}
