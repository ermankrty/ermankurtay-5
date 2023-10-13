package com.assignment5.ermankurtay;

import java.util.ArrayList;

public class CustomArrayList<T> implements CustomList<T> {

    private ArrayList<T> items = new ArrayList<>();

    
    @Override
    public boolean add(T item) {
        if (items.add(item)) {
            return true; // Item was added successfully.
        } else {
            return false; // Item was not added.
        }
    }

    @Override
    public int getSize() {
        return items.size(); 
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index); 
        } else {
            return null; 
        }
    }
}
