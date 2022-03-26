package algoexpert.easy;

public class BinarySearch {
    // binary search with while loop
    public static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    // binary search recursive
    public static int binarySearchRecursive(int[] array, int target) {
        return binarySearchHelper(array, target, 0, array.length - 1);
    }

    public static int binarySearchHelper(int[] array, int target, int start, int end){
        if(start > end) return -1;

        int middle = (start + end) / 2;
        if(target == array[middle]) return middle;
        else if(target < array[middle]) return binarySearchHelper(array, target, start, middle - 1);
        else return binarySearchHelper(array, target, middle + 1, end);
    }

    public static void main(String[] args) {

        int[] numbericArray = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(binarySearch(numbericArray, 80));
        System.out.println(binarySearchRecursive(numbericArray, 80));
    }
}
