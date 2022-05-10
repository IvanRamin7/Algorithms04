package HW9part1;

public class Intersection {
    public int[] intersection(int[] first, int[] second) {
        int counterLength = 0;

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    counterLength++;
                }
            }
        }
        int[] outcoming = new int[counterLength];
        counterLength = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    outcoming[counterLength] = first[i];
                    counterLength++;
                }
            }
        }
        return outcoming;


    }

}
