public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("=== Задача 1 ===");
        int intVar = 100;
        byte byteVar = 10;
        short shortVar = 1000;
        long longVar = 100000L;
        float floatVar = 10.5f;
        double doubleVar = 20.75;

        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);
        System.out.println();

        // Задача 2
        System.out.println("=== Задача 2 ===");
        double value1 = 27.12;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        short value4 = 569;
        short value5 = -159;
        int value6 = 27897;
        byte value7 = 67;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
        System.out.println("value4 = " + value4);
        System.out.println("value5 = " + value5);
        System.out.println("value6 = " + value6);
        System.out.println("value7 = " + value7);
        System.out.println();

        // Задача 3
        System.out.println("=== Задача 3 ===");
        int studentsLyudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;
        int totalPaper = 480;

        int totalStudents = studentsLyudmila + studentsAnna + studentsEkaterina;
        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        System.out.println();

        // Задача 4
        System.out.println("=== Задача 4 ===");
        int bottlesIn2Minutes = 16;
        int bottlesPerMinute = bottlesIn2Minutes / 2;

        // За 20 минут
        int bottlesIn20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");

        // В сутки (24 часа = 1440 минут)
        int bottlesInDay = bottlesPerMinute * 1440;
        System.out.println("За 1 сутки машина произвела " + bottlesInDay + " штук бутылок");

        // За 3 дня
        int bottlesIn3Days = bottlesInDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");

        // За 1 месяц (30 дней)
        int bottlesInMonth = bottlesInDay * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");
        System.out.println();

        // Задача 5
        System.out.println("=== Задача 5 ===");
        int totalCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;

        // Находим количество классов: 2x + 4x = 120 => 6x = 120 => x = 20
        int numberOfClasses = totalCans / (whitePerClass + brownPerClass);
        int whiteCans = whitePerClass * numberOfClasses;
        int brownCans = brownPerClass * numberOfClasses;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно "
                + whiteCans + " банок белой краски и "
                + brownCans + " банок коричневой краски");
        System.out.println();

        // Задача 6
        System.out.println("=== Задача 6 ===");
        // Бананы: 5 штук по 80 грамм
        int bananasCount = 5;
        int bananaWeight = 80;
        int totalBananasWeight = bananasCount * bananaWeight;

        // Молоко: 200 мл (100 мл = 105 грамм)
        int milkMl = 200;
        int milkWeightPer100ml = 105;
        int totalMilkWeight = (milkMl * milkWeightPer100ml) / 100;

        // Мороженое: 2 брикета по 100 грамм
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;

        // Яйца: 4 штуки по 70 грамм
        int eggsCount = 4;
        int eggWeight = 70;
        int totalEggsWeight = eggsCount * eggWeight;

        // Общий вес в граммах
        int totalWeightGrams = totalBananasWeight + totalMilkWeight
                + totalIceCreamWeight + totalEggsWeight;

        // Перевод в килограммы
        double totalWeightKg = totalWeightGrams / 1000.0;

        System.out.println("Общий вес завтрака: " + totalWeightGrams + " грамм");
        System.out.println("Общий вес завтрака: " + totalWeightKg + " кг");

        // Дополнительный вывод с деталями расчетов:
        System.out.println("Детали расчета:");
        System.out.println("Бананы: " + bananasCount + " × " + bananaWeight + "г = "
                + totalBananasWeight + "г");
        System.out.println("Молоко: " + milkMl + "мл × " + milkWeightPer100ml
                + "г/100мл = " + totalMilkWeight + "г");
        System.out.println("Мороженое: " + iceCreamCount + " × " + iceCreamWeight
                + "г = " + totalIceCreamWeight + "г");
        System.out.println("Яйца: " + eggsCount + " × " + eggWeight + "г = "
                + totalEggsWeight + "г");
        System.out.println();

        // Задача 7
        System.out.println("=== Задача 7 ===");
        int weightToLoseKg = 7;
        int weightToLoseGrams = weightToLoseKg * 1000; // 7 кг = 7000 грамм

        int minLossPerDay = 250; // грамм в день
        int maxLossPerDay = 500; // грамм в день

        int daysMin = weightToLoseGrams / minLossPerDay;
        int daysMax = weightToLoseGrams / maxLossPerDay;

        // Среднее количество дней
        int averageLossPerDay = (minLossPerDay + maxLossPerDay) / 2;
        int daysAverage = weightToLoseGrams / averageLossPerDay;

        System.out.println("Если терять по 250 грамм в день, потребуется " + daysMin + " дней");
        System.out.println("Если терять по 500 грамм в день, потребуется " + daysMax + " дней");
        System.out.println("В среднем потребуется " + daysAverage + " дней");
        System.out.println();

        // Задача 8
        System.out.println("=== Задача 8 ===");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        // Повышение на 10%
        double raiseMultiplier = 1.10;

        // Новые зарплаты
        double mashaNewSalary = mashaSalary * raiseMultiplier;
        double denisNewSalary = denisSalary * raiseMultiplier;
        double kristinaNewSalary = kristinaSalary * raiseMultiplier;

        // Годовые доходы
        int mashaAnnualOld = mashaSalary * 12;
        int denisAnnualOld = denisSalary * 12;
        int kristinaAnnualOld = kristinaSalary * 12;

        double mashaAnnualNew = mashaNewSalary * 12;
        double denisAnnualNew = denisNewSalary * 12;
        double kristinaAnnualNew = kristinaNewSalary * 12;

        // Разница в годовом доходе
        double mashaAnnualDiff = mashaAnnualNew - mashaAnnualOld;
        double denisAnnualDiff = denisAnnualNew - denisAnnualOld;
        double kristinaAnnualDiff = kristinaAnnualNew - kristinaAnnualOld;

        System.out.println("Маша теперь получает " + (int)Math.round(mashaNewSalary)
                + " рублей. Годовой доход вырос на "
                + (int)Math.round(mashaAnnualDiff) + " рублей");

        System.out.println("Денис теперь получает " + (int)Math.round(denisNewSalary)
                + " рублей. Годовой доход вырос на "
                + (int)Math.round(denisAnnualDiff) + " рублей");

        System.out.println("Кристина теперь получает " + (int)Math.round(kristinaNewSalary)
                + " рублей. Годовой доход вырос на "
                + (int)Math.round(kristinaAnnualDiff) + " рублей");
    }
}