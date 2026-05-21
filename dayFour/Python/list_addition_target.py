def addition(number_list, target_number):
    new_list = []
    for number in range(len(number_list)):
    
            for index in range(number+1,len(number_list)):
            
                if number_list[number] + number_list[index] == target_number:
                
                    new_list.append(number_list[number]) 
                    new_list.append(number_list[index])
                    break
            
    return new_list

