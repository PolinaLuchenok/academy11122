package by.academy.homework5;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T>  {
	private T[][] arr;
    private int i, j;

    public ArrayIterator() {
		super();
	}
    
	public ArrayIterator(T[][] arr) {
		super();
		this.arr = arr;
	}

	@Override
    public boolean hasNext() {
		return i < arr.length && j < arr[i].length;   
    }

    @Override
    public T next() {
    	T element = arr[i][j++];
        if (j >= arr[i].length) {
          i++;
          j = 0;
        }
        return element;
    }
}
