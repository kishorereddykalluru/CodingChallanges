package algoexpert.arrays.medium;

public class ArrayOfProducts {

    public static int[] arrayOfProducts(int[] array) {
        int [] arrayOfProducts = new int[array.length];
        int leftRunningProduct = 1;
        for( int i = 0; i < array.length; i++){
            arrayOfProducts[i] = leftRunningProduct;
            leftRunningProduct *= array[i];
        }

        int rightRunningProduct = 1;
        for(int i = array.length - 1 ; i >= 0 ; i--){
            arrayOfProducts[i] *= rightRunningProduct;
            rightRunningProduct *= array[i];
        }

        return arrayOfProducts;
    }

    public static int[] arrayOfProducts1(int[] array) {
        int [] arrayOfProducts = new int[array.length];
        int [] leftArray = new int[array.length];
        int [] rightArray = new int[array.length];
        int leftRunningProduct = 1;
        for( int i = 0; i < array.length; i++){
            leftArray[i] = leftRunningProduct;
            leftRunningProduct *= array[i];
        }

        int rightRunningProduct = 1;
        for(int i = array.length - 1 ; i >= 0 ; i--){
            rightArray[i] = rightRunningProduct;
            rightRunningProduct *= array[i];
        }

        for(int i = 0 ; i < array.length; i++){
            arrayOfProducts[i] = leftArray[i] * rightArray[i];
        }

        return arrayOfProducts;
    }

    public static void main(String[] args) {

        int[] productArray = arrayOfProducts1(new int[] {5, 1, 4, 2});
        for(int i: productArray){
            System.out.println(i);
        }
    }
}
