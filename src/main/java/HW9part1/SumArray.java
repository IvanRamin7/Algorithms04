package HW9part1;

public class SumArray {
    public int SumArray(int[] incoming) {
        if(incoming != null && incoming.length > 0) {
            int sum = 0;
            for (int i = 0; i < incoming.length; i++) {
                 sum += incoming[i];
            }
            return sum;
        }
        else return 0;
    }
}
