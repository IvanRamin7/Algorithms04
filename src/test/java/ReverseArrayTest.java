import HW9part1.ReverseArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ReverseArrayTest {


    @Test
    public void testReverseArray() {
        int[] incoming = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArray(incoming);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
