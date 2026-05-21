import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemoveDuplicateTest{

    @Test
    public void testThatDuplicateNumbersAreRemoved(){
    
        int [] number = {9,4,5,9,1,3,5,6};
        int [] expectedList = {9,4,5,1,3,6,0,0};
        int [] actualList = RemoveDuplicate.Duplicate(number);
        assertArrayEquals(expectedList,actualList);
        
    }
    

}
