const prompt = require("prompt-sync")();

let age = Number(prompt("How old are you? "));
               
console.log(`You will be ${age + 5} years old in 5 years`);
