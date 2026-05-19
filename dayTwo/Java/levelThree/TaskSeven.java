import java.util.Scanner;
public class TaskSeven{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        int number = 0;
        
        int count = 0;
        int sum = 0;
        while(count < 5){
        
            System.out.print("Enter a number: ");
            number = input.nextInt();
            count += 1;
            sum += number;
            
        
        }System.out.print(sum);
       
    
    }

}
