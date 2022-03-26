package leetcode.easy.arrays;

public class RemoveElements {

    //while loop
    public static int removeElementsWhileLoop(int [] array, int val){
        int i = 0;
        int n = array.length;
        while(i < n){
            if(array[i] == val){
                array[i] = array[n-1];
                 n--;
            } else {
                i++;
            }
        }
        return n;
    }
    //easy way
    public static int removeElementsEasyWay(int[] array, int val){
        int i = 0;
        for(int j = 0; j < array.length; j++){
            if(array[j] != val){
                array[i] = array[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int[] array = {3,2,2,3};
        int val = 3;

        //System.out.println("removeElementsEasyWay() = " + removeElementsEasyWay(array, val));
        System.out.println("removeElementsWhileLoop() = " + removeElementsWhileLoop(array, val));
    }
}
