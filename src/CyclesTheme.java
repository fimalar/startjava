public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int a = -10;
        int b = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int i = a;
        do {
            if (i % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
            i++;
        } while (i <= b);
        System.out.printf("В отрезке [%1$d, %2$d] сумма четных чисел = %3$d, а нечетных = %4$d%n", a, b, 
                sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        a = 10;
        b = 5;
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
        for (i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        a = 1234;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            System.out.print(a % 10);
            a /= 10;
        }
        System.out.println("\nСумма цифр = " + sum);
    
        System.out.println("\n4. Вывод чисел в несколько строк");
        a = 1;
        b = 24;
        int count = 0;
        char d = 48;

        for (i = a; i < b; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d ", i);
                count++;
                if (count % 5 == 0) {
                    System.out.println("");
                }
            }
            if (i == (b - 1) && count % 5 != 0) {
                for (int j = 5 - (i % 5); j >= 0; j--) {
                    System.out.printf("%1$4c ", d);
                }
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int e = a = 3242592;
        int countTwo = 0;
        String evenOrOdd = "";

        while(a > 0) {
            if (a % 10 == 2) {
                countTwo++;
            }
            a /= 10;
        }

        if (countTwo % 2 == 0) {
            evenOrOdd = "(четное)";
        } else {
            evenOrOdd = "(нечетное)";
        }
        System.out.printf("В %d %s количество двоек - %s%n", e, evenOrOdd, countTwo);

        System.out.println("\n6. Отображение геометрических фигур\n");
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print('#');
                j--;
            }
            System.out.println("");
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
        System.out.println("");

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
        int num = 1234321;
        int reversedInt = 0;
        int remainder;
        int originalInt = num;
         
        for( ;num != 0; num /= 10 ) {
            remainder = num % 10; 
            reversedInt = reversedInt * 10 + remainder;
        }
        if (originalInt == reversedInt) {
            System.out.printf("число %d является палиндромом%n", originalInt);
        } else {
            System.out.printf("число %d не является палиндромом%n", originalInt);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int number = 234801;
        int sum1 = 0;
        int sum2 = 0;
        String st1 = "";
        String st2 = "";
        count = 0;

        while (number > 0) {
            int temp = number % 10;
            if (count < 3) {
                sum1 += temp;
                st1 += temp;
            } else {
                sum2 += temp;
                st2 += temp;
            }
            number /= 10;
        }
        if (sum1 == sum2) {
            System.out.printf("Число %s является счастливым%n", number);
        } else {
            System.out.printf("Число %s не является счастливым%n", number);
        }
        System.out.printf("Сумма цифр %s = %d, а сумма %s = %d%n", st1, sum2, st2, sum2);

        
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
        System.out.println("");
    }
}