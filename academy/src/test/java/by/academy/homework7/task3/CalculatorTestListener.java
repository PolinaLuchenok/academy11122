package by.academy.homework7.task3;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {
	private static final Description FAILED = Description.createTestDescription("failed", "failed");
	
	public void testFinished(Description description) throws Exception {
        if (!description.getChildren().contains(FAILED)) {
        	System.out.println("Тест выполнен успешно. Название метода: " + description.getMethodName());
        }
    }
	public void testFailure(Failure failure) throws Exception {
        failure.getDescription().addChild(FAILED);
	}
}
