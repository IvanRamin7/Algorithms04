package HW9part1;

public class OddIndices {
    public int[] OddIndices(int[] incoming) {
        if (incoming != null) {
            int counter = 0;

            for (int i = 0; i < incoming.length; i++) {
                if (i % 2 != 0) {
                    counter++;
                }
            }

            int[] outcoming = new int [counter];
            counter = 0;

            for (int i = 0; i < incoming.length; i++) {
                if (i % 2 != 0) {
                    outcoming[counter] = incoming[i];
                    counter++;
                }
            }
            return outcoming;
        }
        else return new int[]{};
    }
}
