package by.academy.homework7.task3;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import by.academy.junit.Calculator;
import junit.framework.Assert;

@RunWith(value = Parameterized.class)
public class MultTestParametrize extends Assert{
	private double valueA;
	private double valueB;
	private double expected;
	
	public MultTestParametrize(double valueA, double valueB, double expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Iterable<Double[]> dataForTestSub() {
		return Arrays.asList(new Double[][] {{8.1, 4.0, 32.4}, {10.5, 2.5, 26.25}, {11.0, 2.0, 22.0}});
	}
	
	@Test
	public void multTest() {
		assertEquals(expected, Calculator.mult(valueA, valueB));
	}
}
