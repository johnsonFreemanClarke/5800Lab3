package com.cs5800.lab3;

public class Modulation extends Expression{
	private int result;
	
	public int calculate(Operand operand1, Operand operand2) {
		enforcer.checkDivisor(operand2.getOperand());
		result = operand1.getOperand() % operand2.getOperand();
		return result;
	}
}
