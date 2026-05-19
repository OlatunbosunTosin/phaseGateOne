import java.util.Scanner;
public class TaskSeven{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = inputCollector.nextDouble();

        double area = 2 * (22.0 / 7) * radius;
               
        System.out.printf("Area = %.2f", area);
    
    }

}
