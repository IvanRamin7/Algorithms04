package HW9part1;

public class PeakElement {
    public int[] peakElement(int[] incoming) {

        int counter = 0;
        int[] outcoming = {};
        if (incoming[counter] > incoming[counter + 1]) {
            counter++;
        }
        if (incoming[incoming.length - 2] < incoming[incoming.length - 1]) {
            counter++;
        }
        for (int i = 1; i < incoming.length - 1; i++) {
            if (incoming[i] > incoming[i - 1] && incoming[i] > incoming[i + 1]) {
                counter++;
            }
        }

        outcoming = new int[counter];
        counter = 0;
        if (incoming[counter] > incoming[counter + 1]) {
            outcoming[counter] = incoming[counter];
            counter++;
        }
        if (incoming[incoming.length - 2] < incoming[incoming.length - 1]) {
            outcoming[outcoming.length - 1] = incoming[outcoming.length - 1];
        }
        for (int i = 1; i < incoming.length - 1; i++) {
            if (incoming[i] > incoming[i - 1] && incoming[i] > incoming[i + 1]) {
                outcoming[counter] = incoming[i];
                counter++;
            }
        }


        return outcoming;
    }
}


