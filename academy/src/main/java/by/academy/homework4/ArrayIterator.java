package by.academy.homework4;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
	
	private T[] arr;
    private int index;

    public ArrayIterator() {
		super();
	}
    
	public ArrayIterator(T[] arr) {
		super();
		this.arr = arr;
	}

	@Override
    public boolean hasNext() {
		if (arr == null || arr.length <= index) {
			return false;
		}
		return arr[index] != null;    
    }

    @Override
    public T next() {
    	return arr[index++];
    }
}
