package leetcode.Easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        nums1 = merge(nums1,m,nums2,n);

        System.out.println(Arrays.toString(nums1));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int mLast = m - 1;
        int nLast = n - 1;
        int totalLast = nums1.length - 1;

        while (nLast >= 0){

            if (mLast >= 0 && nums1[mLast] > nums2[nLast]){
                nums1[totalLast] = nums1[mLast];
                totalLast--;
                mLast--;
            } else {
                nums1[totalLast] = nums2[nLast];
                totalLast --;
                nLast --;
            }

        }

        return nums1;
    }

}
