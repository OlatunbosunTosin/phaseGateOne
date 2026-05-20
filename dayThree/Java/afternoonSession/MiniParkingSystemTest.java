import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniParkingSystemTest{

    @Test
    public void testForAvailableSpace(){
    
        int[] slot = {1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,1};
       
        assertEquals(MiniParkingSystem.spaceAvailability(slot,10,"yes"), 9);
    
    }
    
    @Test
    public void testForFilledSpace(){
    
        int[] slot = {1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,1};

        assertEquals(MiniParkingSystem.spaceFilled(slot,10,"yes"), 11);
    
    }
    
}
