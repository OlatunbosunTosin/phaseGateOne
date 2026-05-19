const prompt = require("prompt-sync")();

let score = Number(prompt("Enter score: "));
      
if(score >= 50)
    console.log("Pass");  
else 
    console.log("Fail");              


