package mid;

import javax.swing.*;

public class _5LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char pointer = s.charAt(i);
            int start = i - 1;
            int end = i + 1;
            StringBuilder tempStr;

            int self = i;
            int nextSelf = i + 1;
            {
                tempStr = new StringBuilder("" + pointer);
                // 适用于奇数位数
                while (start >= 0 && end < s.length()) {
                    if (s.charAt(start) == s.charAt(end)) {
                        tempStr.insert(0, s.charAt(start));
                        tempStr.append(s.charAt(end));
                        start--;
                        end++;
                    } else {
                        break;
                    }
                }
                if (str.length() < tempStr.length()) {
                    str = "" + tempStr;
                }
            }
            {
                tempStr = new StringBuilder("");
                // 适用于偶数位数
                while (self >= 0 && nextSelf < s.length()) {
                    if (s.charAt(self) == s.charAt(nextSelf)) {
                        tempStr.insert(0, s.charAt(self));
                        tempStr.append(s.charAt(nextSelf));
                        self--;
                        nextSelf++;
                    } else {
                        break;
                    }
                }
                if (str.length() < tempStr.length()) {
                    str = "" + tempStr;
                }
            }
        }
        return str;
    }
}
