price = float(input("Enter price of item: "));

tax = (10.0 / 100.0) * price;
new_price = price + tax;
               
print(f"New price after 10 percent added tax is {new_price:.2f}");
