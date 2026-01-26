public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("=== Задача 1:");
        int clientOS = 1; // 0 - iOS, 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
        System.out.println();

        // Задача 2
        System.out.println("=== Задача 2:");
        String osType2 = "iOS"; // Может быть "iOS" или "Android"
        int clientDeviceYear = 2015;
        String message;
        if (clientDeviceYear < 2015) {
            if (osType2.equals("iOS")) {
                message = "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                message = "Установите облегченную версию приложения для Android по ссылке";
            }
        } else {
            if (osType2.equals("iOS")) {
                message = "Установите приложение для iOS по ссылке";
            } else {
                message = "Установите приложение для Android по ссылке";
            }
        }
        System.out.println(message);

        // Задача 3
        System.out.println("=== Задача 3:");
        int year = 2024;
        boolean isLeapYear = false;
        if (year > 1584) {
            isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        // Задача 4
        System.out.println("=== Задача 4:");
        int deliveryDistance = 95;
        int deliveryTime;
        if (deliveryDistance > 100) {
            deliveryTime = 0; // Доставки нет
        } else if (deliveryDistance > 60) {
            deliveryTime = 3; // Базовые сутки + 2 дополнительных дня
        } else if (deliveryDistance > 20) {
            deliveryTime = 2; // Базовые сутки + 1 дополнительный день
        } else if (deliveryDistance >= 0) {
            deliveryTime = 1; // Базовые сутки
        } else {
            deliveryTime = 0; // Некорректное расстояние
        }
        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }

        // Задача 5
        System.out.println("=== Задача 5:");
        int monthNumber = 12;
        String season;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "неизвестный сезон (номер месяца должен быть от 1 до 12)";
                break;
        }
        System.out.println(monthNumber + "-й месяц принадлежит к сезону " + season);
    }
}