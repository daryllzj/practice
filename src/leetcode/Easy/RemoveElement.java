package leetcode.Easy;

public class RemoveElement {

    public static void main(String[] args) {

        int[] intArray = new int[]{0,1,2,2,3,0,4,2};
        int result = removeElement(intArray, 2);

        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {

        int notVal = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val){
                int temp = nums[i];
                nums[notVal] = nums[i];
                nums[i] = temp;

                notVal++;
            }

        }

        return notVal;
    }

}
