const prompt = require("prompt-sync")();

let celcius = Number(prompt("Enter temperature in celcius: "));

let fahrenheit = (1.8 * celcius) + 32;
               
console.log(`${celcius} celcius is ${fahrenheit} fahrenheit`);
