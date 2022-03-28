package leetcode.easy.arrays;

public class MergeTwoArraysIntoSingleArray
{
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while(i >= 0){
                nums1[k--] = nums1[i--];
        }
        while(j >= 0){
                nums1[k--] = nums2[j--];
        }
        return nums1;
    }

    public static void main(String[] args) {
        int [] nums1 =  {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int [] nums3 = merge(nums1, 3, nums2, 3);
        for(int i : nums1) {
            System.out.println("i = " + i);
        }
    }
}
