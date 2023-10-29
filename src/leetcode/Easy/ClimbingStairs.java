package leetcode.Easy;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 4;

        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {

        int prev = 1;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }

        return curr;

    }

}
