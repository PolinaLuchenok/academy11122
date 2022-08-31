package by.academy.homework7.task3;

import org.junit.Test;
import org.junit.runner.RunWith;
import by.academy.junit.Calculator;
import junit.framework.Assert;

@RunWith(TestRunner.class)
public class SubTest {
	
	@Test
	public void testSub() {
		Assert.assertEquals(100.0, Calculator.sub(150.5, 50.5));
	}
}
