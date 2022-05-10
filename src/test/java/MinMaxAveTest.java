
import HW9part1.MinMaxAve;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
    @Test
    public void testMinMaxAve() {
        int[] incoming = {1, 2, 3, 4, 5, 6, 7, 8};
        int first = 2;
        int second = 6;
        int[] expected = {3, 7, 5};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAve(incoming, first, second);

        Assertions.assertArrayEquals(expected, actualResult );


    }
}
