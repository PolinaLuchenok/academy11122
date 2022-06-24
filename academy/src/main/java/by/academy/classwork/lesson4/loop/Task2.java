package by.academy.classwork.lesson4.loop;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число от 1 до 7");
		int number = scan.nextInt();
		
		if (number == 1) {
			System.out.println("Понедельник");
		} else if (number == 2){
			System.out.println("Вторник");
		} else if (number == 3){
			System.out.println("Среда");
		} else if (number == 4){
			System.out.println("Четверг");
		} else if (number == 5){
			System.out.println("Пятница");
		} else if (number == 6 | number == 7){
			System.out.println("Выходной");
		}
		
		scan.close();
	}
}
