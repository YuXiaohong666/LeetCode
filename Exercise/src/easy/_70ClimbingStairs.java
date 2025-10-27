package easy;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class _70ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(_70ClimbingStairs.climbStairs(4));
    }

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int result = 1 + 2;
            int a = 1, b = 2;
            for (int i = 3; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }
}
