package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calc() {
        int result = 1;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("На ноль делить нельзя");
                }
                break;
            case '^':
                for (int i = 0; i < b; i++) {
                    result *= a ;
                }
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Введенная математическая операция не поддерживается");
                return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}