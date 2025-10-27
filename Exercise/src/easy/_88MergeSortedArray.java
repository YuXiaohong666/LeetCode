package easy;

import java.util.Arrays;

/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * <p>
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * <p>
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
 * 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class _88MergeSortedArray {
    public static void main(String[] args) {
        _88MergeSortedArray.merge(new int[]{1, 5, 6, 9, 18, 0, 0, 0, 0, 0}, 5, new int[]{1, 2, 7, 10, 11}, 5);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        先整合在一起
        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }

//        再进行排序
        Arrays.sort(nums1);
    }
}
