package leetcode.Easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        Boolean result = isPalindrome(12321);

        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {

        String intInString = String.valueOf(x);
        int lenOfString = intInString.length();

        for (int i = 0; i < lenOfString/2; i++) {

            if (intInString.charAt(i) != intInString.charAt(lenOfString - i -1)){
                return false;
            }
        }
        return true;
    }

}
