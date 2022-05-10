import HW9part1.Intersection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTest {

    @Test
    public void testIntersection() {
        int[] incomingFirst = {1, 2, 4, 5, 89};
        int[] incomingSecond = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection Intersection = new Intersection();
        int[] actualResult = Intersection.intersection(incomingFirst, incomingSecond);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersection1() {
        int[] incomingFirst = {1, 2, 4, 5, 8, 9};
        int[] incomingSecond = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection Intersection = new Intersection();
        int[] actualResult = Intersection.intersection(incomingFirst, incomingSecond);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersection2() {
        int[] incomingFirst = {1, 2, 4, 5, 89};
        int[] incomingSecond = {8, 9, 45};
        int[] expectedResult = {};

        Intersection Intersection = new Intersection();
        int[] actualResult = Intersection.intersection(incomingFirst, incomingSecond);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
