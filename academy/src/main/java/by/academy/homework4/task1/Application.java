package by.academy.homework4.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первую дату в формате dd-MM-yyyy!");
		String date = scan.nextLine();
		
		Pattern pattern = Pattern.compile("\\d{2}\\-\\d{2}\\-\\d{4}"); 
        Matcher matcher = pattern.matcher(date);
        boolean a = matcher.matches();
        if(a == false) {
			System.out.println("Вы неверно ввели дату!");
			return;
		}
		
		CustomDate newDate1 = new CustomDate(date);
		
		newDate1.getDayOfWeek();
		newDate1.checkLeapYear();
		
		System.out.println("Введите день второй даты в формате dd!");
		int dateDay = scan.nextInt();
		
		System.out.println("Введите месяц второй даты в формате MM!");
		int dateMonth = scan.nextInt();
		
		System.out.println("Введите год второй даты в формате yyyy!");
		int dateYear = scan.nextInt();
		
        CustomDate newDate2 = new CustomDate(dateDay, dateMonth, dateYear);
        
        newDate2.getDayOfWeek();
        newDate2.checkLeapYear();
        newDate2.calculateDays(newDate1);

		scan.close();
	}
}
