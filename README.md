Bird SOLID Design (Java)
📌 Overview

This project demonstrates the implementation of SOLID Design Principles using a Bird system in Java. It models different birds with distinct behaviors like flying, swimming, and eating using clean, scalable architecture.

🧠 Key Concepts Used

SRP (Single Responsibility Principle) → Separate data, behavior, and capabilities

OCP (Open/Closed Principle) → Easily extend new bird types without modifying existing code

LSP (Liskov Substitution Principle) → Proper hierarchy without forcing invalid behaviors

ISP (Interface Segregation Principle) → Small, specific interfaces (Flyable, Swimmable, Eatable)

DIP (Dependency Inversion Principle) → Behavior injected via abstraction (FlyBehavior)

🏗️ Project Structure
com.birds
├── model          # Base Bird class
├── behavior       # Strategy pattern (FlyBehavior)
├── capability     # Interfaces (Flyable, Swimmable, Eatable)
├── birds          # Concrete bird implementations
└── Main.java      # Entry point
🚀 Features

Supports multiple bird types (Sparrow, Eagle, Penguin, Ostrich, Parrot)

Dynamic behavior injection (FastFly / NoFly)

Clean and extensible architecture

<img width="787" height="784" alt="Screenshot 2026-03-20 154644" src="https://github.com/user-attachments/assets/ba79c0f9-ed93-4ef5-b4f9-13280e61d410" />

Follows industry-level design practices

▶️ How to Run
javac com/birds/Main.java
java com.birds.Main
💡 Design Pattern Used

Strategy Pattern for dynamic flying behavior

Composition over Inheritance for flexibility
