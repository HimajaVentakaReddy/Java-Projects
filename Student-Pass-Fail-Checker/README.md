# 🎓 Student Pass/Fail Checker

A beginner-friendly Java console application that evaluates subject marks, calculates the total and average, assigns a grade, and generates a complete student result report.

## 📌 Problem Statement

Manually calculating academic results can lead to errors. This application evaluates marks in five subjects, checks whether the student passed every subject, calculates the final grade, and displays performance details.

## ✨ Features

- Accepts student name and USN
- Records marks for five subjects
- Validates marks between 0 and 100
- Checks subject-wise pass/fail status
- Calculates total marks
- Calculates average percentage
- Counts failed subjects
- Assigns an academic grade
- Displays performance classification
- Provides improvement guidance
- Generates a formatted result report

## 📚 Subjects

- Java
- Database Management Systems
- Operating Systems
- Design and Analysis of Algorithms
- Microcontroller

## ✅ Passing Rule

A student must score at least **35 marks in every subject** to pass the examination.

If the student fails in even one subject, the overall result is marked as **FAIL**.

## 🏅 Grade System

| Average Percentage | Grade |
|---|---|
| 90% and above | A+ |
| 80% to 89.99% | A |
| 70% to 79.99% | B |
| 60% to 69.99% | C |
| 50% to 59.99% | D |
| 35% to 49.99% | E |
| Failed in any subject | F |

## 📊 Performance Classification

| Average Percentage | Classification |
|---|---|
| 75% and above | 🌟 Distinction |
| 60% to 74.99% | 🥇 First Class |
| 50% to 59.99% | 🥈 Second Class |
| 35% to 49.99% | ✅ Pass Class |

## 🧮 Calculations

- Total Marks = Sum of marks in all five subjects
- Average Percentage = Total Marks ÷ 5
- Overall Result = Pass only when every subject mark is at least 35

## 🛠️ Java Concepts Used

- Scanner class
- Variables and data types
- Methods
- If-else statements
- Logical operators
- Boolean values
- String methods
- Input validation
- Arithmetic calculations
- Formatted console output

## 📂 Project Structure

- `src/StudentPassFailChecker.java`
- `README.md`

## ▶️ How to Run

Compile:

`javac -encoding UTF-8 -d "Student-Pass-Fail-Checker\out" "Student-Pass-Fail-Checker\src\StudentPassFailChecker.java"`

Run:

`java -cp "Student-Pass-Fail-Checker\out" StudentPassFailChecker`

## ⚙️ Requirements

- Java Development Kit 17 or later
- Visual Studio Code, PowerShell, or Command Prompt

## 🎯 Learning Outcome

This project demonstrates how Java methods, conditions, validation, calculations, and formatted output can be used to build a practical academic result system.