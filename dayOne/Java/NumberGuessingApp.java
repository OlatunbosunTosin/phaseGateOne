import java.util.Random;
import java.util.Scanner;
public class numberGuessingApp{

    public static void main(String[] args){

        int count = 0;
        while (true){
        
            Random generator = new Random();
            Scanner input = new Scanner(System.in);
            int randomNumber = generator.nextInt(1,100);
            System.out.print("Enter a number: ");
            int userNumber = input.nextInt();
    
            if(userNumber < 1 || userNumber > 100)
                System.out.print("only numbers between 1 and 100");
            else
                count += 1;
        
            while(count < 5){
                
                if (userNumber > randomNumber)
                    System.out.println("Answer is lower");
                    
                if (userNumber < randomNumber)
                    System.out.println("Answer is higher");   

                System.out.print("Enter a number: ");
                userNumber = input.nextInt();
                
                if(userNumber < 1 || userNumber > 100)
                    System.out.println("only numbers between 1 and 100");
                else
                    count += 1;
            }
            
                   
                
        if (userNumber == randomNumber)
            System.out.println("Correct"); 
        
        if (count == 1)
            System.out.println("Rating is Legendary");   
        else if (count == 2)
            System.out.println("Rating is Excellent");
        else if (count == 3 || count == 4)
            System.out.println("Rating is Good");
        else if (count == 5)
            System.out.println("Rating is Close!") ;
            
        if (userNumber != randomNumber)
            System.out.println("Better luck") ; 
        
        System.out.printf("Correct number is %d, you made %d attempts", randomNumber, count);
        break;

        }      
        
    }

}
    
