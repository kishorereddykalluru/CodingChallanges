package javaprogramming.arrays;

public class ArraysCopyDemo {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] dest = new int[10];
        System.arraycopy(numbers, 3, dest, 0, numbers.length - 3);

        printArray(dest);
    }

    /**
     * Prints elements in an array
     * @param dest
     */
    private static void printArray(int[] dest) {
        for(int d : dest){
            System.out.print("d = " + d + "\t");
        }
    }
}
