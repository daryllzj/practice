package leetcode.Easy;

public class LengthofLastWord {

    public static void main(String[] args) {
        String string = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(string));
    }

    public static int lengthOfLastWord(String s) {

        String[] stringArray = s.split(" ");

        return stringArray[stringArray.length-1].length();
    }

}
