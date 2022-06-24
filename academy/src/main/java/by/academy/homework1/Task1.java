package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите сумму покупки");
		double sum = scan.nextDouble();

		System.out.println("Введите возраст покупателя");
		int age = scan.nextInt();
		
		int disc=0;

		if (sum<100) {
			disc=5;
		} else if (sum>=100 & sum<200){
			disc=7;
		} else if (sum>=200 & sum<300){
			disc =12;
			if (age > 18 ) {
				disc +=4;
			} else {
			disc -= 3;
			}
		} else if (sum>=300 & sum<400){
			disc=15;
		} else if (sum>=400) {
			disc=20;
		} 
		
		double price=sum*(100-disc)/100;
		System.out.println("Финальная цена: "+price);
		
		scan.close();
	}
}
