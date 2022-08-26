package by.academy.homework6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) throws IOException {
		List<User> arrayList = new ArrayList<>();
		
		arrayList.add(new User("Петр", "Петров", 22));
		arrayList.add(new User("Николай", "Николаев", 62));
		arrayList.add(new User("Иван", "Иванов", 29));
		arrayList.add(new User("Егор", "Егоров", 44));
		arrayList.add(new User("Артем", "Артемов", 31));
		arrayList.add(new User("Виталий", "Витальев", 66));
		arrayList.add(new User("Павел", "Павлов", 54));
		arrayList.add(new User("Денис", "Денисов", 37));
		arrayList.add(new User("Максим", "Максимов", 51));
		arrayList.add(new User("Елена", "Ленина", 13));
		
		File dir = new File("users");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		for (User user: arrayList) {
			File file = new File(dir, user.getFirstName() + "_" + user.getLastName() + ".txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			
			try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
					ObjectOutputStream oos = new ObjectOutputStream(bos)) {
				oos.writeObject(user);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
