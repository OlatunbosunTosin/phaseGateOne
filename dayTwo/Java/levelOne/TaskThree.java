import java.util.Scanner;
public class TaskThree{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();
               
        System.out.printf("Sum of %d and %d is %d", firstNumber,  secondNumber,firstNumber + secondNumber);
    
    }

}
