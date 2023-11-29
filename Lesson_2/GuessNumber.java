import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private int pcNumber;
    private int playerNumber;
    Player firstPlayer;
    Player secondPlayer;

    GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer; 
    }

    public int start(){
        return pcNumber = (int) (Math.random() * 100 + 1);
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Игрок " + firstPlayer.getName() + " введите число");
            firstPlayer.setNumber(sc.nextInt());
            sc.nextLine();
            playerNumber = firstPlayer.getNumber();
            result();
            if (playerNumber == pcNumber) {
                break;
            }
            System.out.println("Игрок " + secondPlayer.getName() + " введите число");
            secondPlayer.setNumber(sc.nextInt());
            sc.nextLine();
            playerNumber = secondPlayer.getNumber();
            result();
            if (playerNumber == pcNumber) {
                String name = firstPlayer.getName();
                firstPlayer = new Player(secondPlayer.getName());
                secondPlayer = new Player(name);
            }
        } while (playerNumber != pcNumber);
    }

    public void result() {
        if (playerNumber > pcNumber) {
            System.out.printf("Число %d больше числа, что загадал компьютер\n", playerNumber);
        } else if (playerNumber < pcNumber) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNumber);
        } else if (playerNumber == pcNumber) {
            System.out.println("Вы выиграли!");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
