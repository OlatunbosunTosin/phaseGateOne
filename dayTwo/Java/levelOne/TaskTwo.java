import java.util.Scanner;
public class TaskTwo{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("How old are you: ");
        int age = inputCollector.nextInt();
               
        System.out.printf("You will be %d years old in 5 years", age + 5);
    
    }

}
