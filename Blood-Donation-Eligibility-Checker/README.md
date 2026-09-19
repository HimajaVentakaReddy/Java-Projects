# 🩸 Blood Donation Eligibility Checker

A beginner-friendly Java console application that performs an educational preliminary blood-donation eligibility check using basic donor information.

## 📌 Problem Statement

Blood donation requires donors to satisfy multiple health and safety conditions. This application evaluates basic requirements, displays passed and failed checks, and explains why a person may not be preliminarily eligible.

## ⚠️ Important Disclaimer

This project is created only for Java programming education and preliminary demonstration.

It does not provide medical advice or replace professional donor screening. Actual blood-donation requirements may vary by country, blood bank, gender, medical history, and current health condition. A qualified healthcare professional must make the final eligibility decision.

## ✨ Features

- Accepts donor name and age
- Checks donor weight
- Checks haemoglobin level
- Records general health status
- Checks for recent illness
- Supports first-time donors
- Checks the gap since the previous donation
- Counts failed eligibility checks
- Displays detailed reasons for ineligibility
- Validates incorrect input values
- Generates a formatted donor report
- Includes a medical-screening reminder

## ✅ Demonstration Requirements

| Check | Sample Requirement |
|---|---|
| Age | 18 to 65 years |
| Weight | At least 50 kg |
| Haemoglobin | At least 12.5 g/dL |
| General Health | Donor feels healthy |
| Recent Illness | No recent illness |
| Donation Gap | At least 90 days |
| First-Time Donor | Enter `-1` for donation gap |

> These are simplified sample rules for demonstrating Java conditions and must not be treated as official medical guidelines.

## 🚦 Result Status

| Status | Meaning |
|---|---|
| ✅ Preliminary Eligible | All demonstration checks passed |
| ❌ Not Eligible | One or more checks failed |
| 🩺 Medical Screening Required | Final decision must be made by a healthcare professional |

## 🛠️ Java Concepts Used

- Scanner class
- Variables and data types
- Boolean values
- If-else statements
- Logical operators
- String methods
- Input validation
- Counters
- Arithmetic calculations
- Formatted console output

## 📂 Project Structure

- `src/BloodDonationEligibilityChecker.java`
- `README.md`

## ▶️ How to Run

Compile:

`javac -encoding UTF-8 -d "Blood-Donation-Eligibility-Checker\out" "Blood-Donation-Eligibility-Checker\src\BloodDonationEligibilityChecker.java"`

Run:

`java -cp "Blood-Donation-Eligibility-Checker\out" BloodDonationEligibilityChecker`

## ⚙️ Requirements

- Java Development Kit 17 or later
- Visual Studio Code, PowerShell, or Command Prompt

## 🎯 Learning Outcome

This project demonstrates how Java conditions, Boolean logic, validation, counters, calculations, and formatted output can be applied to an educational health-screening scenario.