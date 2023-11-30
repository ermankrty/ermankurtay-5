package com.assignment5.ermankurtay;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

    private Object[] items = new Object[10];
    private int size = 0;
        
//    public CustomArrayList() {
//        this.items = new Object[10];
//        this.size = 0;
//        
//    }

    @Override
    public boolean add(T item) {
    	
    	int newSize = size;
    	
    	size++;
       
    	
//    	System.out.println("size: " + size);
//    	
//    	System.out.println("length: " + items.length);

    	if(size == items.length) {
    	
    		newSize = items.length * 2;
    		
    	}
    	
    	 if(newSize > items.length  && items !=null) {
         	
         	items = Arrays.copyOf(items, items.length * 2);
         	
            items[size] = item;

         	return true;
         	
         }
    	
    	         
        else {
        
            items[size] = item;

        }

        if(item == null) {
        	
        	return false;
        }
        
        
        
        return true;
    }




    @Override
    public int getSize() {
    
//    	int count =0;
//		for(int i=0; i < items.length; i++) {
//	
//		if (items[i] != null){
//		
//		count ++;
//	}

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
