import java.nio.charset.Charset;
import java.util.Scanner;

public class MyFirstApp {
    public static void main (String[] arg) {
        System.out.println("У какого языка программирования следующий слоган:");
        System.out.println("Write once, run anywhere");
        System.out.print("Написано однажды, ");
        System.out.println("работает везде");

        String answer = new Scanner(System.in).next();
        if (answer.equalsIgnoreCase("Java")) {
            System.out.println("Вы угадали");
        } else System.out.println("Увы, но - это Java");


        System.out.println(Charset.defaultCharset().displayName());
        Scanner consol = new Scanner(System.in, "cp866");
        System.out.println("Введите свое имя: ");
        System.out.println(consol.nextLine());
    }  
}
