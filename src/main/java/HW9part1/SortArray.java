package HW9part1;

public class SortArray {
    public int[] sortArray(int[] incoming) {
        int[] outcoming = new int[incoming.length];
        int counter = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < outcoming.length; i++) {
            for (int j = 0; j < incoming.length; j++) {
                if (incoming[j] < min) {
                    min = incoming[j];
                    counter = j;
                }
            }
            outcoming[i] = min;
            min = Integer.MAX_VALUE;
            incoming[counter] = Integer.MAX_VALUE;
        }
        return outcoming;
    }
}
