import HW9part1.SortArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;


public class SortArrayTest {

    @Test
    public void testSortArray() {
        int[] incoming = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArray(incoming);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
