function smallestToLargestOf(numberList){
    newList = []
    let smallest = numberList[0]
    let largest = numberList[0]
    for(number = 0; number < numberList.length; number++){
            
        if (numberList[number] > largest)
        
            largest = numberList[number];
            
        if (numberList[number] < smallest)
        
            smallest = numberList[number];

    }
        
    let count = 0;
    for(number = smallest; number < largest+1; number++){
    
        newList[count] = number;
        count++;
    
    }

    return newList;
}
    
module.exports = {smallestToLargestOf};
    


