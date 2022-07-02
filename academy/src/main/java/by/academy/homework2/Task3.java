package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		
		int n = str.indexOf(" ");
		int indexEnd = n/2;
		String word = str.substring(0, indexEnd);
		
		int m = ((str.length()-1)-n)/2;
		int indexStart = str.length()-m;
		
		word = word.concat(str.substring(indexStart));
		
		System.out.println("Новое слово: " + word);
		
		
		scan.close();
	}
}
