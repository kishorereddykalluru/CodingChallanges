package algoexpert.arrays.medium;

public class MonotonicArray {

    public static boolean isMonotonic(int[] array) {
        if(array.length <= 2) return true;

        var direction = array[1] - array[0];
        for(int i = 2; i < array.length; i++){
            if(direction == 0){
                direction = array[i] - array[i - 1];
                continue;
            }

            if(breaksDirection(direction, array[i-1],
                   array[i])){
                return false;
            }
        }
        return true;
    }

    private static boolean breaksDirection(int direction, int previous, int current) {
        var difference = current - previous;
        if(direction > 0) return difference < 0;
        return difference > 0;
    }

    public static boolean isMonotonic1(int[] array) {
        var isNonDecreasing = true;
        var isNonIncreasing = true;

        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i - 1]){
                isNonDecreasing = false;
            }
            if(array[i] > array[i -1]){
                isNonIncreasing = false;
            }
        }
        return isNonDecreasing || isNonIncreasing;
    }

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001}));
    }
}
