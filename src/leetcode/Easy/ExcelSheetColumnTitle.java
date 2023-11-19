package leetcode.Easy;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {

        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0){

            columnNumber -= 1;
            result.insert(0, (char) (columnNumber % 26 + 'A'));
            columnNumber = columnNumber / 26;
        }
        return result.toString();

    }

}
