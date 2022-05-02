package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = 0;
        while(i < array.size()){
            if(array.get(i) != toMove){
                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                j++;
            }
            i++;
        }
        return array;
    }
    public static void main(String[] args) {
        moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2).stream().forEach(System.out::println);
    }

}
