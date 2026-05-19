def sort_array(prime_numbers):

    unsorted_prime_number = []
    for number in prime_numbers:
        
        count = 0
        for factor in range(1, number+1):
        
            if number % factor == 0:
                count += 1

        
        if count == 2:
            unsorted_prime_number.append(number)
            
    return unsorted_prime_number
    
    
def replace_negative_number(numbers):

    for index in range(0, len(numbers)):
        
        if numbers[index] < 0:
            numbers[index] = 0
            
    return numbers

    
def duplicates(numbers):

    duplicate_elements = []
    for index in range(0, len(numbers)):
        for indexes in range(index+1, len(numbers)):
        
            if numbers[index] == numbers[indexes]:
                duplicate_elements.append(numbers[index])
            
    return duplicate_elements
    
    
print(sort_array([5,9,3,6,2]))

print(replace_negative_number([5,-9,3,-6,2,-11]))

#print(move_zeros_to_end_of_array([5,0,3,0,2,0]))

print(duplicates([45,60,3,0,67,2,45,3,22,0]))


