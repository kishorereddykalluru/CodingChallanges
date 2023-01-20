package leetcode.hard;

public class MedianOfTwoSortedArrays {

    public static double medianOfSortedArray(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int [] medianArray = new int[m + n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                medianArray[k] = nums1[i];
                i++;
            } else  {
                medianArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m){
            medianArray[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            medianArray[k] = nums2[j];
            j++;
            k++;
        }
        if(k % 2 != 0){
            return medianArray[k/2];
        } else {
            int mid = (m + n) / 2;
            double p = medianArray[mid];
            double q = medianArray[mid -1];
            return (p + q) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println("medianOfSortedArray(arr1, arr2) = " + medianOfSortedArray(arr1, arr2));
    }
}
