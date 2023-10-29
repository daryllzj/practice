package leetcode.Easy;

public class AddBinary {

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {

        int num1 = Integer.parseInt(a, 2);

        int num2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(num1 + num2);

    }

}
