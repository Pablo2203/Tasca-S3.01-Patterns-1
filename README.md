#  Tasca S3.01: Patterns 1

##  Description

In this task, you will learn to identify and construct programs using **design patterns**. Leveraging design patterns is fundamental to building extensible and reusable software. The **Java language**—along with most popular software frameworks—is built using these core patterns.

The exercise is divided into **three levels**, each focused on implementing a specific design pattern. Each level has a corresponding package (`level1`, `level2`, and `level3`), and a `Main` class demonstrates the functionality of the implemented design pattern.

---

##  Levels Overview

### **Level 1: Singleton Pattern**

- **Objective:** Create a class `Undo` that replicates the behavior of the **Undo** command.  
- **Key Features:**
  - `Undo` keeps a history of the last user commands (similar to the Linux `history` command).
  - The class allows adding, removing, and listing past commands.
  - The `Undo` class follows the **Singleton Pattern**, ensuring only one instance can exist globally.
  
- **Package:** `level1`

---

### **Level 2: Abstract Factory Pattern**

- **Objective:** Develop a small system to manage international **addresses** and **phone numbers**.  
- **Key Features:**
  - The system allows adding multiple international addresses and phone numbers.
  - Uses the **Abstract Factory Pattern** to handle variations in formats between different countries.
  - New countries/formats can be easily integrated into the system by extending the factory.

- **Package:** `level2`

---

### **Level 3: Command Pattern**

- **Objective:** Design a parking system for **4 types of vehicles**: car, bicycle, plane, and ship.
- **Key Features:**
  - Each vehicle has commands for `start`, `accelerate`, and `stop`, which are centralized and managed using the **Command Pattern**.
  - The system separates the logic of command execution, allowing flexibility and reusability.
  - An `Engine` class acts as the **Invoker**, executing the operations for the vehicles.

- **Package:** `level3`

---

##  Technologies Used

- **Java 8+** (Higher versions supported)
- **IntelliJ IDEA** (or any preferred IDE)

---

##  Requirements

- Java JDK 8 or higher
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code
- Optional: Maven/Gradle for dependency management (not mandatory)

---

## ️ Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd patterns-task-s3.01
   ```

3. Open the directory in your IDE.

4. Ensure the necessary configurations are set for the `Main` class in each package:
   - `src/level1/Main.java`
   - `src/level2/Main.java`
   - `src/level3/Main.java`

---

## ▶️ Execution

### Instructions for running each level:

1. **Level 1: Singleton Pattern**
   - This package demonstrates the use of the Singleton Pattern through an `Undo` class.
   - Run `src/level1/Main.java`. The program will allow you to manage a history of commands/actions via the console.

2. **Level 2: Abstract Factory Pattern**
   - This package implements the Abstract Factory Pattern to handle international address and phone number formats.
   - Run `src/level2/Main.java` to see examples of adding and managing international entries.

3. **Level 3: Command Pattern**
   - This package demonstrates a Command Pattern-based parking system where vehicles perform actions with centralized commands.
   - Run `src/level3/Main.java` to simulate vehicle operations like start, accelerate, and stop.

---

##  Deployment

This is an educational task and does not require server deployment. To export the project for execution:

- Compile the project into a JAR file:
  ```bash
  jar cf PatternsTask.jar -C out/production/<package-name> .
  ```
  Replace `<package-name>` with the appropriate level (e.g., `level1`, `level2`, or `level3`).

- Execute the JAR file using:
  ```bash
  java -jar PatternsTask.jar
  ```

---

##  File Structure Example
