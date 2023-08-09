package com.symon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Dynamic_ArrayTests {
    Dynamic_Array testArray = new Dynamic_Array(10);
    @Test
    void remove() {
        testArray.add(25);
        testArray.add(20);
        testArray.add(15);
        testArray.add(10);

        assertEquals(1, testArray.remove(20));
    }
    @Test
    void search(){
        testArray.add(25);
        testArray.add(20);
        testArray.add(15);
        testArray.add(10);

        assertEquals(1, testArray.search(20));
    }
    @Test
    void grow(){testArray.add(25);
        testArray.add(20);
        testArray.add(15);
        testArray.add(10);

        assertEquals(20, testArray.grow());
    }
    @Test
    void shrink(){
        testArray.add(25);
        testArray.add(10);

        assertEquals(5, testArray.shrink());
    }
    @Test
    void isNotEmpty(){
        testArray.add(25);
        testArray.add(20);
        testArray.add(15);
        testArray.add(10);

        assertFalse(testArray.isEmpty());
    }
    @Test
    void isEmpty(){
        Dynamic_Array testArray = new Dynamic_Array(5);

        assertTrue(testArray.isEmpty());
    }
    @Test
    void printArray(){
        testArray.add(25);
        testArray.add(20);
        testArray.add(15);
        testArray.add(10);

        assertEquals(4,testArray.printArray());
    }
    @Test
    void add(){
        assertEquals(1, testArray.add(5));
    }
}