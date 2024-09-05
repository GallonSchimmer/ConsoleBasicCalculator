package calculatorPackage;


/**
 * ParametersClass implements the MathOperationsInterface and provides
 * basic arithmetic operations. It also maintains the parameters (a and b)
 * and the result of the last operation.
 */
public class ParametersClass implements MathOperationsInterface{

	private int a; // First parameter for operations
	private int b; // Second parameter for operations
	private int result; // Stores the result of the last operation
	
	/**
     * Retrieves the result of the last operation.
     * 
     * @return The result of the last operation.
     */
	public int getResult() {
		return result;
	}

	 /**
     * Sets the result of the last operation.
     * 
     * @param result The result to be saved.
     * @return The saved result.
     */
	public int setResult(int result) {
		
		this.result = result;
		return result;
	}
	
	
	/**
     * Default constructor.
     */
	public ParametersClass() {
		//no args constructor														
	}
	
	
	/**
     * Constructor with parameters.
     * 
     * @param a First integer parameter.
     * @param b Second integer parameter.
     */
	public ParametersClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	// Other Getters and Setters
	public int getA() {
		return a;
	}

	
	
	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	/**
     * Provides a string representation of the object, showing values of a and b.
     * 
     * @return String representation of the object.
     */
	@Override
	public String toString() {
		return "a: " + a + " b: " + b;
	}
	
	
	
	// Implementation of arithmetic operations from MathOperationsInterface.
	
	
	@Override
	public int addOperation(int a, int b) {
		
		return a + b;
	}
	
	
	
	@Override
	public int substractOperation(int a, int b) {
		
		return a - b;
	}
	
	
	@Override
	public int divideOperation(int a, int b) {
		
		return a / b; // TODO: Division by zero should be handled.
	}

	@Override
	public int multiplyOperation(int a, int b) {
		
		return a * b;
	}

	@Override
	public int modulusOperation(int a, int b) {
		
		return a % b; // TODO: Modulus by zero should be handled.
	}
	
	
	@Override
	public int lastOperation(int result) {
		// This method could be implemented to return the result of the last operation.
		return 0;
	}
	
	/**
     * Main method to demonstrate the functionality of ParametersClass.
     * 
     * @param args Command line arguments (not used).
     */
	public static void main(String[] args) {
		
		ParametersClass firstAdd = new ParametersClass(3,3);
		String theNumbers = firstAdd.toString();
		
		System.out.println("the sum of 3 + 3 = " + firstAdd.addOperation(3, 3));
		System.out.println("the Numbers of the new instance are: " + theNumbers);
		
		int sum = firstAdd.addOperation(3, 6);
		
		System.out.println("The sum using Interface Method for 3 plus 6 = " + sum);
		
	}

	

	

	

	

	

	

}
