package easy;

import java.util.HashSet;
import java.util.Set;

public class _202_HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            boolean flag = set.add(n);

            if (!flag) {
                return false;
            }
            n = this.getNext(n);
        }

        return true;
    }

    public boolean fastSlowSolution(int n) {
        int slow = n;
        int fast = this.getNext(n);

        while (slow != fast && fast != 1) {
            slow = this.getNext(slow);
            fast = this.getNext(this.getNext(fast));
        }

        return fast == 1;
    }

    public int getNext(int n) {
        int count = 0;

        while (n != 0) {
            count += (int) Math.pow(n % 10, 2);
            n /= 10;
        }

        return count;
    }
}
