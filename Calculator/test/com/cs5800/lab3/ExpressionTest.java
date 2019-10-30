package com.cs5800.lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionTest {
	Display resultObject = new Display();
	
	public void printOperandsToConsole(Operand operand1, Operand operand2) {	
		System.out.println("operand1 = " + operand1.getOperand());
		System.out.println("operand2 = " + operand2.getOperand());
	}
	
	@Test
	public void addTwoPositiveInts() {
		Operand operand1 = new Operand(5);
		Operand operand2 = new Operand(7);
		Addition add = new Addition();
		ExpressionTest test = new ExpressionTest();
		test.printOperandsToConsole(operand1, operand2);
		int testResult = add.calculate(operand1, operand2);
		resultObject.printResult(testResult);
	}

}
