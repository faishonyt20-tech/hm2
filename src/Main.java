import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задача 1 ===");
        // Задача 1: Расчет статистики выплат авторам
        int[] inputArray1 = {12000, 8500, 15000, 9200, 11300};

        // Расчет статистики
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }

        double average = (double) sum / inputArray1.length;
        double[] outputArray1 = {sum, max, min, average};

        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));
        System.out.println("Формат: [сумма, максимум, минимум, среднее]");

        System.out.println("\n=== Задача 2 ===");
        // Задача 2: Расчет налога 13% для выплат
        int[] inputArray2 = {50000, 75000, 45000, 60000, 80000};
        double[] outputArray2 = new double[inputArray2.length];

        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;
        }

        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));
        System.out.println("Формат: [налог для каждой выплаты]");

        System.out.println("\n=== Задача 3 ===");
        // Задача 3: Поиск бонусов выше 5000 ₽
        int[] inputArray3 = {3500, 6200, 4800, 7500, 5500};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5000;
        }

        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));
        System.out.println("true - бонус выше 5000 ₽, false - бонус 5000 ₽ или ниже");

        System.out.println("\n=== Задача 4 ===");
        // Задача 4: Проверка на просрочки платежей
        int[] inputArray4 = {1500, -200, 300, 1200, 800}; // Один отрицательный баланс
        // int[] inputArray4 = {1500, 200, 300, 1200, 800}; // Все положительные балансы

        boolean outputArray4 = true; // Предполагаем, что просрочек нет

        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                break; // Прерываем проверку при первой просрочке
            }
        }

        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + outputArray4);
        System.out.println("true - просрочек нет, false - есть просрочки");

        System.out.println("\n=== Задача 5 ===");
        // Задача 5: Подсчет рентабельных месяцев
        int[] inputArray5 = {150000, -50000, 200000, -10000, 180000};
        int profitableMonths = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonths++;
            }
        }

        int[] outputArray5 = {profitableMonths};

        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));
        System.out.println("Количество рентабельных месяцев (прибыль > 0): " + profitableMonths);
    }
}