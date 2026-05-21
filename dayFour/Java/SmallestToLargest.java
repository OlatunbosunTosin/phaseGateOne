public class SmallestToLargest{

    public static int[] ArrayOfSmallestToLargest(int[] numberList){
    
        int largest = numberList[0];
        int smallest = numberList[0];
        for(int number = 0; number < numberList.length; number++){
            
            if (numberList[number] > largest)
            
                largest = numberList[number];
                
            if (numberList[number] < smallest)
            
                smallest = numberList[number];

        }
        
        int[] newArray = new int[(largest-smallest)+1];
        int count = 0;
        for(int number = smallest; number < largest+1; number++){
        
            newArray[count] = number;
            count++;
        
        }
        
        return newArray;
    
    
    }


}




