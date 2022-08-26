package by.academy.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

	public static void main(String[] args) throws IOException {
		String firstFile = "task2.txt";
		int count = 0;
		
		File dir = new File("task4");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(firstFile)); FileReader fr = new FileReader(firstFile)) {
			int j;
			while ((j = br.read()) != -1) {
			count++;
			}
			
			char[] chars = new char[count];
            fr.read(chars);
            String fileContent = new String(chars);

            for(int i=1; i<=100; i++) {
				File file = new File(dir, i + ".txt");
				if(!file.exists()) {
					file.createNewFile();
				}
				
				try (FileWriter fw = new FileWriter(file)) {
					int number = (int)(Math.random()*count);
					fw.write(fileContent.substring(0, number));
				} catch (IOException ex) {
					System.out.print(ex.getMessage());
				}
			}
				
				File files = new File(dir, "result.txt");
				if(!files.exists()) {
					files.createNewFile();
				}
	            String[] list = dir.list();
	            if (list != null) {
					for (String fileName : list) {
						try (FileWriter fw = new FileWriter(files, true)) {
							fw.write(fileName + " " + fileName.length() + " bytes" + "\n");
						} catch (IOException ex) {
							System.out.print(ex.getMessage());
						}
					}
				}	
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}
