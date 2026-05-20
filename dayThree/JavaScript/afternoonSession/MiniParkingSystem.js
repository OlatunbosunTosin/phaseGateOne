function spaceAvailability(slot, slotNumber, response){
    
    availableSpace = 0

      
    for(index = 0; index < slot.length; index++){

        if (slot[index] == 0){
            slot[index] = 1;
            break; 
        }
        
    }

    if (response.equals("yes"))
        
        slot[slotNumber-1] = 0;
    

    for(index = 0; index < slot.length; index++){
        
        if (slot[index] == 0)
            availableSpace += 1;
        
    }return availableSpace;
}       
        
    
function spaceFilled(slot, slotNumber, response){

    let space = spaceAvailability(slot, slotNumber, response);
    let filledSpace = slot.length - space;
    return filledSpace;
        
}   
    
module.exports = {spaceAvailability, spaceFilled}



