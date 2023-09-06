public class RemoveElement {

    public static void main(String[] args) {
        int[] input = new int[] {0,1,1,3,4};
        int value = 1;

        int response = removeElement(input, value);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
