package com.assignment5.ermankurtay;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

    private Object[] items;
    private int size;
        
    public CustomArrayList() {
        this.items = new Object[10];
        this.size = 0;
        
    }

    @Override
    public boolean add(T item) {
       

        items[size] = item;
        if(item == null) {
        	
        	return false;
        }
        if(item != null) {
        	
        	size++;
        }
        if(size == items.length && items !=null) {
        	
        	Object[] newArr = Arrays.copyOf(items, items.length * 2);
        	
        	items = newArr;
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
return size;
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
