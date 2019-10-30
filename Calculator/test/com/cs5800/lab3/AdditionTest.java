package com.cs5800.lab3;

import java.util.Random;
import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {
	Display resultObject = new Display();
	
	public void printOperandsToConsole(Operand operand1, Operand operand2) {	
		System.out.println("operand1 = " + operand1.getOperand());
		System.out.println("operand2 = " + operand2.getOperand());
	}
	
	public void addInts(int leftOperand, int rightOperand) {
		Operand operand1 = new Operand(leftOperand);
		Operand operand2 = new Operand(rightOperand);
		Addition add = new Addition();
		AdditionTest test = new AdditionTest();
		test.printOperandsToConsole(operand1, operand2);
		int testResult = add.calculate(operand1, operand2);
		resultObject.printResult(testResult);
	}

	@Test 
	public void addPositiveInts() {
		AdditionTest test = new AdditionTest();
		test.addInts(67, 59);
	}
	
	@Test
	public void addPositiveAndNegativeInts() {
		AdditionTest test = new AdditionTest();
		test.addInts(-12, 8);
		test.addInts(60, -18);
	}
	
	@Test 
	public void addNegativeInts() {
		AdditionTest test = new AdditionTest();
		test.addInts(-32, -8);
		test.addInts(-16, -27);
	}
	

}
