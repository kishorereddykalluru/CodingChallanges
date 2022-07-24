package algoexpert.sorting.hard;

/**
 * Best: O(nlog(n)) time | O(1) space
 * Average: O(nlog(n)) time | O(1) space
 * Worst: O(nlog(n)) time | O(1) space
 */
public class HeapSort {

    public static int[] heapsort(int[] array){
        buildMaxHeap(array);
        for(int endIdx = array.length - 1; endIdx > 0; endIdx--){
            swap(0, endIdx, array);
            shiftDown(0, endIdx - 1, array);
        }
        return array;
    }

    public static void buildMaxHeap(int[] array) {
        int firstParentIdx = (array.length - 2) / 2;
        for(int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--){
            shiftDown(currentIdx, array.length - 1, array);
        }
    }

    public static void shiftDown(int currentIdx, int endIdx, int[] heap){
        int childOneIdx = currentIdx * 2 + 1;
        while(childOneIdx <= endIdx) {
            int childTwoIdx = currentIdx * 2 + 2 <= endIdx ? currentIdx * 2 + 2 : -1;
            int idxToSwap;
            if(childTwoIdx != -1 && heap[childTwoIdx] > heap[childOneIdx]) {
                idxToSwap = childTwoIdx;
            } else {
                idxToSwap = childOneIdx;
            }

            if(heap[idxToSwap] > heap[currentIdx]) {
                swap(currentIdx, idxToSwap, heap);
                childOneIdx = currentIdx * 2 + 1;
            } else {
                return;
            }
        }
    }

    public static void swap(int i, int j, int[] array){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {

        int result[] = heapsort(new int[]{8,5,2,9,5,6,3});

        for(int r: result)
            System.out.print(r+" ");
    }
}
