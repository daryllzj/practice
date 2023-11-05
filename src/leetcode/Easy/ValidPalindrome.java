package leetcode.Easy;

public class ValidPalindrome {

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < s.length()/2; i++) {

            if (s.charAt(i) != s.charAt(s.length() - i -1)){
                return false;
            }
        }
        return true;

    }

}
