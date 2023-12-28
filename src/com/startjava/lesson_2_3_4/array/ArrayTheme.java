package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        reverseElements();

        System.out.println("\n2. Произведение элементов массива");
        multiplyElements();

        System.out.println("\n\n3. Удаление элементов массива");
        deleteElements();

        System.out.println("\n4. Вывод алфавита лесенкой");
        printAlphabetStairs();

        System.out.println("\n5. Заполнение массива уникальными числами");
        fillUniqueRandomNumbs();
    }

    private static void reverseElements() {
        int[] segmentNumbsToSeven = {7, 5, 1, 4, 6, 2, 3};
        int length = segmentNumbsToSeven.length;
        System.out.println("До реверса: " + Arrays.toString(segmentNumbsToSeven));
        for (int i = 0; i < length; i++) {
            length--;
            int temp = segmentNumbsToSeven[i];
            segmentNumbsToSeven[i] = segmentNumbsToSeven[length];
            segmentNumbsToSeven[length] = temp;
        }
        System.out.println("После реверса: " + Arrays.toString(segmentNumbsToSeven));
    }

    private static void multiplyElements() {
        int[] multipliers = new int[10];
        for (int i = 0; i < multipliers.length; i++) {
            multipliers[i] = i;
        }
        int multi = 1;
        for (int i = 1; i < multipliers.length - 1; i++) {
            multi *= i;
            System.out.print(multipliers[i]);
            System.out.print((i != multipliers.length - 2) ?  " * " : " = " + multi);
        }
    }

    private static void deleteElements() {
        double[] randomDoubles = new double[15];
        for (int i = 0; i < randomDoubles.length; i++) {
            randomDoubles[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArray(randomDoubles);
        double numbMiddleCell = randomDoubles[randomDoubles.length / 2];
        int countZeros = 0;
        for (int i = 0; i < randomDoubles.length; i++) {
            if (randomDoubles[i] > numbMiddleCell) {
                randomDoubles[i] = 0;
                countZeros++;
            }
        }
        System.out.println("\n\nИзмененный массив:");
        printArray(randomDoubles);
        System.out.println("\n\nКоличество обнуленных ячеек: " + countZeros);
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.printf("%6.3f", array[i]);
            System.out.print((i != array.length - 1) ? ", " : "");
            if (i == array.length / 2) {
                System.out.println();
            }
        }
    }

    private static void printAlphabetStairs() {
        char[] CapitalLetters = new char[26];
        for (int i = 0; i < CapitalLetters.length; i++) {
            CapitalLetters[i] = (char) (i + 'A');
        }
        for (int i = CapitalLetters.length - 1; i >= 0; i--) {
            for (int j = CapitalLetters.length - 1; j >= i; j--) {
                System.out.print(CapitalLetters[j]);
            }
            System.out.println();
        }
    }

    private static void fillUniqueRandomNumbs() {
        int[] uniqueRandomNumbs = new int[30];
        Random random = new Random();
        int numb;
        for (int i = 0; i < uniqueRandomNumbs.length; i++) {
            numb = random.nextInt(30, 60);
            for (int j = 0; j <= i; j++) {
                if (numb == uniqueRandomNumbs[j]) {
                    numb = random.nextInt(30, 60);
                    j = 0;
                }
            }
            uniqueRandomNumbs[i] = numb;
        }
        for (int i = 0; i < uniqueRandomNumbs.length; i++) {
            for (int j = 0; j < uniqueRandomNumbs.length - 1 - i; j++) {
                if (uniqueRandomNumbs[j] > uniqueRandomNumbs[j + 1]) {
                    int temp = uniqueRandomNumbs[j];
                    uniqueRandomNumbs[j] = uniqueRandomNumbs[j + 1];
                    uniqueRandomNumbs[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < uniqueRandomNumbs.length ; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(uniqueRandomNumbs[i]);
            System.out.print((i != uniqueRandomNumbs.length - 1) ? ", " : "");
        }
    }
}