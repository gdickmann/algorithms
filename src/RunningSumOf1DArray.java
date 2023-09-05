public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4};
        int[] response = runningSum(nums);

        for (int i : response) {
            System.out.println(i);
        }
    }

    private static int[] runningSum(int[] nums) {
        int[] response = new int[nums.length];
        response[0] = nums[0];

        int previousElements = nums[0];

        for (int i = 1; i < nums.length; i++) {
            response[i] = nums[i] + previousElements;
            previousElements += nums[i];
        }

        return response;
    }
}
