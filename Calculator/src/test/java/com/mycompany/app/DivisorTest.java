package test.java.com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.mycompany.app.Addition;
import main.java.com.mycompany.app.Display;
import main.java.com.mycompany.app.Division;
import main.java.com.mycompany.app.Modulation;
import main.java.com.mycompany.app.Operand;

public class DivisorTest {
	Display resultObject = new Display();
	
	public void printOperandsToConsole(Operand operand1, Operand operand2) {	
		System.out.println("operand1 = " + operand1.getOperand());
		System.out.println("operand2 = " + operand2.getOperand());
	}
	
	@Test
	public void checkDivisionByZero() {
		Operand operand1 = new Operand(5);
		Operand operand2 = new Operand(0);
		Division divide = new Division();
		DivisorTest test = new DivisorTest();
		test.printOperandsToConsole(operand1, operand2);
		try {
			int testResult = divide.calculate(operand1, operand2);
			resultObject.printResult(testResult);
		} catch(ArithmeticException e) {
			System.out.println("cannot divide by zero\n");
		}
	}
	
	@Test 
	public void checkModulationDivisorByZero() {
		Operand operand1 = new Operand(65);
		Operand operand2 = new Operand(0);
		Modulation modulo = new Modulation();
		DivisorTest test = new DivisorTest();
		test.printOperandsToConsole(operand1, operand2);
		try {
			int testResult = modulo.calculate(operand1, operand2);
			resultObject.printResult(testResult);
		} catch(ArithmeticException e) {
			System.out.println("cannot divide by zero\n");
		}
	}
	
	@Test 
	public void checkModulusOfTwoPositiveInts() {
		Operand operand1 = new Operand(67);
		Operand operand2 = new Operand(28);
		Modulation add = new Modulation();
		DivisorTest test = new DivisorTest();
		test.printOperandsToConsole(operand1, operand2);
		int testResult = add.calculate(operand1, operand2);
		resultObject.printResult(testResult);
	}

}
