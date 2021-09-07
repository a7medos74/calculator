package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculater.FuncCalc;

class testcases {
	FuncCalc fc=new FuncCalc();
	@Test
	public void testsum() {
		int sum = fc.calcsum(10, 5);
		assertEquals(15, sum);
	}
	@Test
	public void testsubtract() {
		int sub = fc.calcSub(10, 2);
		assertEquals(8, sub);
	}
	@Test
	public void testmultiply() {
		int mul=fc.calcmul(5, 10);
		assertEquals(50, mul);
	}
	@Test
	public void testDividing() {
		int div=fc.calcDiv(25, 5);
		assertEquals(5, div);
	}
	@Test
	public void testPower() {
		int pow=fc.calcpower(5, 3);
		assertEquals(125, pow);
	}
}
