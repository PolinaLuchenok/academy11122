package by.academy.homework7.task3;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import by.academy.junit.Calculator;
import junit.framework.Assert;

@RunWith(value = Parameterized.class)
public class SubTestParametrize extends Assert{
	private double valueA;
	private double valueB;
	private double expected;
	
	public SubTestParametrize(double valueA, double valueB, double expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Iterable<Double[]> dataForTestSub() {
		return Arrays.asList(new Double[][] {{8.1, 4.1, 4.0}, {10.5, 2.15, 8.35}, {11.0, 2.0, 9.0}});
	}
		
	@Test
	public void subTest() {
		assertEquals(expected, Calculator.sub(valueA, valueB));
	}
}
