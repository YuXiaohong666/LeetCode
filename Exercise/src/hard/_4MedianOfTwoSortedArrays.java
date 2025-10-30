package hard;

import java.util.Arrays;

public class _4MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            mergeArr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            mergeArr[nums1.length + i] = nums2[i];
        }

        Arrays.sort(mergeArr);
        if (mergeArr.length % 2 == 0) {
            return (double) (mergeArr[mergeArr.length / 2 - 1] + mergeArr[mergeArr.length / 2]) / 2;
        } else {
            return mergeArr[(int) Math.ceil((double) mergeArr.length / 2) - 1];
        }
    }
}
