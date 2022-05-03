package HW9part1;

public class AreNumbersEqual {

    public int AreNumbersEqual(int first, int second) {
        if (first == second) {
            return 0;
        } else if (first > second) {
            return 1;
        } else return -1;
    }
}
