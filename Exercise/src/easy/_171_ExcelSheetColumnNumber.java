package easy;

public class _171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int count = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            count += (int) ((columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, columnTitle.length() - i - 1));
        }
        return count;
    }
}
