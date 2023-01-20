package datastructures.arrays;

public class ArraysTest {

    public static void main(String[] args) {
            
        int[] intArray = new int[7];
        
        intArray[0] = 20;
        intArray[1] = 10;
        intArray[2] = 30;
        intArray[3] = 9;
        intArray[4] = 55;
        intArray[5] = 21;
        intArray[6] = 40;
        
        for (int i = 0; i < intArray.length; i++){
            System.out.println("intArray["+i+"] = " + intArray[i]);
        }
    }
}
