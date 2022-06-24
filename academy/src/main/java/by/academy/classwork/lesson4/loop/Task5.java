package by.academy.classwork.lesson4.loop;

public class Task5 {
	public static void main(String[] args) {
		int num = 1;
		
		do {
			if (num%5 == 0) {
			System.out.println(num);
			}
			num++;
		} while (num<=100);
	}
}
