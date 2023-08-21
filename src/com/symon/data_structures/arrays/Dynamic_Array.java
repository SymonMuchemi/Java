package com.symon.data_structures.arrays;

public class Dynamic_Array {
    int size;
    int capacity = 0;
    Object[] array;
    @SuppressWarnings("unused")
    public Dynamic_Array(){
        this.array = new Object[capacity];
    }
    public Dynamic_Array(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public int grow(){
        capacity *= 2;
        Object[] newArray = new Object[capacity];
        if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        return capacity;
    }
    public int shrink(){
        capacity /= 2;
        Object[] newArray = new Object[capacity];
        if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;

        return capacity;
    }
    public int add(Object data){
        if (size >= capacity)
            grow();
        array[size] = data;
        size++;

        return size;
    }
    public int remove(Object data){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == data){
                index = i;
                break;
            }
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        return index;
    }
    public int search(Object data){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                index = i;
                return index;
            }
        }
        return index;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public short printArray(){
        StringBuilder string = new StringBuilder();
        short i = 0;
        for (; i < size; i++) {
            string.append(array[i]).append(", ");
        }
        if (!string.isEmpty()){
            string = new StringBuilder("[" + string.substring(0, string.length() - 2) + "]");
        }
        else {
            string = new StringBuilder("[]");
        }

        System.out.println(string);
        return i;
    }
}
