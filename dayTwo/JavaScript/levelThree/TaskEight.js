const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "));
        
let sum = 0;

while(number != 0){

    sum += number;
    number = Number(prompt("Enter a number: "));

}
console.log(sum);
