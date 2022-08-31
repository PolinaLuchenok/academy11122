package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Task2 {

	public static void main(String[] args) {
		User user = new User();
		Class<User> userClass = User.class;
		Class<Person> personClass = Person.class;

		Field[] userFields = userClass.getFields();
		System.out.println(userFields);
		
		for(Field f: userFields) {
			System.out.println(f);
		}
		
		try {
			Field userField = userClass.getField("password");
			System.out.println(userField);
		} catch (NoSuchFieldException e) {
				System.out.println(e);
		}
		
		Method[] userMethods = userClass.getMethods();
		System.out.println(userMethods);
		
		for(Method m: userMethods) {
			System.out.println(m);
		}
		
		try {
			Method userMethod = userClass.getMethod("getDateOfBirth");
			System.out.println(userMethod);
		} catch (NoSuchMethodException e) {
				System.out.println(e);
		}
	
		Field[] declaredFields = userClass.getDeclaredFields();
		System.out.println(declaredFields);
		
		for(Field f: declaredFields) {
			System.out.println(f);
		}
		
		try {
			Field declaredField = userClass.getDeclaredField("login");
			System.out.println(declaredField);
		} catch (NoSuchFieldException e) {
				System.out.println(e);
		}
		
		Method[] declaredMethods = userClass.getDeclaredMethods();
		System.out.println(declaredMethods);
		
		for(Method m: declaredMethods) {
			System.out.println(m);
		}
		
		try {
			Method declaredMethod = userClass.getDeclaredMethod("printUserInfo");
			System.out.println(declaredMethod);
		} catch (NoSuchMethodException e) {
				System.out.println(e);
		}
		
		try {
			Field firstNameField = personClass.getDeclaredField("firstName");
			firstNameField.setAccessible(true);
			firstNameField.set(user, "Petr");
			System.out.println("first name: " + firstNameField.get(user));
			
			Field lastNameField = personClass.getDeclaredField("lastName");
			lastNameField.setAccessible(true);
			lastNameField.set(user, "Petrov");
			System.out.println("last name: " + lastNameField.get(user));
			
			Field ageField = personClass.getDeclaredField("age");
			ageField.setAccessible(true);
			ageField.set(user, 34);
			System.out.println("age: " + ageField.get(user));
			
			Field dateOfBirthField = personClass.getDeclaredField("dateOfBirth");
			dateOfBirthField.setAccessible(true);
			dateOfBirthField.set(user, "26 March 1988");
			System.out.println("date of birth: " + dateOfBirthField.get(user));
			
			Field loginField = userClass.getDeclaredField("login");
			loginField.setAccessible(true);
			loginField.set(user, "javist");
			System.out.println("login: " + loginField.get(user));
			
			Field passwordField = userClass.getDeclaredField("password");
			passwordField.setAccessible(true);
			passwordField.set(user, "12345");
			System.out.println("password: " + passwordField.get(user));
			
			Field emailField = userClass.getDeclaredField("email");
			emailField.setAccessible(true);
			emailField.set(user, "javist@mail.ru");
			System.out.println("email: " + emailField.get(user));
			
			Method toStringUserMethod = userClass.getDeclaredMethod("toString");
			toStringUserMethod.invoke(user);
		} catch (NoSuchFieldException | NoSuchMethodException | SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
