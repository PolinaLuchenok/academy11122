package by.academy.classwork.lesson5;

public class Task {
	public static void main(String[] args) {
		String s = "Для работы со строками в языке Java используются классы String, StringBuilder, StringBuffer";
		int index = -10; //любое нереальное для индекса число
		
		//System.out.println(s.indexOf('S', 57));
		
		do {
			index = s.indexOf("S", index == -10 ? 0 : index+1);
			if (index != -1) {
				System.out.println(index);
			}
		} while (index != -1);
	};
}
