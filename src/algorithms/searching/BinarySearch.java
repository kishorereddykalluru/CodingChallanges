package algorithms.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(input,55));
        System.out.println(iterativeBinarySearch(input,1));
        System.out.println(iterativeBinarySearch(input,8888));
        System.out.println(iterativeBinarySearch(input,-15));

        System.out.println(recursiveBinarySearch(input,7));
        System.out.println(recursiveBinarySearch(input,1));
        System.out.println(recursiveBinarySearch(input,8888));
        System.out.println(recursiveBinarySearch(input,-15));
    }

    public static int iterativeBinarySearch(int[] input, int value){

        int start = 0;
        int end = input.length;

        while(start < end){
            int mid = (start + end) / 2;
            System.out.println("middle index = " + mid);

            if(input[mid] == value){
                return mid;
            } else if(input[mid] < value) {
                start = mid+1;
            } else {
                end = mid;
            }
        }

        return -1;

    }

    public static int recursiveBinarySearch(int[] input, int value){
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value){

        if(start >= end){
            return -1;
        }

        int mid = (start + end) / 2;
        System.out.println("middle index = " + mid);
        if(input[mid] == value){
            return mid;
        } else if(input[mid] < value){
            return recursiveBinarySearch(input, mid+1, end, value);
        } else {
           return recursiveBinarySearch(input, start, mid, value);
        }
    }
}
