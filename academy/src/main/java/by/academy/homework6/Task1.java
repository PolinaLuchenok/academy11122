package by.academy.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		File dir = new File("homework6");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		File file = new File(dir, "task1.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		System.out.println("Введите информацию!");
		
		try(FileWriter fw = new FileWriter(file)) {
			do {
				str = br.readLine();
				
				if(str.compareTo("stop") == 0) {
					break;
				}
				
				str = str + "\r\n";
				
				fw.write(str);
			} while (str.compareTo("stop") !=0);
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}
}
