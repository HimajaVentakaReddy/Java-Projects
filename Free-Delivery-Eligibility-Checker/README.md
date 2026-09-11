# 🚚 Free Delivery Eligibility Checker

A beginner-friendly Java console application that checks whether an online order qualifies for free delivery.

## 📌 Problem Statement

Different shopping categories have different free-delivery limits. This application checks the category and order amount, applies the correct delivery charge, and displays the final bill.

## ✨ Features

- Accepts customer name and order amount
- Supports food, clothes, and electronics
- Checks category-based free-delivery eligibility
- Validates category and order amount
- Calculates the remaining amount for free delivery
- Applies the correct delivery charge
- Displays a formatted order summary

## 🛍️ Delivery Rules

| Category | Free Delivery Minimum | Delivery Charge |
|---|---:|---:|
| 🍔 Food | Rs. 299 | Rs. 40 |
| 👕 Clothes | Rs. 499 | Rs. 60 |
| 💻 Electronics | Rs. 999 | Rs. 100 |

## 🧮 Formula

Final Amount = Order Amount + Delivery Charge

Remaining Amount = Free Delivery Minimum - Order Amount

## 🛠️ Java Concepts Used

- Scanner class
- Variables and data types
- Switch statement
- If-else statements
- Arithmetic operators
- Input validation
- Formatted output

## 📂 Project Structure

- `src/FreeDeliveryEligibility.java`
- `README.md`

## ▶️ How to Run

Compile:

`javac -d "Free-Delivery-Eligibility-Checker\out" "Free-Delivery-Eligibility-Checker\src\FreeDeliveryEligibility.java"`

Run:

`java -cp "Free-Delivery-Eligibility-Checker\out" FreeDeliveryEligibility`

## ⚙️ Requirements

- Java 17 or later
- Visual Studio Code
- Windows PowerShell

---

⭐ This project is part of my Java learning and GitHub portfolio.