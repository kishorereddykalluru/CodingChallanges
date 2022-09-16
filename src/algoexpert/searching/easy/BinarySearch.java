package algoexpert.searching.easy;

public class BinarySearch {

    public static int binarySearchIteration(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(array[mid] == target)
                return mid;
            else if(array[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;

        }

        return -1;
    }

    public static int binarySearchRecursion(int[] array, int target) {
        return binarySearchRecursion(array, target, 0, array.length-1);
    }

    public static int binarySearchRecursion(int[] array, int target, int start, int end){

         if(start <= end)
             return -1;

        int mid = (start + end) / 2;

        if(array[mid] == target)
            return mid;
        else if(array[mid] > target)
            return binarySearchRecursion(array, target, start, mid - 1);

        return binarySearchRecursion(array, target, mid + 1, end);
    }

    public static void main(String[] args) {

        System.out.println(binarySearchIteration(new int[]{0, 1, 21, 33, 45, 61, 71, 72, 73}, 3));
        System.out.println(binarySearchRecursion(new int[]{0, 1, 21, 33, 45, 61, 71, 72, 73}, 3));
    }
}
