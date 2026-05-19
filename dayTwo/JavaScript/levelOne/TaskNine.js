const prompt = require("prompt-sync")();

let price = Number(prompt("Enter price of item: "));

let tax = (10.0 / 100.0) * price;
let newPrice = price + tax;
               
console.log(`New price after 10 percent added tax is ${newPrice}`);
