package main.java.com.mycompany.app;

public class Subtraction extends Expression{
	public int calculate(Operand operand1, Operand operand2) {
		return (operand1.getOperand() - operand2.getOperand());
	}
}
