package com.symon.generics;

public class GenericList<T>{
    // Array of type T
    private final T[] items = (T[]) new Object[10];
    private int count;
    public void add(T item){
        items[count++] = item;
    }
    public T getItem(int index){
        return items[index];
    }
}
