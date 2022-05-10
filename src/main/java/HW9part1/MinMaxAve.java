package HW9part1;

public class MinMaxAve {
    public int[] MinMaxAve(int[] incomingArr, int first, int second) {
        if (first != second && first < second) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = first; i <= second; i++) {
                sum += incomingArr[i];
                if (incomingArr[i] < min) {
                    min = incomingArr[i];
                }
                if (incomingArr[i] > max) {
                    max = incomingArr[i];
                }
            }
            return new int[] {min, max, sum / (second - first + 1)};
        } else return new int[]{};
    }
}
