package HW9part1;

public class NegativeOnTheRight {
    public int[] negativeOnTheRight(int[] incoming) {
        int[] outcoming = new int[incoming.length];
        int counter = 0;
        for (int i = 0; i < incoming.length; i++) {
            if (incoming[i] > 0) {
                outcoming[counter] = incoming[i];
                counter++;
            }
        }
        for (int i = 0; i < incoming.length; i++) {
            if (incoming[i] < 0){
                outcoming[counter] = incoming[i];
                counter++;
            }
        }
        return outcoming;
    }
}
