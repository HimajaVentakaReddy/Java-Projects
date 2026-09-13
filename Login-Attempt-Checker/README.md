# 🔐 Login Attempt Checker

A beginner-friendly Java console application that validates login credentials, controls repeated login attempts, and locks access after three failed attempts.

## 📌 Problem Statement

Login systems must prevent unlimited attempts from unauthorized users. This application checks a username and password, allows a maximum of three attempts, and locks access when all attempts fail.

## ✨ Features

- Accepts username and password
- Validates login credentials
- Allows a maximum of three attempts
- Displays the remaining attempts
- Rejects empty input fields
- Grants access for correct credentials
- Locks access after three failed attempts
- Displays a formatted login status
- Uses secure combined error messages

## 🔑 Test Credentials

| Field | Value |
|---|---|
| Username | `admin` |
| Password | `java123` |

> These credentials are included only for demonstrating this beginner-level project.

## 🚦 Login Rules

| Condition | Result |
|---|---|
| Correct username and password | ✅ Access Granted |
| Empty username or password | ⚠️ Invalid Input |
| Incorrect credentials | ❌ Login Failed |
| Three failed attempts | 🔒 Account Locked |

## 🛠️ Java Concepts Used

- Scanner class
- Variables and constants
- String comparison
- For loop
- If-else statements
- Logical operators
- Boolean values
- Input validation
- Formatted console output

## 📂 Project Structure

- `src/LoginAttemptChecker.java`
- `README.md`

## ▶️ How to Run

Compile:

`javac -d "Login-Attempt-Checker\out" "Login-Attempt-Checker\src\LoginAttemptChecker.java"`

Run:

`java -cp "Login-Attempt-Checker\out" LoginAttemptChecker`

## ⚙️ Requirements

- Java Development Kit 17 or later
- Visual Studio Code, PowerShell, or Command Prompt

## 🎯 Learning Outcome

This project demonstrates how loops, conditions, string comparison, and input validation can be used to create a simple login security system.