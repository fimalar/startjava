public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
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
            for (int i = 0; i < b; i++) {
            result += a * a;                
            }
        } else if (sign == a % b) {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}