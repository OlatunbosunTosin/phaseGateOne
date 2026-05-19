import java.util.Scanner;
public class TaskEight{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int sum = 0;
        while(number != 0){
        
            sum += number;
            System.out.print("Enter a number: ");
            number = input.nextInt();
            
            
        
        }System.out.print(sum);
       
    
    }

}
