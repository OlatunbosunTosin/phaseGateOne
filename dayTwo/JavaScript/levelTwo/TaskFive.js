const prompt = require("prompt-sync")();

let firstNumber = Number(prompt("Enter first number: "));
let secondNumber = Number(prompt("Enter second number: "));
let thirdNumber = Number(prompt("Enter third number: "));      
  
let largestNumber = 0;
        
if(firstNumber > secondNumber && firstNumber > thirdNumber)
    largestNumber = firstNumber;
else if(secondNumber > firstNumber && secondNumber > thirdNumber)
    largestNumber = secondNumber;
else 
    largestNumber = thirdNumber;
    
console.log(largestNumber);  

