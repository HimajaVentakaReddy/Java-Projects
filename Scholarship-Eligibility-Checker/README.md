# 🎓 Scholarship Eligibility Checker

A Java console application that evaluates students for different scholarship types using academic performance, attendance, family income, and sports achievement.

## 📌 Problem Statement

Scholarships use different eligibility conditions. This application checks student information, applies the selected scholarship rules, and displays eligibility, failed conditions, and the demonstration award amount.

## ✨ Features

- Accepts student name and USN
- Validates percentage and attendance
- Supports three scholarship types
- Checks annual family income
- Checks sports certification
- Displays passed and failed requirements
- Counts failed checks
- Calculates the scholarship award
- Provides document-verification guidance
- Generates a formatted report

## 🏆 Scholarship Types

| Type | Requirements | Demonstration Amount |
|---|---|---:|
| 🌟 Merit | 90% marks and 75% attendance | Rs. 50,000 |
| 💰 Need-Based | 75% marks, 75% attendance, income up to Rs. 2,50,000 | Rs. 30,000 |
| 🏅 Sports | 60% marks, 65% attendance, recognized certificate | Rs. 25,000 |

> Rules and amounts are sample values used only for this Java project. Actual scholarship requirements depend on the institution or scheme.

## 🛠️ Java Concepts Used

- Scanner class
- Variables and constants
- Switch statement
- If-else statements
- Boolean logic
- Input validation
- Counters
- String methods
- Formatted output

## 📂 Project Structure

- `src/ScholarshipEligibilityChecker.java`
- `README.md`

## ▶️ How to Run

Compile:

`javac -encoding UTF-8 -d "Scholarship-Eligibility-Checker\out" "Scholarship-Eligibility-Checker\src\ScholarshipEligibilityChecker.java"`

Run:

`java -cp "Scholarship-Eligibility-Checker\out" ScholarshipEligibilityChecker`

## ⚙️ Requirements

- Java Development Kit 17 or later
- Visual Studio Code, PowerShell, or Command Prompt

## 🎯 Learning Outcome

This project demonstrates how Java conditions, switch statements, validation, and calculations can implement a rule-based eligibility system.