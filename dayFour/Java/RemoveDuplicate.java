public class RemoveDuplicate{

    public static int[] Duplicate(int[] numberList){
    
        int[] newArray = new int [numberList.length];
        for(int number = 0; number < numberList.length; number++){
    
            for(int index = number+1; index < numberList.length; index++){
            
                if (numberList[number] != numberList[index]){
                
                    newArray[number] = numberList[index];
                    break;
                    
                }
                
            }
            
        } return newArray;    
        
    }
    

}


    
    
