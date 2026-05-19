import java.util.Scanner;
public class TaskSix{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = inputCollector.nextInt();
 
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.printf("%d is a leap year", year);  
        else 
            System.out.printf("%d is not a leap year", year);  

    }

}
