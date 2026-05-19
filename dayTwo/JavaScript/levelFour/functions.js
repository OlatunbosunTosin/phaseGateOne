function addition(numberOne, numberTwo){

    return numberOne + numberTwo
}

function evenNumber(number){

    if (number % 2 == 0)

        return true
        
    return false
}


function square(number){

    return number * number
}


function celciusToFarenheit(celcius){

    return (1.8 * celcius) + 32
}


function primeNumber(number){

    let count = 0
    for (let factor = 1; factor <= number; factor++)
    
        if (number % factor == 0)
            count += 1

    
    if (count == 2)
        return true
        
    return false
}    


function largest(numberOne, numberTwo, numberThree){

    let largest = numberOne
    if(numberTwo > largest)
        largest = numberTwo
        
    if(numberThree > largest)
        largest = numberThree
        
    return largest

}


function simpleInterest(principal, rate, time){

    return (principal * rate * time) / 100.0

}


function areaOfRectangle(length, width){

    return length * width

}

function numberReverse(number){

    let reversedNumber = 0
    while(number > 0){
    
        let remainder = number % 10
        reversedNumber = reversedNumber * 10 + remainder
        number = Math.round(number / 10)
        
    }
    return reversedNumber
}
    

console.log(addition(2,5))

console.log(evenNumber(4))

console.log(square(4))

console.log(celciusToFarenheit(100))
         
console.log(primeNumber(5))   

console.log(largest(5,8,6))

console.log(simpleInterest(1500,2,5))              

console.log(areaOfRectangle(5,10))

console.log(numberReverse(1234))


    
    
    
