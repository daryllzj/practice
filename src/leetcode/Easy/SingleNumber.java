package leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2,2,1};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i] + 1));
            }
        }

        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().get();

    }

}
