package test.java.com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.mycompany.app.Addition;
import main.java.com.mycompany.app.Display;
import main.java.com.mycompany.app.Multiplication;
import main.java.com.mycompany.app.Operand;

public class MultiplicationTest {
	Display resultObject = new Display();
	
	public void printOperandsToConsole(Operand operand1, Operand operand2) {	
		System.out.println("operand1 = " + operand1.getOperand());
		System.out.println("operand2 = " + operand2.getOperand());
	}
	
	public void multiplyInts(int leftOperand, int rightOperand) {
		Operand operand1 = new Operand(leftOperand);
		Operand operand2 = new Operand(rightOperand);
		Multiplication multiply = new Multiplication();
		MultiplicationTest test = new MultiplicationTest();
		test.printOperandsToConsole(operand1, operand2);
		int testResult = multiply.calculate(operand1, operand2);
		resultObject.printResult(testResult);
	}

	@Test
	public void multiplicationOfTwoNegativeInts() {
		MultiplicationTest test = new MultiplicationTest();
		test.multiplyInts(-8, -9);
	}
	
	@Test
	public void multiplicationOfZero() {
		MultiplicationTest test = new MultiplicationTest();
		test.multiplyInts(-78928, 0);
	}

}
