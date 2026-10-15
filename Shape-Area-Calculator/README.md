# Shape Area Calculator

## Project Overview

A simple Java console application that calculates the area of a circle or rectangle using object-oriented programming.

## Features

- Calculates the area of a circle
- Calculates the area of a rectangle
- Validates numeric input
- Demonstrates runtime polymorphism

## OOP Concepts

- **Abstraction:** `Shape` defines the abstract `calculateArea()` method.
- **Inheritance:** `Circle` and `Rectangle` extend `Shape`.
- **Method Overriding:** Both child classes implement `calculateArea()`.
- **Runtime Polymorphism:** A `Shape` reference calls the correct implementation at runtime.

## Formulas

- Circle: π × radius × radius
- Rectangle: length × width

## Project Structure

- `src/ShapeAreaCalculator.java`
- `README.md`

## How to Run

Compile from the repository root:

`javac -encoding UTF-8 -d "Shape-Area-Calculator\out" "Shape-Area-Calculator\src\ShapeAreaCalculator.java"`

Run:

`java -cp "Shape-Area-Calculator\out" ShapeAreaCalculator`

## Requirements

- JDK 17 or later

## Learning Outcome

Understand abstraction, inheritance, method overriding, and runtime polymorphism in Java.