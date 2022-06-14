package by.academy.classwork.lesson2;

public class Application {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Mur");

		cat2.eat();
		cat2.walk();
		cat2.sleep();

		cat1.grow();
		cat1.grow();
		cat1.grow();
		cat1.getAge();
	}
}
