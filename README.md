# vehicle-rental-multilevel-inheritance-java

## 📌 Project Description
This project demonstrates **Multilevel Inheritance in Java** using a simple **Vehicle Rental Company system**.
The program creates a base class **Vehicle**, a derived class **Car**, and another derived class **ElectricCar**.
Each class adds its own properties and methods to show how inheritance works in **Object-Oriented Programming (OOP)**.

## 🏗️ Class Structure
Vehicle (Base Class)
│
└── Car (Subclass)
      │
      └── ElectricCar (Subclass)

## ⚙️ Features
* Store vehicle **brand** and **model year**
* Start the vehicle
* Display number of car doors
* Drive the car
* Show battery charging percentage for electric car
* Demonstrates **Multilevel Inheritance in Java**

## 🧾 Class Details
### 1️⃣ Vehicle (Base Class)
Variables:
* `brand`
* `modelyear`
Methods:
* `displayInfo()` – displays brand and model year
* `start()` – starts the vehicle

### 2️⃣ Car (Subclass of Vehicle)
Variables:
* `numOfDoors`
Methods:
* `displayCarInfo()` – displays number of doors
* `drive()` – shows driving message

### 3️⃣ ElectricCar (Subclass of Car)
Variables:
* `batteryCap`
Methods:
* `charge()` – displays battery charging percentage

## ▶️ Example Output
Brand: Hyundai Creta
Model: 2024
The vehicle has started successfully
Car is now driving
Number of Doors: 4
Battery charging %age:82

## 📂 Project Structure
RentalCo.java
README.md

## 🛠️ Technologies Used
* Java
* Object-Oriented Programming (OOP)
* Multilevel Inheritance
