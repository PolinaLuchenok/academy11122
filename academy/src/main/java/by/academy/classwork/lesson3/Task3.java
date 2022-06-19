package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Создайте число");
		int number = scan.nextInt();

		if (number%2==0) {
			System.out.println("Это четное число");
		} else {
			System.out.println("Это нечетное число");
		}
		
		scan.close();
	}
}
