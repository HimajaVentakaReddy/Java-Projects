# Login Attempt Checker - Java OOP Project

## Project Overview

The Login Attempt Checker is a simple Java console application that verifies user credentials and limits login attempts to three.

## Features
- Checks username and password
- Allows a maximum of three login attempts
- Displays remaining attempts after incorrect credentials
- Locks the login process after three failed attempts
- Uses encapsulation to protect login details and attempt count

## OOP Concept Used

### Encapsulation

The `LoginSystem` class stores its credentials, attempt count, and maximum attempts in private fields. Public methods such as `login()` and `isLocked()` control access to the login functionality.

## Java Concepts Used

- Classes and objects
- Private fields and public methods
- Encapsulation
- Scanner class
- While loop
- If-else statements
- String comparison
- Input validation
- Boolean values

## Project Structure

- `src/LoginAttemptChecker.java`
- `README.md`

## How to Run

Open PowerShell from the repository root.

Compile:

`javac -encoding UTF-8 -d "Login-Attempt-Checker\out" "Login-Attempt-Checker\src\LoginAttemptChecker.java"`

Run:

`java -cp "Login-Attempt-Checker\out" LoginAttemptChecker`

## Sample Login

Username: `admin`

Password: `java123`

Three incorrect login attempts lock the login process for that program run.

## Requirements

- Java Development Kit (JDK) 17 or later
- Visual Studio Code, PowerShell, or Command Prompt

## Learning Outcome

This project demonstrates how encapsulation can organize login-related data and methods into a class while using loops and conditions to control access attempts.
