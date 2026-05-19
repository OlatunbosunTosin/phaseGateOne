import java.util.Scanner;
public class TaskFour{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();
      
        if(firstNumber > secondNumber)
            System.out.print(firstNumber);  
        else if(firstNumber < secondNumber)
            System.out.print(secondNumber);  
    
    }

}
