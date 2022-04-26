package test;

import static org.junit.Assert.*;

import org.junit.Test;

import design.pattern.MySample;

public class MySampleTest {

	@Test
	public void testCalcSum() {
		assertEquals(40, MySample.calcSum(10, 20));
	}
}
