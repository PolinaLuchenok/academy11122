package by.academy.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException  {
		File file = new File("./", "result.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		try (BufferedReader fr = new BufferedReader(new FileReader("task2.txt")); FileWriter fw = new FileWriter(file)) {
			int i;
			while ((i = fr.read()) != -1) {
				if((char) i != ' ') {
					fw.write((char) i);
				}
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}
