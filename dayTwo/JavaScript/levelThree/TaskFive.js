const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "));
let factorial = 1;

for(let count = 1; count <= number; count++){

    factorial *= count;

}
console.log(factorial);
