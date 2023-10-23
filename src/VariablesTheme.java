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
        String currency = " руб.";
        int totalDiscount = 11;
        char chPercent = '%';
        int totalPrice = pricePen + priceBook;
        int sumTotalDiscaunt = totalPrice * 11 / 100;
        int totalPriceWithDiscount = totalPrice - sumTotalDiscaunt;

        System.out.println("Общая стоимость товаров без скидки - " + totalPrice + currency);
        System.out.println("Сумма скидки - " + sumTotalDiscaunt + currency);
        System.out.println("Общая стоимость товаров со скидкой - " + totalPriceWithDiscount + currency);

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
        int two = 2;
        int five = 5;
        
        System.out.println("С помощью третьей переменной:");
        System.out.println("  исходные значения переменных: two = " + two + " five = " + five);
        int temp = two;
        two = five;
        five = temp;
        System.out.println("  новые значения переменных: two = " + two + " five = " + five);

        System.out.println("С помощью арифметических операций:");
        System.out.println("  исходные значения переменных: two = " + two + " five = " + five);
        two = two + five;
        five = two - five;
        two = two - five;
        System.out.println("  новые значения переменных: two = " + two + " five = " + five);

        System.out.println("С помощью побитовой операции");
        System.out.println("  исходные значения переменных: two = " + two + " five = " + five);
        temp = two ^ five;
        two = temp ^ two;
        five = temp ^ five;
        System.out.println("  новые значения переменных: two = " + two + " five = " + five);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch36 = 36;
        char ch42 = 42;
        char ch64 = 64;
        char ch124 = 124;
        char ch126 = 126;

        System.out.println("  " + (int) ch36 + "\t" + ch36);
        System.out.println("  " + (int) ch42 + "\t" + ch42);
        System.out.println("  " + (int) ch64 + "\t" + ch64);
        System.out.println("  " + (int) ch124 + "\t" + ch124);
        System.out.println("  " + (int) ch126 + "\t" + ch126);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char ch1 = '/';
        char ch2 = '\\';
        char ch3 = '_';
        char ch4 = '(';
        char ch5 = ')';

        System.out.println("    " + ch1 + ch2 + "    ");
        System.out.println("   " + ch1 + "  " + ch2 + "   ");
        System.out.println("  " + ch1 + ch3 + ch4 + " " + ch5 + ch2 + "  ");
        System.out.println(" " + ch1 + "      " + ch2 + " ");
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", ch1, ch3, ch3, ch3, ch3, ch1, ch2, ch3, ch3, ch2);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int amountUnits = number % 10;
        int amountTens = number / 10 % 10;
        int amountHundreds = number / 100;
        int multiplication = amountUnits * amountTens * amountHundreds;
        int sum = amountUnits + amountTens + amountHundreds;

        System.out.println("Число " + number + " содержит: ");
        System.out.println("  сотен - " + amountHundreds + "\n  десятков - " + amountTens + 
                "\n  единиц - " + amountUnits);
        System.out.println("Сумма его цифр равна = " + sum);
        System.out.println("Произведение = " + multiplication);

        System.out.println("\n9. Вывод времени");
        int allSeconds = 86399;
        int numberSeconds = allSeconds % 60;
        int numberMinute = allSeconds / 60 % 60;
        int numberHour = allSeconds / 60 / 60;

        System.out.printf("%2d:%2d:%2d", numberHour, numberMinute, numberSeconds);
    }
}