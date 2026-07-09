package easy;

import java.util.HashSet;
import java.util.Set;

public class _219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        _219_ContainsDuplicateII obj = new _219_ContainsDuplicateII();
        obj.containsNearbyDuplicate2(new int[]{1, 2, 3, 1, 2, 3}, 2);
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() == k + 1) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
