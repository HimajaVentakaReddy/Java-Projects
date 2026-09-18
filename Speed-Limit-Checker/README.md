# 🚦 Speed Limit Checker

A beginner-friendly Java console application that compares vehicle speed with road-specific limits, identifies violation severity, calculates a demonstration fine, and provides road-safety guidance.

## 📌 Problem Statement

Different road zones have different speed limits. This application selects the correct speed limit based on the road category, detects overspeeding, classifies the violation, and generates a detailed speed report.

## ✨ Features

- Accepts driver and vehicle details
- Supports three road categories
- Applies road-specific speed limits
- Calculates exceeded speed
- Classifies speeding violations
- Calculates demonstration fine amounts
- Validates driver details and speed
- Provides road-safety messages
- Generates a formatted speed report

## 🛣️ Road Speed Limits

| Road Category | Speed Limit |
|---|---:|
| 🏫 School Zone | 30 km/h |
| 🏙️ City Road | 50 km/h |
| 🛣️ Highway | 100 km/h |

## ⚠️ Violation Levels

| Speed Above Limit | Violation Level | Demonstration Fine |
|---|---|---:|
| No excess speed | ✅ No Violation | Rs. 0 |
| Up to 10 km/h | 🟡 Minor Violation | Rs. 500 |
| 10.01 to 20 km/h | 🟠 Moderate Violation | Rs. 1,000 |
| 20.01 to 40 km/h | 🔴 Major Violation | Rs. 2,000 |
| Above 40 km/h | ⛔ Severe Violation | Rs. 5,000 |

> The fine amounts and speed limits in this project are sample values used only for programming demonstration. Actual traffic rules may differ by location.

## 🧮 Calculations

- Exceeded Speed = Vehicle Speed - Permitted Speed Limit
- No fine is applied when the vehicle speed is within the permitted limit
- The fine depends on the amount by which the speed limit is exceeded

## 🛠️ Java Concepts Used

- Scanner class
- Variables and constants
- Switch statement
- If-else statements
- Arithmetic operators
- String methods
- Input validation
- Math utility methods
- Formatted console output

## 📂 Project Structure

- `src/SpeedLimitChecker.java`
- `README.md`

## ▶️ How to Run

Compile:

`javac -encoding UTF-8 -d "Speed-Limit-Checker\out" "Speed-Limit-Checker\src\SpeedLimitChecker.java"`

Run:

`java -cp "Speed-Limit-Checker\out" SpeedLimitChecker`

## ⚙️ Requirements

- Java Development Kit 17 or later
- Visual Studio Code, PowerShell, or Command Prompt

## 🎯 Learning Outcome

This project demonstrates how Java conditions, switch statements, validation, calculations, and formatted output can solve a practical road-safety problem.