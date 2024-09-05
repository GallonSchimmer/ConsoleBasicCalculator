# Simple Console Arithmetic Calculator

This command-line application provides a basic arithmetic calculator that supports operations like addition, subtraction, multiplication, division, and modulus. It is designed to demonstrate fundamental programming concepts and offer a practical way to interact with basic arithmetic operations.

## Problem to be Solved

The core problem addressed by this project is to perform real-time arithmetic operations based on user input. This includes dynamically handling user choices and providing immediate feedback, which is fundamental in building interactive applications.

## Concepts or General Problems in Computer Science Being Solved

This project introduces several key computer science concepts:
- **Control Structures**: Utilizing loops and conditional statements to handle various user inputs and maintain the flow of the application.
- **Data Handling**: Managing user inputs and storing results using variables and standard data structures.
- **User Interaction**: Reading from and writing to the standard input/output, simulating a real-world application where user interaction dictates the flow of execution.
- **Error Handling**: Ensuring the application can gracefully handle unexpected or incorrect user input.
- **Interface Implementation**: Demonstrating the use of interfaces to define a set of operations that other classes can implement, promoting a modular and scalable code structure.

## Tasks and Areas

- **Arithmetic Operations**: Implement functions to perform addition, subtraction, multiplication, division, and modulus.
- **Result Management**: Keep track of the latest calculation result and use it as a base for subsequent operations.
- **Continuous Operation**: Allow the user to perform operations continuously until they decide to exit.
- **Error Checking**: Handle common input errors, such as non-numeric inputs or division by zero, without crashing the application.

## Running the Application

To run this calculator, you need a Java development environment set up. Once you have Java installed, follow these steps:

Here’s a step-by-step example showing how a user might interact with the `ConsoleBasicCalculator` in the console. This example will cover running the calculator, performing various arithmetic operations, and interacting with the program based on the code snippets you provided. This should help users understand how to use the application effectively.

### Step 1: Start the Program
The user starts the program from the command line by navigating to the directory containing the compiled Java files and executing the `AppMainMath` class. Here’s how it might look:

```bash
java AppMainMath
```

### Step 2: Initial Output
Upon starting, the program might display a message indicating if there's a previously saved result (assuming the program is designed to store the last result between sessions, which your snippet suggests might not be implemented yet):

```
Result if exists: 0
This is the temporary result: 0
```

### Step 3: Enter Operation
The program prompts the user to enter an operator:

```
Enter an operator. For:
Plus: +,
Minus: -,
Divided by: /,
Multiplied by: *,
Modulus: %,
Erase Inputs: c
```

### Step 4: User Input
The user decides to perform an addition and enters the `+` operator followed by two numbers:

```
Operator is: +
Enter first Number
10
first number is: 10
Enter second Number
20
first number is: 20
```

### Step 5: Output Result
The program calculates and displays the result of the addition:

```
The addition using Scanner, interface and instance: 30
digging it!
```

### Step 6: Further Operations
Now with a result available, the program will use that result in the next calculation unless the user resets it:

```
This is the temporary result: 30
Enter an operator. For:
Plus: +,
Minus: -,
Divided by: /,
Multiplied by: *,
Modulus: %,
Erase Inputs: c
```

### Step 7: Additional Calculation
The user continues with another operation, such as subtraction:

```
Operator is: -
Enter second Number
5
first number is: 5
```

### Step 8: Display New Result
The result of subtracting 5 from the previous result (30):

```
The subtraction using Scanner, interface and instance: 25
whoo hoo, well done :-)
```

### Step 9: Concluding or Resetting
The user decides to reset the calculator:

```
Operator is: c
whoo hoo, well done, you erased the Inputs, nice!!!, showResult: 0
```

The calculator is now reset, and the user can start a new set of operations or exit the program.

### Step 10: Exit the Program (Future Addition to Program)
Typically, the user would exit by closing the console or by an exit command if implemented (not shown in the original code).

This interaction sequence demonstrates how the `ConsoleBasicCalculator` handles basic arithmetic operations and user input, providing immediate feedback and maintaining a running total that can be reset by the user. It's a straightforward example of a console-based application that performs real-time calculations based on user input.
