import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ListAdditionAndTargetTest{

    @Test
    public void testForFirstArrayOfNumbersThatGiveTargetNumber(){
    
        int [] number = {8,6,12,4,-2};
        int [] expectedList = {8,-2};
        int [] actualList = ListAdditionAndTarget.addition(number, 6);
        assertArrayEquals(expectedList,actualList);
        
    }
    
    
    @Test
    public void testForSecondArrayOfNumbersThatGiveTargetNumber(){
        
        int [] number = {1,2,5,7,6,8,9};
        int [] expectedList = {5,7};
        int [] actualList = ListAdditionAndTarget.addition(number, 12);
        assertArrayEquals(expectedList,actualList);
    

    }


}
