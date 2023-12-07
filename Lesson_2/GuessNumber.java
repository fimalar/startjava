import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private int secretNumber;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
    }

    public void play() {
        generateSecretNumber();
        Scanner sc = new Scanner(System.in);
        do {
            inputNumber(sc);
            if (isGuessed(currentPlayer)) {
                break;
            }
            currentPlayer = swap();
        } while (true);
    }

    private int generateSecretNumber() {
        return secretNumber = (int) (Math.random() * 100 + 1);
    }

    public void inputNumber(Scanner sc) {
        System.out.println("Игрок " + currentPlayer.getName() + " введите число");
            currentPlayer.setNumber(sc.nextInt());
            // sc.nextLine();
    }

    private boolean isGuessed(Player currentPlayer) {
        if (currentPlayer.getNumber() == secretNumber) {
            System.out.println("Вы выиграли!");
            return true;
        }
        if (currentPlayer.getNumber() > secretNumber) {
            System.out.printf("Число %d больше числа, что загадал компьютер\n", currentPlayer.getNumber());
        } 
        else {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", currentPlayer.getNumber());
        }
        return false;
    }

    private Player swap() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
        return currentPlayer;
    }
}
