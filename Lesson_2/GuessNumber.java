import java.lang.Math;

public class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private int pcNumber;
    private int playerNumber;
    Player first;
    Player second;

    GuessNumber(Player first, Player second) {
        this.first = first;
        this.second = second; 
    }

    public int getPcNumber() {
        return pcNumber;
    }

    public void setPlayerNumber(int number) {
        playerNumber = number;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int start(){
        return pcNumber = (int) (Math.random() * 100 + 1);
    }

    public void play(Player player) {
        result();
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
