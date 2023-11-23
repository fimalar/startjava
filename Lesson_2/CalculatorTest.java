import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String inputYesNo = "";
        do {    
            System.out.print("Введите первое число: ");
            calculator.setA(scan.nextInt());
            scan.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scan.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scan.nextInt());
            scan.nextLine();
            calculator.calc();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                inputYesNo = scan.nextLine();
            } while (!inputYesNo.equals("yes") && !inputYesNo.equals("no"));
        } while (inputYesNo.equals("yes"));
    }
}