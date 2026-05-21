import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SmallestToLargestTest{

    @Test
    public void testThatNumbersFromSmallestToLargestIsReturened(){
    
        int [] number = {5,19,5,1,6};
        int [] expectedList = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int [] actualList = SmallestToLargest.ArrayOfSmallestToLargest(number);
        assertArrayEquals(expectedList,actualList);
        
    }
    
    
    @Test
    public void testThatNumbersFromSmallestToLargestIsReturenedTwo(){
    
        int [] number = {10,6,3,2};
        int [] expectedList = {2,3,4,5,6,7,8,9,10};
        int [] actualList = SmallestToLargest.ArrayOfSmallestToLargest(number);
        assertArrayEquals(expectedList,actualList);
        
    }
    
}
