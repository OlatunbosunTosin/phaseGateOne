const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "));

for(let count = 1; count <= 12; count++){

    let multiplication = number * count;
    console.log(`${number} x ${count} = ${multiplication}`);

}
