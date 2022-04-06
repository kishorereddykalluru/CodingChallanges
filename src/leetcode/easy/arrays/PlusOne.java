package leetcode.easy.arrays;

public class PlusOne {

    public static  int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] new_digits = new int[n+1];
        new_digits[0] = 1;
        return new_digits;
    }

    public static void main(String[] args) {

        int[] array = {9,9,9};
        int[] plusOne = plusOne(array);
        for(int plus: plusOne)
            System.out.print(plus);
    }
}
