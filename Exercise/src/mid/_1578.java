package mid;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 1578. 使绳子变成彩色的最短时间
 * 中等
 * <p>
 * 提示
 * Alice 把 n 个气球排列在一根绳子上。给你一个下标从 0 开始的字符串 colors ，其中 colors[i] 是第 i 个气球的颜色。
 * <p>
 * Alice 想要把绳子装扮成 五颜六色的 ，且她不希望两个连续的气球涂着相同的颜色，所以她喊来 Bob 帮忙。Bob 可以从绳子上移除一些气球使绳子变成 彩色 。
 * 给你一个 下标从 0 开始 的整数数组 neededTime ，其中 neededTime[i] 是 Bob 从绳子上移除第 i 个气球需要的时间（以秒为单位）。
 * <p>
 * 返回 Bob 使绳子变成 彩色 需要的 最少时间 。
 */
public class _1578 {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < colors.length() - 1; i++) {
            list.clear();
            list.add(neededTime[i]);
            for (int j = i; j < colors.length() - 1; j++) {
                if (colors.charAt(j) != colors.charAt(j + 1)) {
                    i = j;
                    break;
                } else {
                    list.add(neededTime[j + 1]);
                    if (j + 1 == colors.length() - 1) {
                        if (list.size() > 1) {
                            list.sort(Comparator.naturalOrder());
                            for (int k = 0; k < list.size() - 1; k++) {
                                time += list.get(k);
                            }
                        }
                        return time;
                    }
                }
            }
            if (list.size() > 1) {
                list.sort(Comparator.naturalOrder());
                for (int j = 0; j < list.size() - 1; j++) {
                    time += list.get(j);
                }
            }
        }
        return time;
    }
}
