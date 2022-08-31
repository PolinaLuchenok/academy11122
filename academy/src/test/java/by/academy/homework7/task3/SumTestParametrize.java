package by.academy.homework7.task3;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import by.academy.junit.Calculator;
import junit.framework.Assert;

@RunWith(value = Parameterized.class)
public class SumTestParametrize extends Assert{
	private double valueA;
	private double valueB;
	private double expected;
	
	public SumTestParametrize(double valueA, double valueB, double expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Iterable<Double[]> dataForTestSum() {
		return Arrays.asList(new Double[][] {{8.1, 4.1, 12.2}, {10.5, 2.15, 12.65}, {11.0, 2.0, 13.0}});
	}
		
	@Test
	public void sumTest() {
		assertEquals(expected, Calculator.sum(valueA, valueB));
	}
}
