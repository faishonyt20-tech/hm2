import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задача 1 ===");
        // Задача 1: Создание массивов
        // 1. Целочисленный массив с помощью ключевого слова new
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        // 2. Массив дробных чисел, сразу заполненный значениями
        double[] doubleArray = {1.57, 7.654, 9.986};

        // 3. Произвольный массив
        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};

        System.out.println("Массивы созданы:");
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("doubleArray: " + Arrays.toString(doubleArray));
        System.out.println("stringArray: " + Arrays.toString(stringArray));

        System.out.println("\n=== Задача 2 ===");
        // Задача 2: Вывод элементов по порядку
        System.out.println("Элементы intArray по порядку:");
        for (int i = 0; i < intArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(intArray[i]);
        }
        System.out.println();

        System.out.println("Элементы doubleArray по порядку:");
        for (int i = 0; i < doubleArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(doubleArray[i]);
        }
        System.out.println();

        System.out.println("Элементы stringArray по порядку:");
        for (int i = 0; i < stringArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(stringArray[i]);
        }
        System.out.println();

        System.out.println("\n=== Задача 3 ===");
        // Задача 3: Вывод элементов в обратном порядке
        System.out.println("Элементы intArray в обратном порядке:");
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(intArray[i]);
        }
        System.out.println();

        System.out.println("Элементы doubleArray в обратном порядке:");
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(doubleArray[i]);
        }
        System.out.println();

        System.out.println("Элементы stringArray в обратном порядке:");
        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (i < stringArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(stringArray[i]);
        }
        System.out.println();

        System.out.println("\n=== Задача 4 ===");
        // Задача 4: Преобразование нечетных чисел в четные
        System.out.println("Исходный массив: " + Arrays.toString(intArray));

        // Проходим по массиву и делаем все нечетные числа четными
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) { // Если число нечетное
                intArray[i] += 1; // Делаем четным
            }
        }

        System.out.println("Преобразованный массив: " + Arrays.toString(intArray));
    }
}