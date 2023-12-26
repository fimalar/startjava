package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        reverse();

        System.out.println("\n2. Произведение элементов массива");
        multi();

        System.out.println("\n3. Удаление элементов массива");
        deleteElements();

        System.out.println("\n4. Вывод алфавита лесенкой");
        printAlphabetStairs();

        System.out.println("\n5. Заполнение массива уникальными числами");
        uniqNumbsInt();
    }

    private static void reverse() {
        int[] numbsInt = {7, 5, 1, 4, 6, 2, 3};
        int length = numbsInt.length;
        System.out.println("До реверса: " + Arrays.toString(numbsInt));
        for (int i = 0; i < length / 2; i++) {
            int temp = numbsInt[i];
            numbsInt[i] = numbsInt[length - 1 - i];
            numbsInt[length - 1 - i] = temp;
        }
        System.out.println("После реверса: " + Arrays.toString(numbsInt));
    }

    private static void multi() {
        int[] numbsInt = new int[10];
        for (int i = 0; i < numbsInt.length; i++) {
            numbsInt[i] = i;
        }
        int multi = 1;
        for (int i = 1; i < 9; i++) {
            multi *= i;
        }
        String s = "";
        for (int i = 1; i < 9 ; i++) {
            s += numbsInt[i];
            if (i == 8) {
                break;
            }
            s += " * ";
        }
        System.out.println(s + " = " + multi);
    }

    private static void deleteElements() {
        double[] numbsDouble = new double[15];
        for (int i = 0; i < numbsDouble.length; i++) {
            numbsDouble[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        System.out.println("[" + printArray(numbsDouble, 0, 8) + "]");
        System.out.println("[" + printArray(numbsDouble, 8, 15) + "]");
        double numbMiddleCell = numbsDouble[numbsDouble.length / 2];
        int countZero = 0;
        for (int i = 0; i < numbsDouble.length; i++) {
            if (numbsDouble[i] > numbMiddleCell) {
                numbsDouble[i] = 0;
                countZero++;
            }
        }
        System.out.println("\nИзмененный массив:");
        System.out.println("[" + printArray(numbsDouble, 0, 8) + "]");
        System.out.println("[" + printArray(numbsDouble, 8, 15) + "]");
        System.out.println("\nКоличество обнуленных ячеек: " + countZero);
    }

    private static String printArray(double[] array, int indexFrom, int intdexTo) {
        String s = "";
        for (int i = indexFrom; i < intdexTo ; i++) {
            s += String.format("%6.3f", array[i]);
            if (i == intdexTo - 1) {
                break;
            }
            s += ", ";
        }
        return s;
    }

    private static void printAlphabetStairs() {
        char[] CapitalLetters = new char[26];
        for (int i = 0; i < CapitalLetters.length; i++) {
            CapitalLetters[i] = (char) (i + 'A');
        }
        for (int i = CapitalLetters.length -1; i >= 0; i--) {
            for (int j = CapitalLetters.length -1; j >= i; j--) {
                System.out.print(CapitalLetters[j]);
            }
            System.out.println();
        }
    }

    private static void uniqNumbsInt() {
        int[] uniqNumbsInt = new int[30];
        Random random = new Random();
        int numb;
        for (int i = 0; i < uniqNumbsInt.length; i++) {
            numb = random.nextInt(30, 60);
            for (int j = 0; j <= i; j++) {
                if (numb == uniqNumbsInt[j]) {
                    numb = random.nextInt(30, 60);
                    j = 0;
                }
            }
            uniqNumbsInt[i] = numb;
        }
        for (int i = 0; i < uniqNumbsInt.length; i++) {
            for (int j = 0; j < uniqNumbsInt.length - 1 - i; j++) {
                if (uniqNumbsInt[j] > uniqNumbsInt[j+1]) {
                    int temp = uniqNumbsInt[j];
                    uniqNumbsInt[j] = uniqNumbsInt[j + 1];
                    uniqNumbsInt[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < uniqNumbsInt.length ; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(uniqNumbsInt[i]);
            if (i == uniqNumbsInt.length -1) {
                break;
            }
            System.out.print(", ");
        }
    }
}
