package test;

import main.BonusBinarySearch;
import org.junit.Test;



import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    @Test
    public void returnsNegOneIfSearch3NotFound(){
        int[] sortedNumbers = {1,2,4,5};
        assertEquals(BonusBinarySearch.binarySearch(sortedNumbers,3),-1);
    }
}
