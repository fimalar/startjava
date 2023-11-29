import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player firstPlayer = new Player(sc.nextLine());
        System.out.println("Введите имя второго игрока");
        Player secondPlayer = new Player(sc.nextLine());
        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        String inputYesNo = "yes";
        while (inputYesNo.equals("yes")) {
            guessNumber.start();
            guessNumber.play();
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            inputYesNo = sc.nextLine();
            while (!inputYesNo.equals("yes") && !inputYesNo.equals("no")) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
            }
        }
    }
}