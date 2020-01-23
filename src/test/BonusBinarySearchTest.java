package test;

import org.junit.Before;
import org.junit.Test;

import static main.BonusBinarySearch.binarySearch;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    int[] testArray;
    int[] testArray2;

    @Before
    public void setTestArrays() {
        testArray = new int[]{2, 52, 3, 91, 5, 21, 32, 21, 67, 1};
        testArray2 = new int[]{2, 52, 3, 91, 5, 33, 21, 32, 21, 67, 1};
    }

    //TODO: add tests here
    @Test
    public void findValueLeftSide() {
        assertEquals(2, binarySearch(testArray, 3), .001);
    }

    @Test
    public void findValueRightSideEvenSizedArray() {
        assertEquals(8, binarySearch(testArray, 67), .001);
    }

    @Test
    public void findValueMiddleLeftSideEvenSizedArray() {
        assertEquals(4, binarySearch(testArray, 5), .001);
    }

    @Test
    public void findValueMiddleRightSideEvenSizedArray() {
        assertEquals(5, binarySearch(testArray, 21), .001);
    }

    @Test
    public void findValueMiddleOddSizedArray() {
        assertEquals(5, binarySearch(testArray2, 33), .001);
    }

    @Test
    public void findLastValueOddSizedArray() {
        assertEquals(10, binarySearch(testArray2, 1), .001);
    }

    @Test
    public void findLastValueEvenSizedArray() {
        assertEquals(9, binarySearch(testArray, 1), .001);
    }

    @Test
    public void findFirstOddSizedArray() {
        assertEquals(0, binarySearch(testArray2, 2), .001);
    }

    @Test
    public void findFirstValueEvenSizedArray() {
        assertEquals(0, binarySearch(testArray, 2), .001);
    }

    @Test
    public void cannotFindValue() {

        assertEquals(-1, binarySearch(testArray, 99), .001);
    }



}
