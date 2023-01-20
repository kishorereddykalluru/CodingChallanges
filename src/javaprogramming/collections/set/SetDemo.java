package javaprogramming.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        int arr[] = {10, 5, 5, 5, 10, 3, 4, 1, 6, 7, 8, 9, 4, 11};
        int target = 15;

        Set<Pairs> result = new HashSet<>();
        Set<Integer> pairSet = new HashSet<>();
        for(int i : arr){
            int negate = target - i;
            if(pairSet.contains(negate)) {
                result.add(new Pairs(i, negate));
            } else {
                pairSet.add(i);
            }
        }
        result.forEach(System.out::println);
    }
}
