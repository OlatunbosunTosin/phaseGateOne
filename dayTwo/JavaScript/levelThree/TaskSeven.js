const prompt = require("prompt-sync")();

let number = 0;
        
let count = 0;
let sum = 0;

while(count < 5){

    number = Number(prompt("Enter a number: "));
    count += 1;
    sum += number;
    

}
console.log(sum);
