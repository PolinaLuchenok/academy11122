package by.academy.homework4.task3;

import java.util.Arrays;
import java.util.Objects;

public class Task3<T> {
	private T[] array;
	private int index = 0;
	
	public Task3() {
		super();
		array = (T[])new Object[16];
	}

	public Task3 (int i) {
		array = (T[])new Object[i];
	}
	
	public void add(T obj) {
		if(index == array.length) {
			grow();
		} 
		array[index++] = obj;
	}
	
	private void grow() {
		int newLength = (int) (array.length == 0 ? 1 : array.length * 1.5);
		T[] newArray = (T[])new Object[newLength];
		System.arraycopy(array, 0, newArray, 0, array.length);
		array = newArray;
	}

	public T get(int i) {
		return array[i]; 
	}

	public T getLast() {
		return array[array.length-1];
	}
	
	public T getFirst() {
		return array[0];
	}
	
	public int outputLenght() {
		return array.length;
	}
	
	public int outputLastFilled() {
		int lastFilled = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] == null) {
				return lastFilled=i-1;
			} 
			if(i == array.length-1 & array[i] != null) {
				return lastFilled=array.length-1;
			}
		}
		return lastFilled;
	}
	
	public void remove(int i) {
		if(i < 0 | i >= array.length) {
			System.out.println("Такой индекс отсутствует в массиве");
		} else {
			for (int j = i; j < outputLastFilled(); j++) {
				array[j] = array[j+1];
			   }
			if (i <= outputLastFilled()) {
				array[outputLastFilled()]= null;
			} else {
				System.out.println("Значение с таким индексом null");
			}
		}
	}
	
	public void remove(T obj) { 
		for(int i=0; i<outputLastFilled(); i++) {
			if(obj == array[i]) {
				remove (i);
			}
		}
	}
	
	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(array);
		result = prime * result + Objects.hash(index);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task3<T> other = (Task3<T>) obj;
		return Arrays.deepEquals(array, other.array) && index == other.index;
	}

	@Override
	public String toString() {
		return "Task3 [array=" + Arrays.toString(array) + "]";
	}
}
