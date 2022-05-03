import HW9part1.SumArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SumArrayTest {

    @Test
    public void SumArrayHappyPath() {
        int[] incoming = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray SumArray = new SumArray();
        int actualResult = SumArray.SumArray(incoming);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void SumArrayHappyPath2() {
        int[] incoming = {-7, -3};
        int expectedResult = -10;

        SumArray SumArray = new SumArray();
        int actualResult = SumArray.SumArray(incoming);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void SumArrayNull() {
        int[] incoming = null;
        int expectedResult = 0;

        SumArray SumArray = new SumArray();
        int actualResult = SumArray.SumArray(incoming);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
