package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 简单
 * <p>
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * <p>
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class _118_PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(_118_PascalsTriangle.generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
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
        return outerList;
    }
}
