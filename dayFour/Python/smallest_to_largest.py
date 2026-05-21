def smallest_to_largest_of(number_list):
    new_list = []
    smallest = number_list[0]
    largest = number_list[0]
    for count in range(len(number_list)):
        
        if number_list[count] > largest:
            
            largest = number_list[count]
            
        
        if number_list[count] < smallest:
            
            smallest = number_list[count]
  
            
    for new_number in range(smallest, largest+1):
    
        new_list.append(new_number)
      
            
    return new_list
    


