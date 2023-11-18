import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String s = "";
        do {    
            System.out.print("Введите первое число: ");
            calculator.firstNumber = scan.nextInt();
            scan.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.sign = scan.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            calculator.secondNumber = scan.nextInt();
            calculator.run();
            scan.nextLine();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                s = scan.nextLine();
                if (s.equals("no") == true) {
                    break;
                }
            } while (s.equals("yes") == false);
        } while (s.equals("yes"));
    }
}