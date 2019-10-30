package main.java.com.mycompany.app;

public class Enforcer {
	public boolean checkDivisor(int divisor) {
		if(divisor == 0) {
			throw new NumberFormatException("divisor cannot be zero!");
		}
		return true;
	}
}
