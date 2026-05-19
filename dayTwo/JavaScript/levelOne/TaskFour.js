const prompt = require("prompt-sync")();

let firstNumber = Number(prompt("Enter first number: "));
let secondNumber = Number(prompt("Enter second number: "));
               
console.log(`Product of ${firstNumber} and ${secondNumber} is ${firstNumber * secondNumber}`);
