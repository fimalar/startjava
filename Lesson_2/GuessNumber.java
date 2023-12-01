import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private int secretNum;
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2; 
    }

    public void play() {
        generateSecretNum();
        Scanner sc = new Scanner(System.in);
        boolean isSecretNum = false;
        do {
            System.out.println("Игрок " + player1.getName() + " введите число");
            player1.setNumber(sc.nextInt());
            sc.nextLine();
            isSecretNum = isSecretNum();
            if (isSecretNum) {
                break;
            }
            String name = player1.getName();
            player1 = new Player(player2.getName());
            player2 = new Player(name);
        } while (!isSecretNum);
    }

    private int generateSecretNum() {
        return secretNum = (int) (Math.random() * 100 + 1);
    }

    private boolean isSecretNum() {
        if (player1.getNumber() > secretNum) {
            System.out.printf("Число %d больше числа, что загадал компьютер\n", player1.getNumber());
            return false;
        } else if (player1.getNumber() < secretNum) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", player1.getNumber());
            return false;
        } else if (player1.getNumber() == secretNum) {
            System.out.println("Вы выиграли!");
            return true;
        }
        return false;
    }
}
