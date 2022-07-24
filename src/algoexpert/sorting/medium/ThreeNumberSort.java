package algoexpert.sorting.medium;

public class ThreeNumberSort {

    public static int[] threeNumberSort(int[] array, int[] order) {
        int[] valueCounts = new int[] {0, 0, 0};

        for(int element: array){
            int orderIdx = getIndex(order, element);
            valueCounts[orderIdx] += 1;
        }

        for(int i = 0; i < 3; i++){
            int value = order[i];
            int count = valueCounts[i];

            int numElementsBefore = getSum(valueCounts, i);
            for(int n = 0; n < count; n++){
                int currentIdx = numElementsBefore + n;
                array[currentIdx] = value;
            }
        }
        return array;
    }

    public static int getIndex(int[] array, int element){
        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static int getSum(int[] array, int end) {
        int sum = 0;
        for(int i = 0; i < end; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] result = threeNumberSort(new int[]{0,1,0,-1,}, new int[]{0,1,-1});

        for(int r: result)
            System.out.print(r+"  ");

    }

}
