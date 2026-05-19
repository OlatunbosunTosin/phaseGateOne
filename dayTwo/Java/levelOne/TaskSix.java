import java.util.Scanner;
public class TaskSix{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter length of triangle: ");
        double length = inputCollector.nextDouble();
        
        System.out.print("Enter width of triangle: ");
        double width = inputCollector.nextDouble();

        double area = length * width;
               
        System.out.printf("Area = %.2f", area);
    
    }

}
