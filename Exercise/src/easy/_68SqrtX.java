package easy;

public class _68SqrtX {
    public static void main(String[] args) {
        System.out.println(_68SqrtX.mySqrt(9));
    }

    public static int mySqrt(int x) {
        double start = 0;
        double end = x;
        double mid;
        while ((int) Math.floor(start) != (int) Math.floor(end)) {
            mid = (start + end) / 2;
            if (mid * mid > x) {
//                说明区间在start-mid之间
                end = mid;
            } else {
//                说明区间在mid-end之间
                start = mid;
            }
        }
        return (int) Math.floor(start);
    }
}
