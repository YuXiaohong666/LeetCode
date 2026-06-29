package easy;

public class _168ExcelSheetColumnTitle {

    public static void main(String[] args) {
        _168ExcelSheetColumnTitle obj = new _168ExcelSheetColumnTitle();
        System.out.println(obj.convertToTitle(52));
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        int remainder;
        while (columnNumber != 0) {
            columnNumber--;
            remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            columnNumber /= 26;
            result.insert(0, ch);
        }
        return result.toString();
    }
}
