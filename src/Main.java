import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Задача 1 ===");
        // Тестирование метода проверки високосного года
        checkLeapYear(2024);
        checkLeapYear(2023);
        checkLeapYear(2000);
        checkLeapYear(1900);

        System.out.println("\n=== Задача 2 ===");
        // Тестирование метода предложения версии приложения
        int currentYear = LocalDate.now().getYear();
        suggestAppVersion(0, 2013); // iOS, старый телефон
        suggestAppVersion(1, 2013); // Android, старый телефон
        suggestAppVersion(0, currentYear); // iOS, новый телефон
        suggestAppVersion(1, currentYear); // Android, новый телефон
        suggestAppVersion(0, currentYear + 1); // iOS, телефон из будущего

        System.out.println("\n=== Задача 3 ===");
        // Тестирование метода расчета дней доставки
        System.out.println("Дистанция 10 км: " + calculateDeliveryDays(10) + " день(дней)");
        System.out.println("Дистанция 25 км: " + calculateDeliveryDays(25) + " день(дней)");
        System.out.println("Дистанция 70 км: " + calculateDeliveryDays(70) + " день(дней)");
        System.out.println("Дистанция 95 км: " + calculateDeliveryDays(95) + " день(дней)");
        System.out.println("Дистанция 120 км: " + calculateDeliveryDays(120) + " день(дней)");
    }

    // Задача 1: Метод проверки високосного года
    public static void checkLeapYear(int year) {
        boolean isLeapYear = false;

        if (year >= 1584) {
            isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }

        if (year < 1584) {
            System.out.println(year + " год — до введения григорианского календаря");
        } else if (isLeapYear) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2: Метод предложения версии приложения
    public static void suggestAppVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        // Проверяем корректность типа ОС
        if (osType != 0 && osType != 1) {
            System.out.println("Ошибка: тип ОС должен быть 0 (iOS) или 1 (Android)");
            return;
        }

        // Проверяем корректность года
        if (clientDeviceYear > currentYear) {
            System.out.println("Год выпуска устройства не может быть больше текущего года");
            return;
        }

        String osName = (osType == 0) ? "iOS" : "Android";
        String appVersion = (clientDeviceYear < 2015) ? "облегченную версию" : "приложение";

        System.out.println("Установите " + appVersion + " для " + osName + " по ссылке");
    }

    // Задача 3: Метод расчета дней доставки
    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;

        if (deliveryDistance <= 0) {
            System.out.print("Некорректная дистанция: ");
            return 0;
        } else if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.print("Доставки нет: ");
            return 0;
        }

        return deliveryDays;
    }
}