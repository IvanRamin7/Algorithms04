import HW9part1.BiggerValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void BiggerValueHappyPath() {
        int first = 3333;
        int second = 9999;
        int expectedResult = 9999;

        BiggerValue BiggerValue = new BiggerValue();
        int actualResult = BiggerValue.BiggerValue(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void BiggerValueEquals() {
        int first = 3333;
        int second = 3333;
        int expectedResult = 0;

        BiggerValue BiggerValue = new BiggerValue();
        int actualResult = BiggerValue.BiggerValue(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void BiggerValueIntegerMaxAndMin() {
        int first = Integer.MAX_VALUE;
        int second = Integer.MIN_VALUE;
        int expectedResult = Integer.MAX_VALUE;

        BiggerValue BiggerValue = new BiggerValue();
        int actualResult = BiggerValue.BiggerValue(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
