package calculatorPackage;

import java.util.Scanner;

/**
 * AppMainMath is a command-line application that performs basic arithmetic
 * operations. It continuously prompts the user for an operator and two numbers,
 * then performs the specified operation and displays the result. The
 * application uses a ParametersClass instance to store and retrieve the result
 * of operations.
 */

public class AppMainMath {

	public static void main(String[] args) {

		// Instance of ParametersClass to hold and retrieve results.
		ParametersClass resultSaved = new ParametersClass();

		// Retrieve and display any previously stored result.
		int showResult = resultSaved.getResult();
		System.out.println("Result if exists: " + showResult);

		// Variable to store the user's choice of operator.
		char operatorInput = 'c';

		// Main loop to continuously read user input and perform operations.
		while (true) {

			// Display the current result to the user.
			System.out.println("This is the temporary result: " + showResult);

			// Scanner object for reading user input.
			Scanner userInputTwo = new Scanner(System.in); // Create a Scanner object
			System.out.println(
					"\nEnter an operator. For: \nPlus: +, \nMinus: -, \nDivdided by: /, \nMultiplied by: *,\nModulus: %, \nErase Inputs: c");

			
			// Read the operator from user input.
			operatorInput = userInputTwo.nextLine().charAt(0); // Read user input
			System.out.println("\nOperator is: " + operatorInput); // Output user input
			
			
			// Default case for invalid operators
			//if(operatorInput != 'c' || operatorInput != '+' ||operatorInput != '-' || operatorInput != '/' || operatorInput != '*' || operatorInput != '%') {
					//System.out.println("\nUse only +, -, /, * or % operators!!!!!!!");
					//System.out.println(
							//"\nEnter an operator. For: \nPlus: +, \nMinus: -, \nDivdided by: /, \nMultiplied by: *,\nModulus: %, \nErase Inputs: c");
		
			//}
			
			
			
			// Variables to store the two numbers for the operation.
			int firstNumberUpdate = 0;
			int secondNumberUpdate = 0;

			// Logic to handle the input of numbers based on the current result and operator
			// chosen.
			// The code handles the 'c' operator separately for clearing the inputs.
			if (showResult != 0 && operatorInput != 'c') {

				System.out.println("\nfirst number is: " + showResult); // Output user input

				System.out.println("\nEnter second Number");

				secondNumberUpdate = userInputTwo.nextInt(); // Read user input
				System.out.println("\nfirst number is: " + secondNumberUpdate); // Output user input

			} else if (operatorInput == 'c') {

				System.out.println(

						"\nEnter an operator. For: \nPlus: +, \nMinus: -, \nDivdided by: /, \nMultiplied by: *,\nModulus: %, \nErase Inputs: c");

			} else {
				System.out.println("\nEnter first Number");

				firstNumberUpdate = userInputTwo.nextInt(); // Read user input
				System.out.println("\nfirst number is: " + firstNumberUpdate); // Output user input

				System.out.println("\nEnter second Number");

				secondNumberUpdate = userInputTwo.nextInt(); // Read user input
				System.out.println("\nfirst number is: " + secondNumberUpdate); // Output user input

			}

			// Switch case to perform the operation based on the chosen operator.

			char operator = operatorInput;

			switch (operator) {
			case '+':
				// Addition operation

				ParametersClass parametersSwitch = new ParametersClass();
				int added;

				if (showResult != 0) {

					added = parametersSwitch.addOperation(showResult, secondNumberUpdate);
					System.out.println("\nThe addition using Scanner, interface and instance: " + added);
					System.out.println("digging it!");
					showResult = parametersSwitch.setResult(added);
				} else {

					added = parametersSwitch.addOperation(firstNumberUpdate, secondNumberUpdate);
					System.out.println("\nThe addition using Scanner, interface and instance: " + added);
					System.out.println("digging it!");
					showResult = parametersSwitch.setResult(added);

				}
				break;
			case '-':
				// Subtraction operation

				ParametersClass parametersSwitch1 = new ParametersClass();
				int substracted;

				if (showResult != 0) {
					substracted = parametersSwitch1.substractOperation(showResult, secondNumberUpdate);
					System.out.println("\nThe substraction using Scanner, interface and instance: " + substracted);
					System.out.println("whoo hoo, well done :-)");
					showResult = parametersSwitch1.setResult(substracted);

				} else {
					substracted = parametersSwitch1.substractOperation(firstNumberUpdate, secondNumberUpdate);
					System.out.println("\nThe substraction using Scanner, interface and instance: " + substracted);
					System.out.println("whoo hoo, well done :-)");
					showResult = parametersSwitch1.setResult(substracted);
				}
				break;
			case '/':
				// Division operation

				ParametersClass parametersSwitch2 = new ParametersClass();
				int divided;

				if (showResult != 0) {
					divided = parametersSwitch2.divideOperation(showResult, secondNumberUpdate);
					System.out.println("\nThe division using Scanner, interface and instance: " + divided);
					System.out.println("whoo hoo, well done :-)");
					showResult = parametersSwitch2.setResult(divided);

				} else {
					divided = parametersSwitch2.divideOperation(firstNumberUpdate, secondNumberUpdate);
					System.out.println("\nThe division using Scanner, interface and instance: " + divided);
					System.out.println("whoo hoo, well done :-)");
					showResult = parametersSwitch2.setResult(divided);
				}
				break;
			case '*':
				// Multiplication operation

				ParametersClass parametersSwitch3 = new ParametersClass();
				int multiplied;

				if (showResult != 0) {
					multiplied = parametersSwitch3.multiplyOperation(showResult, secondNumberUpdate);
					System.out.println("\nThe multiplication using Scanner, interface and instance: " + multiplied);
					System.out.println("whoo hoo, well done :-)");
					showResult = parametersSwitch3.setResult(multiplied);

				} else {
					multiplied = parametersSwitch3.multiplyOperation(firstNumberUpdate, secondNumberUpdate);
					System.out.println("\nThe multiplication using Scanner, interface and instance: " + multiplied);
					System.out.println("whoo hoo, well done :-)");
					showResult = parametersSwitch3.setResult(multiplied);
				}
				break;
			case '%':
				// Modulus operation

				ParametersClass parametersSwitch4 = new ParametersClass();
				int modulused;

				if (showResult != 0) {
					modulused = parametersSwitch4.modulusOperation(showResult, secondNumberUpdate);
					System.out.println("\nThe modulus result using Scanner, interface and instance: " + modulused);
					System.out.println("whoo hoo, well done :-)");
					showResult = parametersSwitch4.setResult(modulused);

				} else {
					modulused = parametersSwitch4.modulusOperation(firstNumberUpdate, secondNumberUpdate);
					System.out.println("\nThe modulus using Scanner, interface and instance: " + modulused);
					System.out.println("whoo hoo, well done :-)");
					showResult = parametersSwitch4.setResult(modulused);
				}
				break;
			case 'c':
				// Reset operation

				// showResult is back to 0;
				ParametersClass parametersSwitch6 = new ParametersClass();
				showResult = parametersSwitch6.setResult(0);

				parametersSwitch6.setA(0);
				System.out.println("\nwhoo hoo, well done, you erased the Inputs, nice!!!, showResult: " + showResult);
				break;
			default:
				// Default case for invalid operators

				System.out.println("\nuse +, -, /, * or % operators");
			}

			
		}

//https://www.w3schools.com/java/java_user_input.asp
//https://www.w3schools.com/java/java_switch.asp
//https://www.w3schools.com/java/java_operators.asp

	}

}
