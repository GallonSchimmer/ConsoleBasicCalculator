package calculatorPackage;

public class Tests {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int mult = a * b;
		System.out.println("multiplication: "  + mult);
		
		/* ------------                 -----------------*/
		
		ParametersClass firstAdd = new ParametersClass(3,3);
		String theNumbers = firstAdd.toString();
		
		System.out.println("the sum of 3 + 3 = " + firstAdd.addOperation(3, 3));
		System.out.println("the Numbers of the new instance are: " + theNumbers);
		
		int sum = firstAdd.addOperation(3, 6);
		
		System.out.println("The sum using Interface Method for 3 plus 6 = " + sum);

	}

}
