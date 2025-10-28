package mid;

import javax.swing.*;
import java.util.*;

public class _03LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(_03LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
            } else {
                // 表示list中已经存放了该字符，删除重复字符及其前面的元素
                for (int j = list.indexOf(s.charAt(i)); j >= 0; j--) {
                    list.remove(j);
                }
                list.add(s.charAt(i));
            }
            if (length < list.size()) {
                length = list.size();
            }
        }
        return length;
    }
}
