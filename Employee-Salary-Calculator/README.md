# Employee Salary Calculator

## Project Overview

A simple Java console application that calculates employee salary based on the employee's role.

## Features

- Accepts employee name and basic salary
- Supports Manager and Developer roles
- Calculates role-based salary allowances
- Validates salary and employee type

## OOP Concept: Inheritance

- `Employee` is the parent class.
- `Manager` and `Developer` are child classes.
- The child classes reuse the parent constructor using `super()`.
- They override `calculateSalary()` to apply different allowances.

## Salary Rules

- Manager: Basic salary + 20% allowance
- Developer: Basic salary + 10% allowance

## Project Structure

- `src/EmployeeSalaryCalculator.java`
- `README.md`

## How to Run

Compile from the repository root:
`javac -encoding UTF-8 -d "Employee-Salary-Calculator\out" "Employee-Salary-Calculator\src\EmployeeSalaryCalculator.java"`

Run:

`java -cp "Employee-Salary-Calculator\out" EmployeeSalaryCalculator`

## Requirements

- JDK 17 or later

## Learning Outcome

This project demonstrates inheritance, constructors, method overriding, and parent-class references in Java.
