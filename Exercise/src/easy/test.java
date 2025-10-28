package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public int countValidSelections(int[] nums) {
        int ways = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int left = 0;
                int right = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (j < i) {
                        right += nums[j];
                    } else if (j > i) {
                        left += nums[j];
                    }
                }
                if (left == right) {
                    ways += 2;
                } else if (Math.abs(left - right) == 1) {
                    ways++;
                }
            }
        }
        return ways;
    }
}
