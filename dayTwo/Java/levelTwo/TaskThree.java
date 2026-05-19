import java.util.Scanner;
public class TaskThree{

    public static void main(String[] args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter score: ");
        double score = inputCollector.nextDouble();
      
        if(score >= 50)
            System.out.print("pass");  
        else if(score < 50)
            System.out.print("fail");
    
    }

}
