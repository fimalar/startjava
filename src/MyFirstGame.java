public class MyFirstGame {
    public static void main(String[] args) {
        int pcNumber = 90;
        int playerNumber = 7;
        int startRange = 1;
        int endRange = 100;

        while (playerNumber != pcNumber) {
            if (playerNumber > pcNumber) {
                System.out.printf("Число %d больше числа, что загадал компьютер\n", playerNumber);
                endRange = playerNumber;
                playerNumber = (startRange + endRange) / 2;
            } else if (playerNumber < pcNumber) {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNumber);
                startRange = playerNumber;
                playerNumber = (startRange + endRange) / 2;
            }
        }
        System.out.println("\"Вы победили!\"");
    }
}