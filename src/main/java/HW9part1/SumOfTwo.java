package HW9part1;

public class SumOfTwo {
    public int[][] sumOfTwo(int[] incoming, int n) {
        int amountOfCoincidence = 0;
        for (int i = 0; i < incoming.length; i++) {
            for (int j = i; j < incoming.length; j++) {
                if (incoming[i] + incoming[j] == n) {
                    amountOfCoincidence++;
                }
            }
        }
        int[][] outcoming = new int[amountOfCoincidence][2];
        int counterArray = 0;
        int deepArrayCounter = 0;
        for (int i = 0; i < incoming.length; i++) {
            for (int j = i; j < incoming.length; j++) {
                if (incoming[i] + incoming[j] == n) {
                    outcoming[counterArray][deepArrayCounter] = incoming[i];
                    outcoming[counterArray][deepArrayCounter + 1] = incoming[j];
                    counterArray++;
                }
            }
        }
        return outcoming;
    }
}
