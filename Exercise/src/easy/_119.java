package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. 杨辉三角 II
 * 简单
 * <p>
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 */
public class _119 {
    public static void main(String[] args) {
        System.out.println(_119.getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        // if (rowIndex == 0) return new ArrayList<Integer>();
        List<List<Integer>> outerList = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    // 首位
                    innerList.add(1);
                } else if (j == i) {
                    // 末位
                    innerList.add(1);
                } else if (i >= 2) {
                    // 中间需要进行计算的部分
                    innerList.add(outerList.get(i - 1).get(j - 1) + outerList.get(i - 1).get(j));
                }
            }
            outerList.add(innerList);
        }
        return outerList.get(rowIndex);
    }
}
