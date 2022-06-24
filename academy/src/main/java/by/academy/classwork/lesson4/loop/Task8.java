package by.academy.classwork.lesson4.loop;

public class Task8 {
	public static void main(String[] args) {
		int k=(int)Math.random()*6;
		int result=1;
		
		for (int n=k; n<=5; result*=n++) {
			}
		
		System.out.println("Факториал значения " + k + " равен " + result);
	}
}