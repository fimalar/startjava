package com.startjava.lesson_1.final_;

public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int result = 0;
        char sign = '^';

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a ;
            }
        } else if (sign == a % b) {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}