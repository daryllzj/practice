package leetcode.Easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {

        int lenHayStack = haystack.length();
        int lenNeedle = needle.length();
        int diff = lenHayStack - lenNeedle;

        if (diff < 0) return -1;

        for (int i = 0; i <= lenHayStack - lenNeedle; i++) {

            if (haystack.substring(i, i + lenNeedle).equals(needle)){
                return i;
            }
            
        }

        return -1;
    }

}
