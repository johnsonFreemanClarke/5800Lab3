package test.java.com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.mycompany.app.Display;
import main.java.com.mycompany.app.Operand;
import main.java.com.mycompany.app.Subtraction;

public class SubtractionTest {
	Display resultObject = new Display();
	
	public void printOperandsToConsole(Operand operand1, Operand operand2) {	
		System.out.println("operand1 = " + operand1.getOperand());
		System.out.println("operand2 = " + operand2.getOperand());
	}
	
	public void subtractInts(int leftOperand, int rightOperand) {
		Operand operand1 = new Operand(leftOperand);
		Operand operand2 = new Operand(rightOperand);
		Subtraction subtract = new Subtraction();
		SubtractionTest test = new SubtractionTest();
		test.printOperandsToConsole(operand1, operand2);
		int testResult = subtract.calculate(operand1, operand2);
		resultObject.printResult(testResult);
	}

	@Test 
	public void subtractPositiveLargerFromPositiveSmaller() {
		SubtractionTest test = new SubtractionTest();
		test.subtractInts(5, 23);
	}
	
	@Test
	public void subtractNegativeints() {
		SubtractionTest test = new SubtractionTest();
		test.subtractInts(-87, -43);
	}
}
