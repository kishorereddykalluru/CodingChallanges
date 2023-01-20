package codingchallanges.interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class GAPTest {
    // 2, 5, 9, 11
    // target - 11
    public static void main(String[] args) {

        int[] array = {5, 2, 9, 11};
        int target = 11;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            if(map.containsKey(target - array[i])){
                System.out.println(i+ "\t"+ map.get(target - array[i]));
            } else {
                map.put(array[i], i);
            }
        }
    }
}
