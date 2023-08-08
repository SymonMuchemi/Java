package com.symon;

public class Dynamic_Array {
    int size;
    int capacity = 0;
    Object[] array;

    public Dynamic_Array(){
        this.array = new Object[capacity];
    }
    public Dynamic_Array(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void grow(){
        capacity *= 2;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public void shrink(){
        capacity /= 2;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public void add(Object data){
        if (size >= capacity)
            grow();
        array[size] = data;
        size++;
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
    public void printArray(){
        String string = "";
        int i = 0;
        for (; i < size; i++) {
            string += array[i] + ", ";
        }
        if (!string.isEmpty()){
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }

        System.out.println(string);
    }

    public static void main(String[] args) {
        Dynamic_Array dynamic_array = new Dynamic_Array(5);
        System.out.println(dynamic_array.capacity);
        System.out.println(dynamic_array.size);

        dynamic_array.add(20);
        dynamic_array.add(10);
        dynamic_array.add(5);
        dynamic_array.add(63);

        System.out.println(dynamic_array.isEmpty());
        dynamic_array.printArray();
    }
}
