package easy;

public class _67AddBinary {
    public static String Solution(String a, String b) {
        StringBuilder aSB = new StringBuilder(a);
        StringBuilder bSB = new StringBuilder(b);

        if (aSB.length() > bSB.length()) {
//            补齐剩余位数
            int lengthDelta = aSB.length() - bSB.length();
            for (int i = 0; i < lengthDelta; i++) {
                bSB.insert(0, "0");
            }
        } else {
            //            补齐剩余位数
            int lengthDelta = bSB.length() - aSB.length();
            for (int i = 0; i < lengthDelta; i++) {
                aSB.insert(0, "0");
            }
        }

//        进行相加操作
        for (int i = aSB.length() - 1; i >= 0; i--) {
            int data = Integer.parseInt(String.valueOf(aSB.charAt(i))) + Integer.parseInt(String.valueOf(bSB.charAt(i)));
            if (data > 1) {
//                向前进位，本位置0
                if (data == 2) {
                    aSB.replace(i, i + 1, "0");
                } else if (data == 3) {
                    aSB.replace(i, i + 1, "1");
                }

                if (i - 1 >= 0) {
                    int data1 = Integer.parseInt(String.valueOf(aSB.charAt(i - 1))) + 1;
                    aSB.replace(i - 1, i, data1 + "");
                } else {
                    aSB.insert(0, "1");
                }
            } else {
                aSB.replace(i, i + 1, data + "");
            }
        }
        return String.valueOf(aSB).isEmpty() ? "0" : String.valueOf(aSB);
    }
}
