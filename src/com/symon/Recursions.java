package com.symon;

public class Recursions {
    public static int factorial(int n){
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
    public static int power(int base, int exp){
        if (exp == 0)
            return 1;

        return base * power(base, (exp - 1));
    }

    public static void main(String[] args) {
        System.out.println("3! = " + factorial(3));
        System.out.println("4! = " + factorial(4));
        System.out.println("5! = " + factorial(5));
        System.out.println("6! = " + factorial(6));

        System.out.println("2^6 = " + power(2, 6));
    }
}
