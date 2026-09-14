# 🅿️ Parking Fee Calculator

A beginner-friendly Java console application that calculates parking fees using the vehicle category, parking duration, base charge, and additional hourly rate.

## 📌 Problem Statement

Parking facilities charge different fees based on the type of vehicle and the number of hours parked. This application applies the correct vehicle-based rate and generates a clear parking receipt.

## ✨ Features

- Accepts customer and vehicle details
- Supports three vehicle categories
- Converts vehicle numbers to uppercase
- Applies a base charge for the first two hours
- Calculates additional parking hours
- Applies category-based hourly rates
- Validates empty and incorrect input
- Generates a formatted parking receipt

## 🚘 Parking Rates

| Vehicle Type | First Two Hours | Each Additional Hour |
|---|---:|---:|
| 🏍️ Bike | Rs. 20 | Rs. 10 |
| 🚗 Car | Rs. 40 | Rs. 20 |
| 🚚 Heavy Vehicle | Rs. 60 | Rs. 30 |

## 🧮 Calculation

- Additional Hours = Parking Hours - 2
- Additional Charge = Additional Hours × Additional Hourly Rate
- Total Fee = Base Charge + Additional Charge

## 🛠️ Java Concepts Used

- Scanner class
- Variables and constants
- Switch statement
- If statements
- Arithmetic operators
- String methods
- Input validation
- Math utility methods
- Formatted console output

## 📂 Project Structure

- `src/ParkingFeeCalculator.java`
- `README.md`

## ▶️ How to Run

Compile:

`javac -d "Parking-Fee-Calculator\out" "Parking-Fee-Calculator\src\ParkingFeeCalculator.java"`

Run:

`java -cp "Parking-Fee-Calculator\out" ParkingFeeCalculator`

## ⚙️ Requirements

- Java Development Kit 17 or later
- Visual Studio Code, PowerShell, or Command Prompt

## 🎯 Learning Outcome

This project demonstrates how Java conditions, switch statements, calculations, and validation can solve a practical parking-fee problem.