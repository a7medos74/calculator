package Calculater;

public class FuncCalc {
	//summation
	public int calcsum(int x ,int y) {
		return x+y;
	}
	//subtract
	public int calcSub(int x ,int y) {
		return x-y;
	}
	//multiply
	public int calcmul(int x ,int y) {
		return x*y;
	}
	//Dividing
	public int calcDiv(int x ,int y) {
		return x/y;
	}
	//power
	public int calcpower(int num ,int pow) {
		int result=1;
		for(int i=1;i<=pow;i++) {
			result=num*result;
		}
		return result;
	}
}
