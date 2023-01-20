package algorithms.sortingchallanges;

public class MergeSortDescendingOrder {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSortDescending(intArray, 0, intArray.length);
        
        for(int num: intArray){
            System.out.println("num = " + num);
        }
    }

    private static void mergeSortDescending(int[] input, int start, int end) {

        if(end - start < 2)
            return;

        int mid = (start+end)/2;
        mergeSortDescending(input, start, mid);
        mergeSortDescending(input, mid, end);
        mergeDescending(input, start, mid, end);
    }

    private static void mergeDescending(int[] input, int start, int mid, int end) {

        if(input[mid-1] >= input[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int temp[] = new int[end-start];

        while(i < mid && j < end){
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start+tempIndex,mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
