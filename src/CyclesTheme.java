public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int borderLow = -10;
        int borderUp = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int counter = borderLow;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= borderUp);
        System.out.printf("В отрезке [%1$d, %2$d] сумма четных чисел = %3$d, а нечетных = %4$d%n", borderLow, 
            borderUp, sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = a;
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        a = 1234;
        int sum = 0;
        while (a > 0) {
            int numberOnes = a % 10;
            sum += numberOnes;
            System.out.print(numberOnes);
            a /= 10;
        }
        System.out.println("\nСумма цифр = " + sum);
    
        System.out.println("\n4. Вывод чисел в несколько строк");
        borderLow = 1;
        borderUp = 24;
        counter = 0;

        for (int i = borderLow; i < borderUp; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d ", i);
                counter++;
                if (counter % 5 == 0) {
                    System.out.println();
                }
            }
            if (i == (borderUp - 1) && counter % 5 != 0) {
                for (int j = 5 - (i % 5); j >= 0; j--) {
                    System.out.printf("%1$4c ", '0');
                }
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int number = 3242592;
        int countTwos = 0;
        String evenOrOdd = "";
        int numberCopy = 3242592;

        while(numberCopy > 0) {
            if (numberCopy % 10 == 2) {
                countTwos++;
            }
            numberCopy /= 10;
        }

        if (countTwos % 2 == 0) {
            evenOrOdd = "(четное)";
        } else {
            evenOrOdd = "(нечетное)";
        }
        System.out.printf("В %d %s количество двоек - %s%n", number, evenOrOdd, countTwos);

        System.out.println("\n6. Отображение геометрических фигур\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print('#');
                j--;
            }
            System.out.println();
            i--;
        }

        a = 3;
        b = 0;
        i = 1;
        do {
            System.out.print("\n");
            int j = 1;
            do {
                System.out.print("$");
                j++;
            } while (j <= i - b);
            
            if (i >= a) {
                b += 2;
            }
            i++;
        } while (i < a * 2);
        System.out.println();

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%8s %10s %13s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        System.out.println("-------------------------------------------------");
        for (i = 15; i < 48; i++) {
            if (i % 2 == 1) {
                System.out.printf("%5d %9c %5s %-13s%n", i, (char)i, " ", Character.getName(i));
            }
        }

        for (i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%5d %9c %5s %-13s%n", i, (char)i, " ", Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        int reversedInt = 0;
        int remainder;
        int originalInt = number;
         
        for( ;number != 0; number /= 10 ) {
            remainder = number % 10; 
            reversedInt = reversedInt * 10 + remainder;
        }
        if (originalInt == reversedInt) {
            System.out.printf("число %d является палиндромом%n", originalInt);
        } else {
            System.out.printf("число %d не является палиндромом%n", originalInt);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int sum1 = 0;
        int sum2 = 0;
        String st1 = "";
        String st2 = "";
        counter = 0;
        number = 234801;
        numberCopy = 234801;

        while (number > 0) {
            int temp = number % 10;
            if (counter < 3) {
                sum1 += temp;
                st1 += temp;
            } else {
                sum2 += temp;
                st2 += temp;
            }
            number /= 10;
            counter++;
        }
        if (sum1 == sum2) {
            System.out.printf("Число %s является счастливым%n", numberCopy);
        } else {
            System.out.printf("Число %s не является счастливым%n", numberCopy);
        }
        System.out.printf("Сумма цифр %s = %d, а сумма %s = %d%n", st1, sum1, st2, sum2);

        
        System.out.println("\n10. Отображение таблицы умножения Пифагора\n");
        st1 = " ";
        System.out.printf("%3s|", st1);
        for (i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n---|---------------------------------");
        for (i = 2; i < 10;  i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            if (i != 9) {
                System.out.println("\n   |");
            }
        }
        System.out.println();
    }
}