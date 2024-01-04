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
        fillUniqueNumbs();
    }

    private static void reverseElements() {
        int[] sequenceNumbs = {7, 5, 1, 4, 6, 2, 3};
        int length = sequenceNumbs.length;
        System.out.println("До реверса: " + Arrays.toString(sequenceNumbs));
        for (int i = 0; i < length; i++) {
            int temp = sequenceNumbs[i];
            sequenceNumbs[i] = sequenceNumbs[--length];
            sequenceNumbs[length] = temp;
        }
        System.out.println("После реверса: " + Arrays.toString(sequenceNumbs));
    }

    private static void multiplyElements() {
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int productNumbs = 1;
        for (int i = 1; i < length - 1; i++) {
            productNumbs *= multipliers[i];
            System.out.print(multipliers[i]);
            System.out.print((i != length - 2) ? " * " : " = " + productNumbs);
        }
    }

    private static void deleteElements() {
        double[] randomDoubles = new double[15];
        int length = randomDoubles.length;
        for (int i = 0; i < length; i++) {
            randomDoubles[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArray(randomDoubles);
        double middleCellNumb = randomDoubles[length / 2];
        int countZeros = 0;
        for (int i = 0; i < length; i++) {
            if (randomDoubles[i] > middleCellNumb) {
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
        char[] capitalAlphabet = new char[26];
        int length = capitalAlphabet.length;
        for (int i = 0; i < length; i++) {
            capitalAlphabet[i] = (char) (i + 'A');
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(capitalAlphabet[j]);
            }
            System.out.println();
        }
    }

    private static void fillUniqueNumbs() {
        int[] uniqueNumbs = new int[30];
        int length = uniqueNumbs.length;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int numb = random.nextInt(60, 100);
            for (int j = 0; j <= i; j++) {
                if (numb == uniqueNumbs[j]) {
                    i--;
                    break;
                } else if (numb != uniqueNumbs[j] && j == i) {
                    uniqueNumbs[i] = numb;
                }
            }
        }
        sort(uniqueNumbs);
        for (int i = 0; i < length ; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(uniqueNumbs[i]);
            System.out.print((i != length - 1) ? ", " : "");
        }
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}