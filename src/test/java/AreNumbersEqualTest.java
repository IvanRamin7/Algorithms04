import HW9part1.AreNumbersEqual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void AreNumbersEqualTestHappyPath() {
        int first = 89;
        int second = 89;
        int expectedResult = 0;

        AreNumbersEqual AreNumbersEqual = new AreNumbersEqual();
        int actualResult = AreNumbersEqual.AreNumbersEqual(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void AreNumbersEqualTest2() {
        int first = -89;
        int second = 89;
        int expectedResult = -1;

        AreNumbersEqual AreNumbersEqual = new AreNumbersEqual();
        int actualResult = AreNumbersEqual.AreNumbersEqual(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void AreNumbersEqualTest3() {
        int first = 89;
        int second = -89;
        int expectedResult = 1;

        AreNumbersEqual AreNumbersEqual = new AreNumbersEqual();
        int actualResult = AreNumbersEqual.AreNumbersEqual(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
