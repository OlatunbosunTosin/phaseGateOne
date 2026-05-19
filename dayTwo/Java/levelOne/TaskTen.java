import java.util.Scanner;
public class TaskTen{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();
        
        System.out.print("Enter third number number: ");
        int thirdNumber = inputCollector.nextInt();
        
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
               
        System.out.printf("Average = %.2f", average);
    
    }

}
