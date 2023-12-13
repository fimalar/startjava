package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(sc.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String inputYesNo = "";
        do {
            guessNumber.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                inputYesNo = sc.nextLine();
            } while (!inputYesNo.equals("yes") && !inputYesNo.equals("no"));
        } while (inputYesNo.equals("yes"));
    }
}