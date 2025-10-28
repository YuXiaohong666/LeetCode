package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3354MakeArrayElementsEqualToZero {
    public int countValidSelections(int[] nums) {
        int ways = 0;
        // 正数为有方向，负数为左方向
        int directionCtrl = 1;
        List<Integer> list = new ArrayList<>();
//        挑选出有0的位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
//                记录值为0的索引值
                list.add(i);
            }
        }

        for (Integer integer : list) {
            {
                int[] checkArr = getInitialArr(nums);
                // 先向左进行检测
                directionCtrl = -1;
                int pointer = integer;
                while (pointer >= 0 && pointer < nums.length) {
                    if (checkArr[pointer] != 0) {
                        directionCtrl *= -1;
                        checkArr[pointer] -= 1;
                    }
                    pointer += directionCtrl;
                }
                Arrays.sort(checkArr);
                if (checkArr[checkArr.length - 1] == 0) {
                    // 说明全部清零了
                    ways++;
                }
            }
            {
                int[] checkArr = getInitialArr(nums);
                // 再向右进行检测
                directionCtrl = 1;
                int pointer = integer;
                while (pointer >= 0 && pointer < nums.length) {
                    if (checkArr[pointer] != 0) {
                        directionCtrl *= -1;
                        checkArr[pointer] -= 1;
                    }
                    pointer += directionCtrl;
                }
                Arrays.sort(checkArr);
                if (checkArr[checkArr.length - 1] == 0) {
                    // 说明全部清零了
                    ways++;
                }
            }
        }
        return ways;
    }

    public int[] getInitialArr(int[] nums) {
        int[] arr = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);

        return arr;
    }

    // 最优解0ms
    public int countValidSelections111(int[] nums) {
        int ways = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int left = 0;
                int right = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    right += nums[j];
                }
                for (int j = i - 1; j >= 0; j--) {
                    left += nums[j];
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
