package com.cs5800.lab3;

public class Division extends Expression{
	public int calculate(Operand operand1, Operand operand2) {
		enforcer.checkDivisor(operand2.getOperand());
		return (operand1.getOperand() / operand2.getOperand());
	}
}
