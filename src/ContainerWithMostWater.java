public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] request = new int[] {1,2,3,4,5,25,24,3,4};
        int response = maxArea(request);
    }

    public static int maxArea(int[] height) {
        // please don't put me at r/programminghorror

        if (height.length == 1) return height[0] * 1;

        if (height.length == 2) {
            if (height[0] < height[1])
                return height[0] * 1;
            else
                return height[1] * 1;
        }

        int left = height[0];
        int increment = 1;

        int right = height[height.length - 1];
        int decrement = 1;

        int amount = 0;
        int size = height.length - 1;

        for (int i = 0; i < height.length; i++) {
            int currentBiggerAmount = 0;

            if (left < right || left == right ) {
                currentBiggerAmount = left * size;
                left = height[increment];

                increment++;
            } else {
                currentBiggerAmount = right * size;
                right = height[(height.length - 1) - decrement];

                decrement++;
            }

            size--;

            if (currentBiggerAmount > amount) amount = currentBiggerAmount;
            if (size == 0) break;
        }

        return amount;
    }
}
