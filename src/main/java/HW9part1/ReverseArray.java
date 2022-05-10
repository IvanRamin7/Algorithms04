package HW9part1;

public class ReverseArray {
    public int[] reverseArray(int[] incoming) {
        int counter = 0;
        int[] outcoming = new int[incoming.length];
        for (int i = incoming.length - 1; i >= 0; i--) {
            outcoming[counter] = incoming[i];
            counter++;
        }
        return outcoming;
    }
}
