package com.assignment5.ermankurtay;

public class CustomArrayList<T> implements CustomList<T> {

    private Object[] items;
    private int size;

    public CustomArrayList() {
        this.items = new Object[1]; 
        this.size = 0;
    }

    @Override
    public boolean add(T item) {
        if (size == items.length) {
            Object[] newArray = new Object[items.length * 2];

            for (int i = 0; i < size; i++) {
                newArray[i] = items[i];
            }

            items = newArray;
        }

        items[size++] = item;

        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            T result = (T) items[index];
            return result;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
