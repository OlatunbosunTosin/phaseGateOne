public class MiniParkingSystem{

    public static int spaceAvailability(int[] slot, int slotNumber, String response){
    
        int availableSpace = 0;
        
          
        for(int index = 0; index < slot.length; index++){
        
            if (slot[index] == 0){
                slot[index] = 1;
                break; 
            }
        }
        
        if (response.equals("yes"))
            
            slot[slotNumber-1] = 0;
            
        
        for(int index = 0; index < slot.length; index++){
            
            if (slot[index] == 0)
                availableSpace += 1;
            
        }return availableSpace;
        
        
    
    }

    public static int spaceFilled(int[] slot, int slotNumber, String response){
    
        int space = spaceAvailability(slot, slotNumber, response);
        int filledSpace = slot.length - space;
        return filledSpace;
        
    
    }


}
