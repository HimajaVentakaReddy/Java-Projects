# 📱 Mobile Data Usage Alert

A beginner-friendly Java console application that monitors mobile data consumption and provides smart alerts based on the usage percentage.

## 📌 Problem Statement

Mobile users may unknowingly consume most or all of their available data. This application calculates data usage, displays the remaining balance, and warns users before they exceed their limit.

## ✨ Features

- Accepts the user's name
- Accepts the total data limit and data used
- Calculates remaining data
- Calculates usage percentage
- Detects exceeded data limits
- Displays smart usage alerts
- Validates incorrect input
- Generates a formatted summary

## 🚦 Data Usage Levels

| Usage | Status |
|---|---|
| Below 50% | ✅ Safe Usage |
| 50% to 74.99% | 🟢 Moderate Usage |
| 75% to 89.99% | 🟠 High Usage |
| 90% to 99.99% | 🔴 Critical Usage |
| 100% or above | ⛔ Limit Exceeded |

## 🧮 Formulas

- Usage Percentage = (Data Used / Data Limit) × 100
- Remaining Data = Data Limit - Data Used
- Exceeded Data = Data Used - Data Limit

## 🛠️ Java Concepts Used

- Scanner class
- Variables and data types
- Arithmetic operators
- If-else statements
- Input validation
- Math utility methods
- Formatted output

## 📂 Project Structure

- `src/MobileDataUsageAlert.java`
- `README.md`

## ▶️ How to Run

Compile:

`javac -d "Mobile-Data-Usage-Alert\out" "Mobile-Data-Usage-Alert\src\MobileDataUsageAlert.java"`

Run:

`java -cp "Mobile-Data-Usage-Alert\out" MobileDataUsageAlert`

## ⚙️ Requirements

- Java Development Kit 17 or later
- PowerShell, Command Prompt, or VS Code terminal

## 🎯 Learning Outcome

This project demonstrates how Java conditions and arithmetic operations can solve a practical mobile data monitoring problem.