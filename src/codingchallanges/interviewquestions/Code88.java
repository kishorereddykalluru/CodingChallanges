package codingchallanges.interviewquestions;

import javaprogramming.collections.set.Pairs;

import java.util.HashSet;
import java.util.Set;

public class Code88 {

    public static void main(String[] args) {
        int input[] = {10, 5, 5, 5, 10, 5, 3, 4, 1, 6, 7, 8, 9};
        int target = 15;

        // cracked code
        Set<Pairs> result = new HashSet<>();
        Set<Integer> pairSet = new HashSet<>();
        for(int element : input){
            int negate = target - element;
            if(pairSet.contains(negate)) {
                result.add(new Pairs(negate, element));
            } else {
                pairSet.add(element);
            }
        }
        result.forEach(System.out::println);

        //code with improper solution
//        Set<Integer> sumToTarget = new HashSet<>();
//        for(int i : input){
//            int diff = target - i;
//
//            if(sumToTarget.contains(diff)){
//                System.out.println("result = " + result + ", "+i);
//                sumToTarget.remove(diff);
//            } else {
//                sumToTarget.add(i);
//            }
//        }
//        //not even close
//        Set<Pair> sumPairs = new HashSet<>();
//        for(int num: input){
//            int diff = target - num;
//
//            sumPairs.add(new Pair(num, diff));
//        }
//
//        sumPairs.forEach(System.out::println);
    }
}
