package easy;

public class _3370SmallestNumberWithAllSetBits {
    public int smallestNumber(int n) {
        int MI = 0;
        while (true) {
            if (Math.pow(2, MI) - 1 < n) {
                MI++;
            } else {
                break;
            }
        }
        return (int) Math.pow(2, MI) - 1;
    }
}
