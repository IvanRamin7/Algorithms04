package HW9part1;

public class OddEven {
    /**
     * Создать алгоритм HW9part1.OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
     * и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     * 2147483647 + 1 →  “Undefined”
     *
     */

    public String OddEven (long incoming) {
        if (incoming > Integer.MAX_VALUE || incoming < Integer.MIN_VALUE) {

            return "Undefined";
        } else if (incoming % 2 == 0) {

            return "Even";
        } else if (incoming % 2 != 0) {

            return "Odd";
        } else return "Undefined";
    }

}
