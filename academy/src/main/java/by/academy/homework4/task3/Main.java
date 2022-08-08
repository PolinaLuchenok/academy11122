package by.academy.homework4.task3;

public class Main {

	public static void main(String[] args) {
		Task3<Integer> intArray1 = new Task3<>();
		System.out.println(intArray1.outputLenght());
		
		Task3<Integer> intArray2 = new Task3<>(4);
		System.out.println(intArray2.outputLenght());

		intArray2.add(1);
		intArray2.add(2);
		intArray2.add(3);
		intArray2.add(4);
		System.out.println(intArray2);
		
		intArray2.add(5);
		intArray2.add(6);
		System.out.println(intArray2);
		
		System.out.println(intArray2.get(1));
		System.out.println(intArray2.getFirst());
		System.out.println(intArray2.getLast());
		
		Task3<Integer> intArray3 = new Task3<>(4);
		intArray3.add(1);
		intArray3.add(2);
		System.out.println(intArray3);
		intArray3.outputLastFilled();
		intArray2.outputLastFilled();
		
		intArray2.remove(0);
		System.out.println(intArray2);
		
		intArray3.remove(Integer.valueOf(1));
		System.out.println(intArray3);
		
		intArray2.remove(3);
		System.out.println(intArray2);
		
		intArray2.outputLastFilled();
		
	}

}
