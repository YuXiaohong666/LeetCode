package easy;

import java.util.Arrays;

public class _27 {
    public static void main(String[] args) {
        _27 test = new _27();
        test.removeElement(new int[]{}, 2);
    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        System.out.println(left + Arrays.toString(nums));
        return left;
    }
}