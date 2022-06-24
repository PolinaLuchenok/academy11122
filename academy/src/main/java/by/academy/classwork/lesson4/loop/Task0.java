package by.academy.classwork.lesson4.loop;

import java.util.Scanner;

public class Task0 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		String numStr = scan.nextLine();
		int numInt = Integer.parseInt(numStr);
		
		if (numInt%2 != 0) {
			System.out.println("Нечетное число " + numInt);
		}
		
		scan.close();
	}
}
