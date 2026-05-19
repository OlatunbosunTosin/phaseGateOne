const prompt = require("prompt-sync")();

let firstNumber = Number(prompt("Enter first number: "));
let secondNumber = Number(prompt("Enter second number: "));
      
if(firstNumber > secondNumber)
    console.log(firstNumber);  
else if(firstNumber < secondNumber)
    console.log(secondNumber);              

      
    
