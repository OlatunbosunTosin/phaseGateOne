const prompt = require("prompt-sync")();

let number = Number(prompt("Enter number: "));
      
if(number < 0)
    console.log("Negative");  
else
    console.log("Positive");              


