const prompt = require("prompt-sync")();

let length = Number(prompt("Enter length of triangle: "));

let width = Number(prompt("Enter width of triangle: "));
               
let area = length * width;
console.log(`Area = ${area}`);
