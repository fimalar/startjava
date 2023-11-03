public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int counter = startRange;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= endRange);
        System.out.printf("В отрезке [%1$d, %2$d] сумма четных чисел = %3$d, а нечетных = %4$d%n", 
                startRange, endRange, sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = c;

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
        int checkNumber = 1234;
        int sumDigits = 0;
        while (checkNumber > 0) {
            int remainder = checkNumber % 10;
            sumDigits += remainder;
            System.out.print(remainder);
            checkNumber /= 10;
        }
        System.out.println("\nСумма цифр = " + sumDigits);
    
        System.out.println("\n4. Вывод чисел в несколько строк");
        startRange = 1;
        endRange = 24;
        counter = 0;

        for (int i = startRange; i < endRange; i += 2) {
                System.out.printf("%4d ", i);
                counter++;
                if (counter % 5 == 0) {
                    System.out.println();
            }
            if (i == (endRange - 1) && counter % 5 != 0) {
                for (int j = 5 - (i % 5); j >= 0; j--) {
                    System.out.printf("%1$4d ", 0);
                }
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        checkNumber = 3242592;
        int countTwos = 0;
        int copyCheckNumber = checkNumber;

        while(copyCheckNumber > 0) {
            if (copyCheckNumber % 10 == 2) {
                countTwos++;
            }
            copyCheckNumber /= 10;
        }

        String evenOrOdd = "";
        if (countTwos % 2 == 0) {
            evenOrOdd = "(четное)";
        } else {
            evenOrOdd = "(нечетное)";
        }
        System.out.printf("В %d %s количество двоек - %s%n", checkNumber, evenOrOdd, countTwos);

        System.out.println("\n6. Отображение геометрических фигур\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int row = 5;
        while (row > 0) {
            int column = row;
            while (column > 0) {
                System.out.print('#');
                column--;
            }
            System.out.println();
            row--;
        }

        int attempt = 3;
        int columnReduction = 0;
        row = 1;
        do {
            System.out.print("\n");
            int column = 1;
            do {
                System.out.print("$");
                column++;
            } while (column <= row - columnReduction);
            
            if (row >= attempt) {
                columnReduction += 2;
            }
            row++;
        } while (row < attempt * 2);
        System.out.println();

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%8s %10s %13s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        System.out.println("-------------------------------------------------");
        for (int i = 15; i < 48; i++) {
            if (i % 2 == 1) {
                System.out.printf("%5d %9c %10s %-13s%n", i, (char) i, " ", Character.getName(i));
            }
        }

        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%5d %9c %10s %-13s%n", i, (char) i, " ", Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int palindrome = 1234321;
        int reversed = 0;
        int originalNumber = palindrome;
        
        while (palindrome > 0) {
            int remainder = palindrome % 10;
            reversed = reversed * 10 + remainder;
            palindrome /= 10;
        }
        if (originalNumber == reversed) {
            System.out.printf("число %d является палиндромом%n", originalNumber);
        } else {
            System.out.printf("число %d не является палиндромом%n", originalNumber);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int happyNumber = 234801;
        int copyHappyNumber = happyNumber;
        int sum1 = 0;
        int sum2 = 0;
        counter = 0;
        
        while (happyNumber > 0) {
            int remainder = happyNumber % 10;
            if (counter < 3) {
                sum1 += remainder;
            } else {
                sum2 += remainder;
            }
            happyNumber /= 10;
            counter++;
        }
        if (sum1 == sum2) {
            System.out.printf("Число %s является счастливым%n", copyHappyNumber);
        } else {
            System.out.printf("Число %s не является счастливым%n", copyHappyNumber);
        }
        System.out.printf("Сумма цифр %d = %d, а сумма %d = %d%n", 
                copyHappyNumber / 1000, sum1, copyHappyNumber % 1000, sum2);

        
        System.out.println("\n10. Отображение таблицы умножения Пифагора\n");
        System.out.print("   |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n---|---------------------------------");
        for (int i = 2; i < 10; i++) {
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