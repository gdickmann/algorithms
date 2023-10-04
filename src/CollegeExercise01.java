public class CollegeExercise01 {
    public static void main(String[] args) {
        int[][] input = new int[2][2];

        input[1][1] = 10;
        input[1][2] = 29;

        input[2][1] = 33;
        input[2][2] = 7;

        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i][j] >= maxA) {
                    maxA = input[i][j];
                }

                if (input[i][j] >= maxB) {
                    maxA = input[i][j];
                }
            }
        }

        int response = maxA * maxB;
    }
}
