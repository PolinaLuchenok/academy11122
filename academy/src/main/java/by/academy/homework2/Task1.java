package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		boolean result = true;
		if (str1.length() != str2.length()) {
			result = false;
		} else {
			int[] letters = new int[256];
			char[] str1_array = str1.toCharArray();
			for (char c : str1_array) {
				letters[(int)c]++;	
			}
			
			for (int i=0; i<str2.length(); i++) {
				int c = (int) str2.charAt(i);
				if (--letters[c]<0) {
					result = false;
				}
			}
		}
		System.out.println(result);
		
		scan.close();
	}
}
