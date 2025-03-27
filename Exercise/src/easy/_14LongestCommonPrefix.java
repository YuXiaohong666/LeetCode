package easy;

public class _14LongestCommonPrefix {

    public static void main(String[] args) {
        _14LongestCommonPrefix test = new _14LongestCommonPrefix();
        System.out.println(test.longestCommonPrefix(new String[]{""}));
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = compare(prefix, strs[i]);
        }
        return prefix;
    }

    public String compare(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        String res = "";
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                break;
            } else {
                res = res + str1.charAt(i);
            }
        }
        return res;
    }
}
