public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        boolean genderM = true;

        if (!genderM) {
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
        int number1 = 2;
        int number2 = 137;

        if (number1 > number2) {
            System.out.printf("Число %d больше числа %d%n", number1, number2);
        } else if (number1 < number2) {
            System.out.printf("Число %d меньше числа %d%n", number1, number2);
        } else {
            System.out.printf("Число %d равно числу %d%n", number1, number2);
        }

        System.out.println("\n3. Проверка числа");
        number1 = -17;
        String s = "";
        String s1 = "";

        if (number1 != 0) {
            if (number1 % 2 == 0) {
                s = "четным";
            } else {
                s = "нечетным";
            }
            if (number1 > 0) {
                s1 = "положительным";
            } else {
                s1 = "отрицательным";
            }
            System.out.printf("Число %d является %s и %s%n", number1, s1, s);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        number1 = 144;
        number2 = 223;
        String hundredsNumber = "";
        String tensNumber = "";
        String unitsNumber = "";

        if (number1 / 100 == number2 / 100 || number1 / 10 % 10 == number2 / 10 % 10 || number1 % 10 == number2 % 10) {
            System.out.println(number1 + " и " + number2);
            if (number1 / 100 == number2 / 100) {
                System.out.print(number1 / 100 + " ");
                hundredsNumber = "1 ";
            }
            if (number1 / 10 % 10 == number2 / 10 % 10) {
                System.out.print(number1 / 10 % 10 + " ");
                tensNumber = "2 ";
            }
            if (number1 % 10 == number2 % 10) {
                System.out.println(number1 % 10);
                unitsNumber = "3 ";
            }
            System.out.println(hundredsNumber + tensNumber + unitsNumber);
        } else {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol ='\u0031';
        String typeChar = "";

        if (symbol > '/' && symbol < ':') {
            typeChar = "цифрой";
        }
        else if (symbol > '@' && symbol < '[') {
            typeChar = "большой буквой";
        } else if (symbol > '`' && symbol < '{') {
            typeChar = "маленькой буквой";
        } else {
            typeChar = "не буквой и не цифрой";
        }
        System.out.println("Символ " + symbol + " является " + typeChar);

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int amountDeposit = 301_000;
        int amountPersent = 0;

        if (amountDeposit < 100_000) {
            amountPersent = amountDeposit * 5 / 100;
        } else if (amountDeposit <= 300_000) {
            amountPersent = amountDeposit * 7 / 100;
        } else if (amountDeposit > 300_000) {
            amountPersent = amountDeposit * 10 / 100;
        }
        int amountAll = amountDeposit + amountPersent;
        System.out.printf("Сумма вклада - %d%nсумма начисленного %% - %d%nитоговая сумма - %d%n", 
                amountDeposit, amountPersent, amountAll);

        System.out.println("\n7. Определение оценки по предметам");
        int persentHistory = 59;
        int persentProgramming = 92;
        int gradeHistory = 0;
        int gradeProgramming = 0;

        if (persentHistory <= 60) {
            gradeHistory = 2;
        } else if (persentHistory <= 73) {
            gradeHistory = 3;
        } else if (persentHistory <= 91) {
            gradeHistory = 4;
        } else {
            gradeHistory = 5;
        }

        if (persentProgramming <= 60) {
            gradeProgramming = 2;
        } else if (persentProgramming <= 73) {
            gradeProgramming = 3;
        } else if (persentProgramming <= 91) {
            gradeProgramming = 4;
        } else {
            gradeProgramming = 5;
        }

        System.out.printf("История - %d, программирование - %d%n", gradeHistory, gradeProgramming);
        System.out.println("Средний балл оценок по предметам - " + (gradeHistory + gradeProgramming) / 2.);
        System.out.println("Средний % по предметам - " + (persentHistory + persentProgramming) / 2.);


        System.out.println("\n8. Расчет годовой прибыли");
        int productSalesMonth = 13000;
        int rentMonth = 5000;
        int costProduction = 9000;
        int profitYear = productSalesMonth * 12 - costProduction * 12;

        if (profitYear < 0 ) {
            System.out.printf("Прибыль за год: %d" + profitYear);
        } else if (profitYear > 0) {
            System.out.printf("Прибыль за год: %+d%n", profitYear);
        }
    }
}