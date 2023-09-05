import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int target = 5;

        int[] response = twoSum(nums, target);
        System.out.println(String.valueOf(response[0]) + String.valueOf(response[1]));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsHashMap = new HashMap<Integer, Integer>();
        numsHashMap.put(0, nums[0]);

        for (int i = 1; i <= nums.length; i++){
            int difference = target - nums[i];

            for (Map.Entry<Integer, Integer> value : numsHashMap.entrySet()){
                if (difference == value.getValue()) 
                    return new int[] {i, value.getKey()};
            }

            numsHashMap.put(i, nums[i]);
        }

        return new int[] {};
    }

}