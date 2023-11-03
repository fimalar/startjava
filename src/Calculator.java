public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 7;
        int secondNumber = 9;
        int result = 0;
        char sign = '*';

        if (sign == '+') {
            result = firstNumber + secondNumber;
        } else if (sign == '-') {
            result = firstNumber - secondNumber;
        } else if (sign == '*') {
            result = firstNumber * secondNumber;
        } else if (sign == '/') {
            result = firstNumber / bsecondNumber
        } else if (sign == '^') {
            result = firstNumber * firstNumber;
        } else if (sign == firstNumber % secondNumber) {
            result = firstNumber % secondNumber;
        }
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }
}