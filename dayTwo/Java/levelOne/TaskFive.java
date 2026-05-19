import java.util.Scanner;
public class TaskFive{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        double celcius = inputCollector.nextDouble();
        
        double fahrenheit = (1.8 * celcius) + 32;
               
        System.out.printf("%.2f celcius is %.2f fahrenheit", celcius, fahrenheit);
    
    }

}
