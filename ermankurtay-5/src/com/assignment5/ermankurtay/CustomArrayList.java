package com.assignment5.ermankurtay;
import java.util.Arrays;


public class CustomArrayList<T> implements CustomList<T> {
	
	private Object[] items = new Object[10];
	private int size = 0;
	private int counter = 0;
	
	
	
	@Override
	public boolean add(T item) {
		
		if (item == null) return false;
 
		if (items.length == size) {
	 
 
			items = Arrays.copyOf(items, items.length * 2);
 
			items[counter] = item;
 
			counter++;
 
			size++;
 
		}
 
		else {
	 
			items[counter] = item;
 
			size++;
 
			counter++;
			
		}
 
		return true;
 
	}
	



    @Override
    public int getSize() {
    
    	int count =0;
		for(int i=0; i < items.length; i++) {
	
		if (items[i] != null){
		
		count ++;
	}
		}
			return items.length;
}

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            T result = (T) items[index];
            return result;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
