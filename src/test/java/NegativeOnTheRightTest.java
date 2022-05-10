import HW9part1.NegativeOnTheRight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testNegativeOnTheRight() {
        int[] incoming = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight negotiveOnTheRight = new NegativeOnTheRight();
        int[] actualResult = negotiveOnTheRight.negativeOnTheRight(incoming);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
