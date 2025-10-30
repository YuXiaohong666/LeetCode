package hard;

import java.util.Arrays;

/**
 * 1526. 形成目标数组的子数组最少增加次数
 * 困难
 * 提示
 * 给你一个整数数组 target 和一个数组 initial ，initial 数组与 target  数组有同样的维度，且一开始全部为 0 。
 * <p>
 * 请你返回从 initial 得到  target 的最少操作次数，每次操作需遵循以下规则：
 * <p>
 * 在 initial 中选择 任意 子数组，并将子数组中每个元素增加 1 。
 * 答案保证在 32 位有符号整数以内。
 */
public class _1526 {
    public static void main(String[] args) {
        System.out.println(_1526.minNumberOperations(new int[]{3, 1, 1, 2}));
    }

    // 差分思想
    public static int minNumberOperations(int[] target) {
        int opNum = target[0];
        for (int i = 1; i < target.length; i++) {
            opNum += Math.max(target[i] - target[i - 1], 0);
        }
        return opNum;
    }

    // 数据量过大的时候会超时
    public int solution1(int[] target) {
        int opNum = 0;
        int[] initial = new int[target.length];

        // 从0开始向后遍历，如果被检查的位置小于目标，则增加到队列中都进行加一操作，如果被检查目标等于目标则中断遍历
        for (int i = 0; i < target.length; i++) {
            while (initial[i] != target[i]) {
                for (int j = i; j < target.length; j++) {
                    if (initial[j] != target[j]) {
                        initial[j] += 1;
                    } else {
                        break;
                    }
                }
                System.out.println(Arrays.toString(initial));
                opNum++;
            }
        }
        return opNum;
    }
}
