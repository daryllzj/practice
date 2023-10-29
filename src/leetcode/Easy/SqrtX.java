package leetcode.Easy;

public class SqrtX {

    public static void main(String[] args) {
        int n = 30;

        System.out.println(mySqrt(n));
    }

    public static int mySqrt(int x) {

        if (x <2) return x;

        int low = 1;
        int high = x;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (mid * mid == x){
                return mid;
            } else if ((long) mid * mid < (long) x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return Math.round(high);
    }

}
