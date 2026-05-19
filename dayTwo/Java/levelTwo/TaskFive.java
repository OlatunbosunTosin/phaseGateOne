import java.util.Scanner;
public class TaskFive{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();
        
        System.out.print("Enter third number: ");
        int thirdNumber = inputCollector.nextInt();
      
        int largestNumber = 0;
        
        if(firstNumber > secondNumber && firstNumber > thirdNumber)
            largestNumber = firstNumber;
        else if(secondNumber > firstNumber && secondNumber > thirdNumber)
            largestNumber = secondNumber;
        else 
            largestNumber = thirdNumber;
            
        System.out.print(largestNumber);  
    
    }

}
