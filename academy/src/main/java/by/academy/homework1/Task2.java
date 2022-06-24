package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите тип данных");
		String type = scan.nextLine();
		type = type.toLowerCase();
		
		System.out.println("Введите переменную");
		
		switch(type) {
			case "int":
				int varInt = scan.nextInt();
				System.out.println(varInt%2);
				break;
			case "double":
				double varDouble = scan.nextDouble();
				System.out.println(varDouble*70/100);
				break;
			case "float":
				float varFloat = scan.nextFloat();
				System.out.println(varFloat*varFloat);
				break;
			case "char":
				char varChar = scan.next().charAt(0);
				System.out.println(varChar);
				break;
			case "string":
				String varStr = scan.nextLine();
				System.out.println("Hello " + varStr);
				break;
			default:
				scan.nextLine();
				System.out.println("Unsupported type");
		}
		
		scan.close();
	}
}
				
				
				
				
				
				
				
				
				
				