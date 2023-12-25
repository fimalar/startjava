package com.startjava.lesson_2_3.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        // заполнение массива числами вразнобой в отрезке [1, 7]
        int[] numbs1 = {7, 5, 1, 4, 6, 2, 3};
        int len = numbs1.length;
        // вывод значений массива до реверса
        System.out.println("До реверса: " + Arrays.toString(numbs1));
        // перестановка значения в исходном массиве в обратном порядке
        reverse(numbs1);
        // вывод значений массива после реверса
        System.out.println("После реверса: " + Arrays.toString(numbs1));

        System.out.println("\n2. Произведение элементов массива");
        int[] numbs2 = new int[10];
        initializationArray(numbs2);
        // подсчет произведения
        int multi = multi(numbs2, 1, 9);
        // отобразить произведение
        System.out.println(printArray(numbs2, 1, 9) + " = " + multi);

        System.out.println("\n3. Удаление элементов массива");
        double[] numbs3 = new double[15];
        // заполнение массива 15 случайными вещественными числами в полуинтервале [0, 1)
        initializationArray(numbs3);
        // отображение исходного массива по 8 и 7 чисел в строке, после запятой только три знак
        System.out.println("Исходный массив:");
        System.out.println("[" + printArray(numbs3, 0, 8) + "]");
        System.out.println("[" + printArray(numbs3, 8, 15) + "]");
        // вычисление индекса средней ячейки массива
        int indexMiddleCell = indexMiddleCell(numbs3);
        double numbMiddleCell = numbs3[indexMiddleCell];
        // перезапись в массиве нулями чисел, которые больше значения числа средней ячейки массива
        rewrite(numbs3, numbMiddleCell);
        // отображение измененного массива по 8 и 7 чисел в строке, после запятой только три знака
        System.out.println("\nИзмененный массив:");
        System.out.println("[" + printArray(numbs3, 0, indexMiddleCell + 1) + "]");
        System.out.println("[" + printArray(numbs3, indexMiddleCell + 1, 15) + "]");
        // количество обнуленных ячеек
        System.out.println("\nКоличество обнуленных ячеек: " + countZero(numbs3));

        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] arrayCapitalLetters = new char[26];
        // инициализируйте массив в цикле большими анг. буквами по возрастанию
        initializationArray(arrayCapitalLetters);
        // отображение его содержимого лесенкой в обратном порядке
        printArrayStairs(arrayCapitalLetters);

        System.out.println("\n5/ Заполнение массива уникальными числами");
        int[] numbs4 = new int[30];
        // заполнение массива 30-ю случайными целыми числами в полуинтервале [60, 100)
        // значения не должны повторяться, если число уже есть в массиве, сгенерите новое
        // делайте это до тех пор, пока не сгенерится число, которого еще нет в массиве
        initializationArray(numbs4, 30);
        // отображение содержимого массива по 10 чисел в строке, отсортированного по возрастанию
        sortArray(numbs4);
        printArray(numbs4, 10);
    }

    private static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    private static int[] initializationArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int multi(int[] array, int indexFrom, int indexTo) {
        int multi = 1;
        for (int i = indexFrom; i < indexTo; i++) {
            multi *= i;
        }
        return multi;
    }

    private static String printArray(int[] array, int indexFrom, int intdexTo) {
        String s = "";
        for (int i = indexFrom; i < intdexTo ; i++) {
            s += array[i];
            if (i == intdexTo -1) {
                break;
            }
            s += " * ";
        }
        return s;
    }

    private static double[] initializationArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    private static int indexMiddleCell(double[] array) {
        int indexMiddleCell = 0;
        if (array.length % 2 != 0) {
            indexMiddleCell = array.length / 2;
        }
        return indexMiddleCell;
    }

    private static void rewrite(double[] array, double numbMiddleCell) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numbMiddleCell) {
                array[i] = 0;
            }
        }
    }

    private static String printArray(double[] array, int indexFrom, int intdexTo) {
        String s = "";
        for (int i = indexFrom; i < intdexTo ; i++) {
            s += String.format("%6.3f", array[i]);
            if (i == intdexTo -1) {
                break;
            }
            s += ", ";
        }
        return s;
    }

    private static int countZero(double[] array) {
        int count = 0;
        for (double d : array ) {
            if (d == 0) {
                count++;
            }
        }
        return count;
    }

    private static char[] initializationArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (i + 'A');
        }
        return array;
    }

    private static void printArrayStairs(char[] array) {
        for (int i = array.length -1; i >= 0; i--) {
            for (int j = array.length -1; j >= i; j--) {
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }

    private static int[] initializationArray(int[] array, int length) {
        Random random = new Random();
        int numb;
        for (int i = 0; i < array.length; i++) {
            numb = random.nextInt(30, 60);
            for (int j = 0; j <= i; j++) {
                if (numb == array[j]) {
                    numb = random.nextInt(30, 60);
                    j = 0;
                }
            }
            array[i] = numb;
        }
        return array;
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] array, int countNumbRow) {
        for (int i = 0; i < array.length ; i++) {
            if (i % countNumbRow == 0) {
                System.out.println();
            }
            System.out.print(array[i]);
            if (i == array.length -1) {
                break;
            }
            System.out.print(", ");
        }
    }
}
