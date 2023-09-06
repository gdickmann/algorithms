public class BubbleSort {
    public static void main(String[] args) {
        int[] input = new int[] {6, 5, 3, 1, 8, 7, 2, 4};
        int[] response = bubbleSort(input);
    }
    
    private static int[] bubbleSort(int[] input) {
        if (input.length == 0) return new int[] {};
        if (input.length == 1) return new int[] { input[0] };
        
        int pointerA = 0;
        int pointerB = 1;

        boolean swapped = false;

        for (int i = 0; i < input.length; i++) {

            if (pointerB > (input.length - 1)) {
                continue;
            }

            if (input[pointerA] > input[pointerB]) {
                swapped = true;

                int pointerAValue = input[pointerA];
                int pointerBValue = input[pointerB];
                
                input[pointerA] = pointerBValue;
                input[pointerB] = pointerAValue;
            }

            pointerA++;
            pointerB++;
        }
        
        if (swapped) {
            bubbleSort(input);
        } 

        return input;
    }

}
