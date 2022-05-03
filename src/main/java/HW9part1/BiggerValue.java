package HW9part1;

public class BiggerValue {

    public int BiggerValue (int first, int second) {
        if (first != second && first <= Integer.MAX_VALUE && first >= Integer.MIN_VALUE
        && second <= Integer.MAX_VALUE && first >= Integer.MIN_VALUE) {
            if (first > second) {
                return first;
            } else return second;
        }
        return 0;
    }
}
