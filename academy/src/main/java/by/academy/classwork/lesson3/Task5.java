package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первое число");
		int x = scan.nextInt();

		System.out.println("Введите второе число");
		int y = scan.nextInt();

		if (x>y) {
			System.out.println("Большее число "+x);
			System.out.println("Меньшее число "+y);
		} else if (x==y){
			System.out.println("Эти числа равны");
		} else {
			System.out.println("Большее число "+y);
			System.out.println("Меньшее число "+x);
		}
		
		double a=(double)(x+y)/2;
		System.out.println("Среднее арифметическое: "+a);
		scan.close();
	}
}
