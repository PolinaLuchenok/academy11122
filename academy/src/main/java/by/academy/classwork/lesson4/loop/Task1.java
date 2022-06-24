package by.academy.classwork.lesson4.loop;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		int number = scan.nextInt();
		
		if (number >= 0 & number <= 10) {
			System.out.println("Положительное число меньше 10");
		} else {
			System.out.println("Положительное число больше 10 или отрицательное");
		}
		
		scan.close();
	}
}
