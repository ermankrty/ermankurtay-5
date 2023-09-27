package com.assignment5.ermankurtay;

public class CustomArrayList<T> implements CustomList<T> {
	
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		
		 for (int i = 0; i < items.length; i++) {
	            if (items[i] == null) {
	                items[i] = item;
	                return true; 
	            }
	            	}
		 
         return false;

	}
	@Override
	public int getSize() {
		
		int size = 0  ;
		for(int i=0; i< items.length; i++) {
			if(items[i]!= null) {
				size++;
			}
		}
		return size;
	}

	@Override
	public T get(int index) {
		
	    if (items[index] != null) {
	        return (T) items[index];
	    } else {
	        return null; // Return null if the index is out of bounds
	    }
	}

	
}
