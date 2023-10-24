public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        int ram = 8192;
        byte capasityHdd = 1;
        short speedGpu = 650;
        long typeSystem = 64L;
        float speedCpu = 3.2f;
        double memoryVoltage = 1.90;
        char quantityCores = 56;
        boolean hasSdrom = false;

        System.out.println("Объем оперативной памяти: " + ram + " Мб");
        System.out.println("Частота графического процессора: " + speedGpu + " МГц");
        System.out.println("Размер жесткого диска: " + capasityHdd + " Гб");
        System.out.println("Разрядность системы: х" + typeSystem);
        System.out.println("Базовая скорость процессора: " + speedCpu + " ГГц");
        System.out.println("Напряжение памяти: " + memoryVoltage + "V");
        System.out.println("Количество ядер: " + quantityCores);
        System.out.println("Есть SD-ROM: " + hasSdrom);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int discountPercent = 11;
        int totalPrice = pricePen + priceBook;
        int discountSum = totalPrice * 11 / 100;
        int discountPrice = totalPrice - discountSum;

        System.out.println("Общая стоимость товаров без скидки - " + totalPrice + " руб.");
        System.out.println("Сумма скидки - " + discountSum + " руб.");
        System.out.println("Общая стоимость товаров со скидкой - " + discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        char maxChar = 65535;
        
        System.out.println("Максимальное число byte: " + maxByte);
        System.out.println("Максимальное число byte после инкремента: " + ++maxByte);
        System.out.println("Максимальное число byte после декремента: " + --maxByte);
        System.out.println("Максимальное число short: " + maxShort);
        System.out.println("Максимальное число short после инкремента: " + ++maxShort);
        System.out.println("Максимальное число short после декремента: " + --maxShort);
        System.out.println("Максимальное число int: " + maxInt);
        System.out.println("Максимальное число int после инкремента: " + ++maxInt);
        System.out.println("Максимальное число int после декремента: " + --maxInt);
        System.out.println("Максимальное число long: " + maxLong);
        System.out.println("Максимальное число long после инкремента: " + ++maxLong);
        System.out.println("Максимальное число long после декремента: " + --maxLong);
        System.out.println("Максимальное число char: " + (int) maxChar);
        System.out.println("Максимальное число char после инкремента: " + (int) ++maxChar);
        System.out.println("Максимальное число char после декремента: " + (int) --maxChar);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        
        System.out.println("С помощью третьей переменной:");
        System.out.println("  исходные значения переменных: a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("  новые значения переменных: a = " + a + " b = " + b);

        System.out.println("С помощью арифметических операций:");
        System.out.println("  исходные значения переменных: a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("  новые значения переменных: a = " + a + " b = " + b);

        System.out.println("С помощью побитовой операции");
        System.out.println("  исходные значения переменных: a = " + a + " b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("  новые значения переменных: a = " + a + " b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println("  " + (int) dollar + "\t" + dollar);
        System.out.println("  " + (int) asterisk + "\t" + asterisk);
        System.out.println("  " + (int) atSign + "\t" + atSign);
        System.out.println("  " + (int) verticalBar + "\t" + verticalBar);
        System.out.println("  " + (int) tilde + "\t" + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + underscore + underscore + underscore + underscore + slash + backslash + 
                underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int multiplication = ones * tens * hundreds;
        int sum = ones + tens + hundreds;

        System.out.println("Число " + number + " содержит: ");
        System.out.println("  сотен - " + hundreds + "\n  десятков - " + tens + "\n  единиц - " + ones);
        System.out.println("Сумма его цифр равна = " + sum);
        System.out.println("Произведение = " + multiplication);

        System.out.println("\n9. Вывод времени");
        int allSs = 86399;
        int ss = allSs % 60;
        int mm = allSs / 60 % 60;
        int hh = allSs / 60 / 60;

        System.out.printf("%2d:%2d:%2d", hh, mm, ss);
    }
}