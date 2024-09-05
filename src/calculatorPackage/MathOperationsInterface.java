package calculatorPackage;

/**
 * MathOperationsInterface defines a set of basic arithmetic operations.
 * Any class implementing this interface can perform addition, subtraction,
 * division, multiplication, and modulus operations. It also provides a method
 * to retrieve the result of the last operation.
 */
public interface MathOperationsInterface {
	
	/**
     * Adds two integers.
     * 
     * @param a the first integer.
     * @param b the second integer.
     * @return the sum of a and b.
     */
	public int addOperation(int a, int b);
	
	/**
     * Subtracts one integer from another.
     * 
     * @param a the minuend.
     * @param b the subtrahend.
     * @return the difference of a and b.
     */
	public int substractOperation(int a, int b);
	
	/**
     * Divides one integer by another.
     * 
     * @param a the dividend.
     * @param b the divisor.
     * @return the quotient of a divided by b.
     * @throws ArithmeticException if b is zero.
     */
	public int divideOperation(int a, int b);
	
	/**
     * Multiplies two integers.
     * 
     * @param a the first multiplicand.
     * @param b the second multiplicand.
     * @return the product of a and b.
     */
	public int multiplyOperation(int a , int b);
	
	/**
     * Calculates the modulus of one integer and another.
     * 
     * @param a the dividend.
     * @param b the divisor.
     * @return the remainder of a divided by b.
     * @throws ArithmeticException if b is zero.
     */
	public int modulusOperation(int a, int b);

	/**
     * Retrieves the result of the last performed operation.
     * 
     * @param result the result of the last operation.
     * @return the result.
     */
	int lastOperation(int result);
	

}
