package HW9part1;

public class GivenIntegerM {

    public String GivenIntegerM(Integer M) {
        if (M % 3 == 0 && M % 5 == 0) {
            return "Good Number";
        } else if (M % 3 == 0 && M % 5 != 0) {
            return "Bad Number";
        } else if (M % 3 != 0 && M % 5 == 0) {
            return "Poor Number";
        }
        else return "-1";
    }
}
