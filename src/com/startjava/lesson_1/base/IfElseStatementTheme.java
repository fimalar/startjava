package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        boolean genderMale = true;
        if (!genderMale) {
            System.out.println("Выбирает автомобиль по внешнему виду");
        } else {
            System.out.println("Выбирает автомобиль по техническим характеристикам");
        }

        int age = 20;
        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        double height = 1.6;
        if (height < 1.8) {
            System.out.println("Проходит для поступления в военное училище");
        } else {
            System.out.println("Не проходит для поступления в военное училище");
        }

        char firstLetterName = "Ivan".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Помещаем в каталог № 2");
        } else if (firstLetterName == 'I') {
            System.out.println("Помещаем в каталог № 1");
        } else {
            System.out.println("Помещаем в каталог № 3");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 2;
        int b = 137;

        if (a > b) {
            System.out.printf("Число %d больше числа %d%n", a, b);
        } else if (a < b) {
            System.out.printf("Число %d меньше числа %d%n", a, b);
        } else {
            System.out.printf("Число %d равно числу %d%n", a, b);
        }

        System.out.println("\n3. Проверка числа");
        a = -17;
        String evenOdd = "";
        String positiveNegative = "";

        if (a != 0) {
            if (a % 2 == 0) {
                evenOdd = "четным";
            } else {
                evenOdd = "нечетным";
            }
            if (a > 0) {
                positiveNegative = "положительным";
            } else {
                positiveNegative = "отрицательным";
            }
            System.out.printf("Число %d является %s и %s%n", a, positiveNegative, evenOdd);
        } else {
            System.out.println("Число равно 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        a = 144;
        b = 223;
        int onesA = a % 10;
        int onesB = b % 10;
        int tensA = a / 10 % 10;
        int tensB = b / 10 % 10;
        int hundredsA = a / 100;
        int hundredsB = b / 100;
        boolean sEqual = (hundredsA == hundredsB) || (tensA == tensB) || (onesA == onesB);
    
        if (!sEqual) {
            System.out.println("Равных цифр нет");
        } else {
            System.out.println(a + " и " + b);
            if (onesA == onesB) {
                System.out.println(onesA + " - 1, ");
            }            
            if  (tensA == tensB) {
                System.out.print (tensA + " - 2, ");
            }
            if (hundredsA == hundredsB) {
                System.out.print(hundredsA + " - 3\n");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol ='\u0031';
        String typeChar = "";

        if (symbol >= '0' && symbol <= '9') {
            typeChar = "цифрой";
        } else if (symbol >= 'A' && symbol <= 'Z') {
            typeChar = "большой буквой";
        } else if (symbol >= 'a' && symbol <= 'z') {
            typeChar = "маленькой буквой";
        } else {
            typeChar = "не буквой и не цифрой";
        }
        System.out.println("Символ " + symbol + " является " + typeChar);

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int amountDeposit = 301_000;
        int persent = 10;

        if (amountDeposit < 100_000) {
            persent = 5;
        } else if (amountDeposit <= 300_000) {
            persent = 7;
        }
        int amountPersent = amountDeposit * persent / 100;
        int amountAll = amountDeposit + amountPersent;
        System.out.printf("Сумма вклада - %d%nсумма начисленного %% - %d%nитоговая сумма - %d%n", 
                amountDeposit, amountPersent, amountAll);

        System.out.println("\n7. Определение оценки по предметам");
        int persentHistory = 59;
        int gradeHistory = 2;

        if (persent > 91) {
            gradeHistory = 5;
        } else if (persentHistory > 73) {
            gradeHistory = 4;
        } else if (persentHistory > 60) {
            gradeHistory = 3;
        }
        
        int persentProgramming = 92;
        int gradeProgramming = 5;

        if (persentProgramming <= 60) {
            gradeProgramming = 2;
        } else if (persentProgramming <= 73) {
            gradeProgramming = 3;
        } else if (persentProgramming <= 91) {
            gradeProgramming = 4;
        } 

        System.out.printf("История - %d, программирование - %d%n", gradeHistory, gradeProgramming);
        System.out.println("Средний балл оценок по предметам - " + (gradeHistory + gradeProgramming) / 2.);
        System.out.println("Средний % по предметам - " + (persentHistory + persentProgramming) / 2.);

        System.out.println("\n8. Расчет годовой прибыли");
        int productSalesMonth = 13000;
        int rentMonth = 5000;
        int costProduction = 9000;
        int profitYear = 12 * (productSalesMonth  - costProduction - rentMonth);

        if (profitYear > 0) {
            System.out.printf("Прибыль за год: %+d%n", profitYear);
        } else {
            System.out.printf("Прибыль за год: %d", profitYear);
        }
    }
}