import java.util.Scanner;
public class TaskNine{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter price of item: ");
        double price = inputCollector.nextDouble();
        double tax = (10.0 / 100.0) * price;
        
        double newPrice = price + tax;
               
        System.out.printf("New price after 10 percent added tax is %.2f", newPrice);
    
    }

}
