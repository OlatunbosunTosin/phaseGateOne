def addition(number_one, number_two):

    return number_one + number_two


def even_number(number):

    if number % 2 == 0:

        return True
        
    return False



def square(number):

    return number * number



def celcius_to_farenheit(celcius):

    return (1.8 * celcius) + 32



def prime_number(number):

    count = 0
    for factor in range(1, number+1):
    
        if number % factor == 0:
            count += 1

    
    if count == 2:
        return True
        
    return False


def largest(number_one, number_two, number_three):

    largest = number_one
    if(number_two > largest):
        largest = number_two
        
    if(number_three > largest):
        largest = number_three
        
    return largest




def simple_interest(principal, rate, time):

    return (principal * rate * time) / 100.0




def area_of_rectangle(length, width):

    return length * width



def number_reverse(number):

    reversedNumber = 0
    while(number > 0):
        remainder = number % 10
        reversedNumber = reversedNumber * 10 + remainder
        number = number // 10
    
    return reversedNumber
    
def character_occurrence(word):
    count = 0
    for character in word:
        if "o" == character:
            count += 1
    
    return count
    

print(addition(2,5))

print(even_number(4))

print(square(4))

print(celcius_to_farenheit(100))
         
print(prime_number(5))   

print(largest(5,8,6))

print(simple_interest(1500,2,5))              

print(area_of_rectangle(5,10))

print(number_reverse(1234))

print(character_occurrence("Tosin"))



    
    
    
