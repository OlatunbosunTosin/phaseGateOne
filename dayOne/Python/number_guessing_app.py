import random
count = 0
while True:
    random_number = random.randint(1,100)
    user_number = int(input("Guess the number: "))
    
    if(user_number < 1 or user_number > 100):
        print("only numbers between 1 and 100")
    else:
        count += 1
        
    while(count < 5):
        
        if user_number > random_number:
            print("Answer is lower")
            
        if user_number < random_number:
            print("Answer is higher")
  

        user_number = int(input("Guess the number: "))
        
        if(user_number < 1 or user_number > 100):
            print("only numbers between 1 and 100")
        else:
            count += 1
            
    if user_number == random_number:
            print("Correct")
    
    if count == 1:
        print ("Rating is Legendary")     
    elif count == 2:
        print ("Rating is Excellent")
    elif count == 3 or count == 4:
        print ("Rating is Good")
    elif count == 5:
        print ("Rating is Close!") 
        
    if user_number != random_number:
            print("Better luck")  
    
    print(f"Correct number is {random_number}, you made {count} attempts")
    break        
        

    
