import HW9part1.OddIndices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void OddIndicesHappyPath() {
        int[] input = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices OddIndices = new OddIndices();
        int[] actualResult = OddIndices.OddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void OddIndicesNull() {
        int[] input = null;
        int[] expectedResult = new int []{};

        OddIndices OddIndices = new OddIndices();
        int[] actualResult = OddIndices.OddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
