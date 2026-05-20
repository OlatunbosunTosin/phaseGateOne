def space_availability(slot, slot_number, response):
    
    available_space = 0

      
    for index in range(len(slot)):

        if slot[index] == 0:
            slot[index] = 1
            break

    if response == "yes":
        
        slot[slot_number-1] = 0
        

    for index in range(len(slot)):
        
        if slot[index] == 0:
            available_space += 1
        
    return available_space
        
        
    
def space_filled(slot, slot_number, response):
    
    space = space_availability(slot, slot_number, response)
    filled_space = len(slot) - space
    return filled_space
        
    
    



