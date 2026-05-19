const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "));

let square = number * number;
               
console.log(`Square of ${number} = ${square}`);
