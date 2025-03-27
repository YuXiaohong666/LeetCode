package easy;

public class _58LengthOfLastWord {
    public static void main(String[] args) {
        _58LengthOfLastWord test = new _58LengthOfLastWord();
        System.out.println(test.lengthOfLastWord("   fly me   to   the moon  "));
    }

    public int lengthOfLastWord(String s) {
        char[] ch = s.toCharArray();
        int len = ch.length - 1;

        // 在涉及到频繁对字符串增删改查的操作时务必使用StringBuffer和StringBuilder
        // StringBuffer线程安全，效率稍低
        // 使用StringBuilder的效率更高，但是线程不安全（不过在此处不需要担心线程安全问题）
        StringBuilder word = new StringBuilder();

        while (len >= 0) {
            if ((word.length() == 0) && ch[len] == ' ') {
                len--;
            } else if (ch[len] != ' ') {
                word.append(ch[len]);
                len--;
            } else if ((word.length() > 0) && ch[len] == ' ') {
                break;
            }
        }

        return word.length();
    }
}
