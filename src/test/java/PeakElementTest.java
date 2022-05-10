import HW9part1.PeakElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PeakElementTest {

    @Test
    public void testPeakElement() {
        int[] incoming = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement peakElement = new PeakElement();
        int[] actualResult = peakElement.peakElement(incoming);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testPeakElementNegative() {
        int[] incoming = {-3, 2, -7, 5, 1, 9, 23, 1};
        int[] expectedResult = {2, 5, 23};

        PeakElement peakElement = new PeakElement();
        int[] actualResult = peakElement.peakElement(incoming);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
