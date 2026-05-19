first_number = int(input("Enter first number: "))
second_number = int(input("Enter second number: "))
third_number = int(input("Enter third number: "))

largest_number = 0;
        
if(first_number > second_number and first_number > third_number):
    largest_number = first_number
elif(second_number > first_number and second_number > third_number):
    largest_number = second_number
else:
    largest_number = third_number     
    
print(largest_number)   


