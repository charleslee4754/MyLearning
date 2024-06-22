import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static java.util.Arrays.binarySearch;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    @DisplayName("binarySearchBase find")
    public void test() {
        int[] a = {3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(4, BinarySearch.binarySearchBase(a, 7));
        assertEquals(0, BinarySearch.binarySearchBase(a, 3));
    }
   @Test
   @DisplayName("binarySearchBase not find")
    public void test2(){
        int[] a = {3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(-1,BinarySearch.binarySearchBase(a,11));
    }
}
