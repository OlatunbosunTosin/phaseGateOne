public class LevelFour{

    public static void main(String[] args){
    
        System.out.println(addition(2,5));
        
        System.out.println(evenNumber(4));
        
        System.out.println(square(4)); 
        
        System.out.println(celciusToFarenheit(100));
                 
        System.out.println(primeNumber(5));   
        
        System.out.println(largest(5,8,6));
        
        System.out.println(simpleInterest(1500,2,5));               
    
        System.out.println(areaOfRectangle(5,10));
        
        System.out.println(numberReverse(1234));
        
        System.out.println(occurrenceOfCharacter("aaa"));
        
        
    
    }
  
    

    public static int addition(int numberOne, int numberTwo){
    
        return numberOne + numberTwo;
    
    }
    
    public static boolean evenNumber(int number){
    
        if (number % 2 == 0){
    
            return true;
            
        }return false;
    
    }
    
    public static int square(int number){

        return number * number;

    }
    
    public static double celciusToFarenheit(double celcius){

        return (1.8 * celcius) + 32;

    }
    
    public static boolean primeNumber(int number){
    
        int count = 0;
        for(int factor = 1; factor <= number; factor++){
        
            if (number % factor == 0)
                count++;

        }
        if (count == 2)
            return true;
            
         return false;
    
    }
    
    
    public static int largest(int numberOne, int numberTwo, int numberThree){
    
        int largest = numberOne;
        if(numberTwo > largest)
            largest = numberTwo;
            
        if(numberThree > largest)
            largest = numberThree;
            
        return largest;
    
    }
    
    
    public static double simpleInterest(double principal, double rate, double time){
   
        return (principal * rate * time) / 100.0;
    
    }
    
    
    public static double areaOfRectangle(double length, double width){
   
        return length * width;
    
    }
    
    
    public static int numberReverse(int number){
   
        int reversedNumber = 0;
        while(number > 0){
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        
        return reversedNumber;
    
    }
    
    
    public static int occurrenceOfCharacter(String word){
   
        int count = 0;
        for(int index = 0; index < word.length; index++){
        
            if ('a'.equals(charAt(index)))
                count++;
        
        }
        
        
        return count;
    
    }
    
    
   
    
    
    
    
    
    
    
    
    

}
