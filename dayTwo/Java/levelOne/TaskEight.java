import java.util.Scanner;
public class TaskEight{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        
        int square = number * number;
               
        System.out.printf("Square of %d = %d", number, square);
    
    }

}
