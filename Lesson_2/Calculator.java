public class Calculator {
    int firstNumber;
    int secondNumber;
    int result;
    char sign;

    public void run() {
        switch (sign) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '^':
                if (secondNumber == 0) {
                    System.out.println("1");
                }
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber ;
                }
                System.out.println(result);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println("Введенная математическая операция не поддерживается");
        }
    }
}