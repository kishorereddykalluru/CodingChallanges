package leetcode.easy.arrays;

public class ConsecutiveOnesInAnArray {

    public static void main(String[] args) {

        int [] array = {1,1,0,1,1,1};
        System.out.println("findMaxConsecutiveOnes(array) = " + findMaxConsecutiveOnes(array));
    }

    private static int findMaxConsecutiveOnes(int[] array) {
        int max = 0;
        int count = 0;
        for(int i : array) {
            max = Math.max(max, count = (i == 1) ? count+1 :  0);
        }
        /* below code can be replaced like above
            for(int i = 0; i < array.length; i++{
                if(array[i] == 1) {
                    count++;
                    max = Math.max(count, max);
                } else {
                    count = 0;
                }
            }
         */
        return max;
    }
}
