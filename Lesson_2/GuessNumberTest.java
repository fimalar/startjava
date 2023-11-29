import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player first = new Player(sc.nextLine());
        System.out.println("Введите имя второго игрока");
        Player second = new Player(sc.nextLine());
        GuessNumber guessNumber = new GuessNumber(first, second);
        String inputYesNo = "yes";
        while (inputYesNo.equals("yes")) {
            guessNumber.start();
             do {
                System.out.println("Игрок " + guessNumber.first.getName() + " введите число");
                guessNumber.setPlayerNumber(sc.nextInt());
                sc.nextLine();
                guessNumber.play(first);
                if (guessNumber.getPlayerNumber() == guessNumber.getPcNumber()) {
                    break;
                }
                System.out.println("Игрок " + guessNumber.second.getName() + " введите число");
                guessNumber.setPlayerNumber(sc.nextInt());
                sc.nextLine();
                guessNumber.play(second);
                if (guessNumber.getPlayerNumber() == guessNumber.getPcNumber()) {
                    guessNumber.first = second;
                    guessNumber.second = first;
                }
            } while (guessNumber.getPlayerNumber() != guessNumber.getPcNumber());
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            inputYesNo = sc.nextLine();
            while (!inputYesNo.equals("yes") && !inputYesNo.equals("no")) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
            }
        }
    }
}