package easy;

import java.util.*;

public class _136SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.add(num)) {

            } else {
                set.remove(num);
            }
        }
        return set.iterator().next();
    }

    public int singleNumber2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                list.remove(list.indexOf(num));
            } else {
                list.add(num);
            }
        }
        return list.get(0);
    }

    public int singleNumber3(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            } else if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1]) {
                    return nums[i];
                }
            } else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }
}