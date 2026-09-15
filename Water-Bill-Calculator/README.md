# 🚰 Water Bill Calculator

A beginner-friendly Java console application that calculates a water bill using progressive consumption slabs, a service charge, and water-usage alerts.

## 📌 Problem Statement

Water charges usually increase when consumption becomes higher. This application calculates charges using progressive rate slabs, identifies the customer’s usage level, and provides a water-conservation suggestion.

## ✨ Features

- Accepts customer name and ID
- Accepts water consumption in kilolitres
- Uses progressive slab-based billing
- Adds a fixed service charge
- Displays low, moderate, or high usage
- Provides water-saving suggestions
- Validates customer details and consumption
- Generates a formatted water bill

## 💧 Water Tariff Slabs

| Consumption | Rate |
|---|---:|
| First 10 KL | Rs. 5 per KL |
| Next 10 KL | Rs. 8 per KL |
| Above 20 KL | Rs. 12 per KL |

## 💰 Additional Charge

| Charge | Amount |
|---|---:|
| Fixed Service Charge | Rs. 50 |

## 🚦 Usage Status

| Water Consumption | Status |
|---|---|
| Up to 10 KL | ✅ Low Usage |
| 10.01 to 20 KL | 🟡 Moderate Usage |
| Above 20 KL | 🔴 High Usage |

## 🧮 Bill Formula

- Consumption Charge = Total of applicable slab charges
- Total Bill = Consumption Charge + Service Charge

## 🛠️ Java Concepts Used

- Scanner class
- Variables and constants
- If-else statements
- Arithmetic operators
- String methods
- Input validation
- Progressive calculations
- Formatted console output

## 📂 Project Structure

- `src/WaterBillCalculator.java`
- `README.md`

## ▶️ How to Run

Compile:

`javac -encoding UTF-8 -d "Water-Bill-Calculator\out" "Water-Bill-Calculator\src\WaterBillCalculator.java"`

Run:

`java -cp "Water-Bill-Calculator\out" WaterBillCalculator`

## ⚙️ Requirements

- Java Development Kit 17 or later
- Visual Studio Code, PowerShell, or Command Prompt

## 🎯 Learning Outcome

This project demonstrates how Java conditions, arithmetic calculations, validation, and formatted output can solve a practical utility-billing problem.