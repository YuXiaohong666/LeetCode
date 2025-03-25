package easy;

public class _28 {
    public static void main(String[] args) {
        _28 test = new _28();
        System.out.println(test.strStr("accsadakam", "sad"));
    }

    public int strStr(String haystack, String needle) {
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        if (hay.length < need.length) return -1;
        for (int i = 0; i < hay.length; i++) {
            if (hay[i] == need[0]) {
                boolean flag = true;
                if (i + need.length > hay.length) {
                    return -1;
                }
                for (int j = 0; j < need.length; j++) {
                    if (hay[i + j] != need[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
        }
        return -1;
    }
}
