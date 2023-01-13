package org.campus02.calculator;


public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(5,5));
        System.out.println(subract(5,5));
        System.out.println(multiply(5,5));
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int subract(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

}
