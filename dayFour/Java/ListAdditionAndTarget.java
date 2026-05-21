public class ListAdditionAndTarget{

    public static int[] addition(int[] numberList, int targetNumber){
    
        int[] newArray = new int [2];
        for(int number = 0; number < numberList.length; number++){
    
            for(int index = number+1; index < numberList.length; index++){
            
                if (numberList[number] + numberList[index] == targetNumber){
                
                    newArray[0] = numberList[number];
                    newArray[1] = numberList[index];
                    break;
                }
                
            }
            
        } return newArray;    
        
    }

}


    
    
