public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задача 1 ===");
        // Задача 1: все целые числа от 1 до 10
        System.out.println("Числа от 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== Задача 2 ===");
        // Задача 2: все целые числа от 10 до 1
        System.out.println("Числа от 10 до 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== Задача 3 ===");
        // Задача 3: все четные числа от 0 до 17
        System.out.println("Четные числа от 0 до 17:");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== Задача 4 ===");
        // Задача 4: все числа от 10 до -10
        System.out.println("Числа от 10 до -10:");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== Задача 5 ===");
        // Задача 5: все високосные года с 1904 до 2096
        System.out.println("Високосные года с 1904 до 2096:");
        for (int year = 1904; year <= 2096; year++) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            }
        }

        System.out.println("\n=== Задача 6 ===");
        // Задача 6: последовательность чисел, кратных 7
        System.out.println("Числа, кратные 7 от 7 до 98:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== Задача 7 ===");
        // Задача 7: последовательность степеней двойки
        System.out.println("Степени двойки от 2^0 до 2^9:");
        int num = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();

        System.out.println("\n=== Задача 8 ===");
        // Задача 8: накопления без процентов
        System.out.println("Накопления без процентов:");
        int monthlySavings = 29000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        System.out.println("\n=== Задача 9 ===");
        // Задача 9: накопления с процентами
        System.out.println("Накопления с процентами (12% годовых):");
        double savingsWithInterest = 0;
        double monthlyInterestRate = 0.12 / 12; // месячная процентная ставка

        for (int month = 1; month <= 12; month++) {
            savingsWithInterest += monthlySavings; // добавляем месячные накопления
            savingsWithInterest *= (1 + monthlyInterestRate); // добавляем проценты
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n",
                    month, savingsWithInterest);
        }

        System.out.println("\n=== Задача 10 ===");
        // Задача 10: таблица умножения на 2
        System.out.println("Таблица умножения на 2:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}