import java.nio.charset.Charset;
import java.util.Scanner;

public class MyFirstApp {
    public static void main (String[] arg) {
        System.out.println("Write once, run anywhere");
        System.out.print("Написано однажды, ");
        System.out.println("работает везде");
        System.out.println(Charset.defaultCharset().displayName());

        Scanner consol = new Scanner(System.in, "cp866");
        System.out.println("Введите свое имя: ");
        System.out.println(consol.nextLine());
    }  
}
