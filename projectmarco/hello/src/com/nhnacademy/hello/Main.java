package com.nhnacademy.hello;

import com.nhnacademy.hello.util.Calculator;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello, Java!");

        int a = 100, b = 10;
        System.out.println("더하기: " + Calculator.plus(a, b));
        System.out.println("빼기: " + Calculator.subtract(a, b));
        System.out.println("곱하기: " + Calculator.multiply(a, b));
        System.out.println("나누기: " + Calculator.divide(a, b));
    }
}
