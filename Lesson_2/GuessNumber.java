import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private int secretNumber;
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2; 
    }

    public void play() {
        generateSecretNumber();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Игрок " + player1.getName() + " введите число");
            player1.setNumber(sc.nextInt());
            sc.nextLine();
            if (isGuessed(player1)) {
                break;
            }
            swap(player1, player2);
        } while (true);
    }

    private int generateSecretNumber() {
        return secretNumber = (int) (Math.random() * 100 + 1);
    }

    private boolean isGuessed(Player player1) {
        if (player1.getNumber() == secretNumber) {
            System.out.println("Вы выиграли!");
            return true;
        }
        if (player1.getNumber() > secretNumber) {
            System.out.printf("Число %d больше числа, что загадал компьютер\n", player1.getNumber());
        } 
        if (player1.getNumber() < secretNumber) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", player1.getNumber());
        }
        return false;
    }

    private void swap(Player player1, Player player2) {
        Player temp = new Player("");
        temp.setName(player1.getName());
        player1.setName(player2.getName());
        player2.setName(temp.getName());
    }
}
