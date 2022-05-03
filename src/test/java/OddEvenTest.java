import HW9part1.OddEven;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {



    @Test
    public void OddEvenHappyPath() {
        long OddNumber = -345L;
        String expectedResult = "Odd";

        OddEven OddEven = new OddEven();
        String actualResult = OddEven.OddEven(OddNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OddEvenZero() {
        long zero = 0L;
        String expectedResult = "Even";

        OddEven OddEven = new OddEven();
        String actualResult = OddEven.OddEven(zero);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OddEven222222 () {
        long incoming = 222222;
        String expectedResult = "Even";

        OddEven OddEven = new OddEven();
        String actualResult = OddEven.OddEven(incoming);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OddEvenUndefined () {
        long incoming = 2147483647 + 1L;
        String expectedResult = "Undefined";

        OddEven OddEven = new OddEven();
        String actualResult = OddEven.OddEven(incoming);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
