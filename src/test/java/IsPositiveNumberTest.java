import HW9part1.IsPositiveNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void IsPositiveNumberHappyPath() {
        int incoming = 555;
        boolean expectedResult = true;

        IsPositiveNumber IsPositiveNumber = new IsPositiveNumber();
        boolean actualResult = IsPositiveNumber.IsPositiveNumber(incoming);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void IsPositiveNumberZero() {

        int incoming = 0;
        boolean expectedResult = true;

        IsPositiveNumber IsPositiveNumber = new IsPositiveNumber();
        boolean actualResult = IsPositiveNumber.IsPositiveNumber(incoming);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void IsPositiveNumberNegative() {
        int incoming = -555;
        boolean expectedResult = false;

        IsPositiveNumber IsPositiveNumber = new IsPositiveNumber();
        boolean actualResult = IsPositiveNumber.IsPositiveNumber(incoming);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
