package com.cs5800.lab3;

import java.util.Random;
import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionTest {
	Display resultObject = new Display();
	
	public void printOperandsToConsole(Operand operand1, Operand operand2) {	
		System.out.println("operand1 = " + operand1.getOperand());
		System.out.println("operand2 = " + operand2.getOperand());
	}
	
	public void addInts(int leftOperand, int rightOperand) {
		Operand operand1 = new Operand(leftOperand);
		Operand operand2 = new Operand(rightOperand);
		Addition add = new Addition();
		ExpressionTest test = new ExpressionTest();
		test.printOperandsToConsole(operand1, operand2);
		int testResult = add.calculate(operand1, operand2);
		resultObject.printResult(testResult);
	}

	@Test 
	public void addPositiveInts() {
		ExpressionTest test = new ExpressionTest();
		test.addInts(67, 59);
	}
	
	@Test
	public void addPositiveAndNegativeInts() {
		ExpressionTest test = new ExpressionTest();
		test.addInts(-12, 8);
		test.addInts(60, -18);
	}
	
	@Test 
	public void addNegativeInts() {
		ExpressionTest test = new ExpressionTest();
		test.addInts(-32, -8);
		test.addInts(-16, -27);
	}
	

}
