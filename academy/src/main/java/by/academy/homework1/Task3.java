package by.academy.homework1;

import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число от 1 до 10");
		int num = scan.nextInt();
		int [] table = new int[10];

		for (int i=0; i<10; i++) {
			table[i]=num*(i+1);
		}
		
		System.out.println(Arrays.toString(table));
		
		scan.close();
	}
}
