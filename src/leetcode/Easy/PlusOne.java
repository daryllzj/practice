package leetcode.Easy;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {4,3,2,1};

        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length -1; i >= 0 ; i--) {

            if (digits[i] != 9){
                digits[i] = digits[i] + 1;
                break;
            }

            if (i == 0){
                int[] newArr = new int[digits.length + 1];
                newArr[0] = 1;
                return newArr;
            }

            if (digits[i] == 9){
                digits[i] = 0;
            }
            
        }

        return digits;
    }

}
