package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class _66PlusOne {
    public int[] plusOne(int[] digits) {
        // 先判断一下最后一位是不是9
        boolean flag = true;
        int[] newArr = new int[digits.length + 1];
        // 先从后往前找一下是否全部都是9，只有这样才有添加新位数的需求
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                flag = false;
            }
        }
        // 并不全是9，所以不需要添加新位数
        if (!flag) {
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i]++;
                if (digits[i] == 10) {
                    digits[i] = 0;
                } else {
                    break;
                }
            }
            return digits;
        } else {
            newArr[0] = 1;
            for (int i = 1; i < newArr.length; i++) {
                newArr[i] = 0;
            }
            return newArr;
        }
    }
}
