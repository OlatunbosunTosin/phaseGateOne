function addition(numberList, targetNumber){
    let newList = []
    for(number = 0; number < numberList.length; number++){
    
        for(index = number+1; index < numberList.length; index++){
            
            if (numberList[number] + numberList[index] == targetNumber){
                
                newList[0] = numberList[number];
                newList[1] = numberList[index];
                break
            }
                
        }
     }     
    return newList
}

module.exports = {addition}


