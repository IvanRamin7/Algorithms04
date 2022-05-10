import HW9part1.SumOfTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {
    @Test
    public void testSumOfTwo() {
        int[] incoming = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwo(incoming, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
