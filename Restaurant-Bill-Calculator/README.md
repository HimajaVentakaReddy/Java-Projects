# 🍽️ Restaurant Bill Calculator

A beginner-friendly Java console application that calculates a restaurant customer's final bill using item price, quantity, discount, and GST.

## ✨ Features

- Accepts customer and food item details
- Calculates the subtotal
- Provides a 10% discount for bills of ₹500 or more
- Adds 5% GST after applying the discount
- Validates incorrect price and quantity values
- Displays a formatted bill receipt

## 🧮 Bill Calculation

```text
Subtotal = Item Price × Quantity
Discount = 10% of Subtotal when Subtotal is ₹500 or more
GST = 5% of Amount After Discount
Final Amount = Amount After Discount + GST
```

## 🛠️ Technologies Used

- Java 17
- Visual Studio Code
- Git
- GitHub
- Windows PowerShell

## 📚 Java Concepts Used

- Variables and data types
- Constants using final
- Scanner class
- If-else statements
- Arithmetic operators
- Input validation
- Formatted output using printf

## 📂 Project Structure

```text
Restaurant-Bill-Calculator/
├── src/
│   └── RestaurantBillCalculator.java
└── README.md
```

## ▶️ How to Run

Compile:

```powershell
javac -d out src\RestaurantBillCalculator.java
```

Run:

```powershell
java -cp out RestaurantBillCalculator
```

## 💻 Sample Output

```text
======================================
      RESTAURANT BILL CALCULATOR
======================================
Enter customer name: Himaja
Enter food item name: Paneer Biryani
Enter price of one item: 250
Enter quantity: 3

============ BILL RECEIPT ============
Customer Name : Himaja
Food Item     : Paneer Biryani
Item Price    : Rs. 250.00
Quantity      : 3
--------------------------------------
Subtotal      : Rs. 750.00
Discount      : Rs. 75.00
GST (5%)      : Rs. 33.75
--------------------------------------
Final Amount  : Rs. 708.75
======================================
Thank you! Please visit again.
```

## 👩‍💻 Author

**Himaja Venkata Reddy**

GitHub: [HimajaVentakaReddy](https://github.com/HimajaVentakaReddy)
