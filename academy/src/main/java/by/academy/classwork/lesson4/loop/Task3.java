package by.academy.classwork.lesson4.loop;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число от 1 до 7");
		int number = scan.nextInt();
		
		switch (number) {
		case 1:
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Выходной");
			break;
		case 7:
			System.out.println("Выходной");
			break;
		default:
			break;
		}
		
		scan.close();
	}
}
