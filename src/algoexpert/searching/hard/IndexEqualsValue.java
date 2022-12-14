package algoexpert.searching.hard;

public class IndexEqualsValue {

    //O(n) time | O(1) space - where n is the length of the input array
    public int indexEqualsValue(int[] array) {
        for(int index = 0; index < array.length; index++) {
            int value = array[index];
            if(index == value) {
                return index;
            }
        }
        return -1;
    }

    //O(log(n)) time | O(log(n)) space
    public int indexEqualsValue1(int[] array) {
        return indexEqualsValueHelper(array, 0, array.length - 1);
    }

    public int indexEqualsValueHelper(int[] array, int leftIndex, int rightIndex) {
        if(leftIndex > rightIndex) {
            return -1;
        }

        int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
        int middleValue = array[middleIndex];

        if(middleValue < middleIndex) {
            return indexEqualsValueHelper(array, middleIndex + 1, rightIndex);
        } else if((middleValue == middleIndex) && (middleIndex == 0)){
            return middleIndex;
        } else if ((middleValue == middleIndex) && (array[middleIndex - 1] < (middleIndex - 1))) {
            return middleIndex;
        } else {
            return indexEqualsValueHelper(array, leftIndex, middleIndex - 1);
        }
    }

    //O(log(n)) time | O(1) space
    public int indexEqualsValue2(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

       while(leftIndex <= rightIndex) {
           int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
           int middleValue = array[middleIndex];

           if (middleValue < middleIndex) {
               leftIndex = middleIndex + 1;
           } else if ((middleValue == middleIndex) && (middleIndex == 0)) {
               return middleIndex;
           } else if ((middleValue == middleIndex) && (array[middleIndex - 1] < (middleIndex - 1))) {
               return middleIndex;
           } else {
               rightIndex = middleIndex - 1;
           }
       }
        return -1;
    }

    public static void main(String[] args) {


    }
}
