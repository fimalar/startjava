public class MyFirstGame {
    public static void main(String[] args) {
        int numberPc = 90;
        int numberPlayer = 7;
        int startRange = 1;
        int endRange = 100;

        while (numberPlayer != numberPc) {
            if ( numberPlayer > numberPc) {
                System.out.printf("Число %d больше числа, что загадал компьютер\n", numberPlayer);
                endRange = numberPlayer;
                numberPlayer -= (endRange - startRange) / 2;
            } else if (numberPlayer < numberPc) {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", numberPlayer);
                startRange = numberPlayer;
                numberPlayer += (endRange - startRange) / 2;
            }
            if (numberPlayer == numberPc) {
                System.out.println("\"Вы победили!\"");
            }
        }
    }
}