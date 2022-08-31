package by.academy.homework7.task3;

import org.junit.Test;
import org.junit.runner.RunWith;
import by.academy.junit.Calculator;
import junit.framework.Assert;

@RunWith(TestRunner.class)
public class MultTest {
	
	@Test
	public void testMult() {
		Assert.assertEquals(100.0, Calculator.mult(20.0, 5.0));
	}
}
