package by.academy.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Map;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		//задание 1
		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("A");
		arrayList1.add("A");
		arrayList1.add("C");
		arrayList1.add("A");
		arrayList1.add("A");
		returnHashSet(arrayList1);
		
		//задание 2
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkList = new LinkedList<>();
		
		addElements(arrayList);
		addElements(linkList);
		
	    long startTimeA = System.currentTimeMillis();
	    getElements(arrayList);
	    long endTimeA = System.currentTimeMillis();
	    
	    long startTimeL = System.currentTimeMillis();
	    getElements(arrayList);
	    long endTimeL = System.currentTimeMillis();
	    
	    System.out.println("Время выполнения метода для ArrayList: " + (endTimeA-startTimeA) + "мс");
	    System.out.println("Время выполнения метода для LinkedList: " + (endTimeL-startTimeL) + "мс");
	    
		//задание 3
		Integer[][] array = new Integer[][]{{1,2,3,4},{1,2,3,4},{1,2,3}};
	    ArrayIterator<Integer> arr = new ArrayIterator<Integer>(array);
	    
	    while (arr.hasNext()) {
			Integer i = arr.next();
			System.out.println(i);
		}
	    
	    //задание 4
	    List<Integer> ratingList = new ArrayList<>();
	    ratingList.add(5);
	    ratingList.add(7);
	    ratingList.add(9);
	    ratingList.add(7);
	    ratingList.add(8);
	    ratingList.add(9);
	    
	    ListIterator<Integer> listIterator = ratingList.listIterator();
	    int max = ratingList.get(0);
	    while (listIterator.hasNext()) {
	    	int i = listIterator.next();
	    	if(i > max) {
	    		max = i;
	    	}
	    }
	    System.out.print("Самая высокая оценка: " + max);
	    
	    //задание 5
		String text = "Привет! Как дела?";
		String textWorking = text.replaceAll("(?U)[\\pP\\s]", "").toLowerCase();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < textWorking.length(); i++ ) {
            Integer n = map.get( textWorking.charAt(i) );
            if ( n == null ) {
            	map.put( textWorking.charAt(i), 1 );
            } else {
            	map.put( textWorking.charAt(i), ++n );
            }
        }
		System.out.println(map);
		
		//задание 6
		int array1[] = new int[8];
		
		try {
			array1[9] = 9;
			array1[10] = 10;
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Array is to small, expand the array.");
		}
	}
	
	//задание 1 - возврат коллекции без дубликатов
	public static void returnHashSet(List<String> collection) {
		String[] stringArray = collection.toArray(new String[0]);
		System.out.println(Arrays.toString(stringArray));
		
		for(int i=0; i<stringArray.length; i++) {
	         for (int j=i+1; j<stringArray.length; j++) {
	            if(stringArray[i] == stringArray[j]) {
	            	stringArray[j] = null;
	            }
	         }
	      }
		System.out.println(Arrays.toString(stringArray));
		
		List<String> newArrayList = new ArrayList<>();
		for(String element: stringArray) {
			if(element != null) {
				newArrayList.add(element);
			}
		}
		System.out.println(newArrayList);
	}
	
	//задание 2 - добавление 1 000 000 элементов в ArrayList и LinkedList
	public static void addElements(List<Integer> list) {
		for(int i=0; i<1000000; i++) {
			int a = (int)(Math.random() * 1000000);
			Integer b = new Integer(a);
			list.add(i, b);
		}
	}
	
	//задание 2 - выбор из заполненного списка элемент наугад 100 000 раз
	public static void getElements(List<Integer> list) {
		for(int i=1; i<=100000; i++) {
			int index = (int) (Math.random()*(list.size()));
			System.out.println(list.get(index));
		}
	}
}
