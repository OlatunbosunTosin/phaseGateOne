const prompt = require("prompt-sync")();

let radius = Number(prompt("Enter radius of circle: "));

let area = 2 * (22.0 / 7) * radius;
               
console.log(`Area = ${area}`);
