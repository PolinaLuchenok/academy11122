package by.academy.homework7.task3;

import org.junit.Test;
import org.junit.runner.RunWith;
import by.academy.junit.Calculator;
import junit.framework.Assert;

@RunWith(TestRunner.class)
public class SumTest {
	
	@Test
	public void testSum() {
		Assert.assertEquals(100.0, Calculator.sum(50.5, 49.5));
	}
}
