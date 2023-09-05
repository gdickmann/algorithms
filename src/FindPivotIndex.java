import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = new int[] {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    private static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int total = Arrays.stream(nums).sum();

        for (int i = 0; i <= nums.length; i++) {
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) return i;

            leftSum += nums[i];
        }
        return -1;
    }
}
