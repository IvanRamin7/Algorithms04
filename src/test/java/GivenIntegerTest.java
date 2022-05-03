import HW9part1.GivenIntegerM;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GivenIntegerTest {

    @Test
    public void GivenIntegerTestHappyPath() {
        int number = 15;
        String expectedResult = "Good Number";

        GivenIntegerM GivenIntegerM = new GivenIntegerM();
        String actualResult = GivenIntegerM.GivenIntegerM(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GivenIntegerTest2() {
        int number = 6;
        String expectedResult = "Bad Number";

        GivenIntegerM GivenIntegerM = new GivenIntegerM();
        String actualResult = GivenIntegerM.GivenIntegerM(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GivenIntegerTest3() {
        int number = 55;
        String expectedResult = "Poor Number";

        GivenIntegerM GivenIntegerM = new GivenIntegerM();
        String actualResult = GivenIntegerM.GivenIntegerM(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GivenIntegerTest4() {
        int number = 22;
        String expectedResult = "-1";

        GivenIntegerM GivenIntegerM = new GivenIntegerM();
        String actualResult = GivenIntegerM.GivenIntegerM(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
