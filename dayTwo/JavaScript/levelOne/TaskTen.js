const prompt = require("prompt-sync")();

let firstNumber = Number(prompt("Enter first number: "));
let secondNumber = Number(prompt("Enter second number: "));
let thirdNumber = Number(prompt("Enter third number: "));

let average = (firstNumber + secondNumber + thirdNumber) / 3;
               
console.log(`Average = ${average}`);
