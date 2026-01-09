public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("=== Задача 1: Установка приложения ===");
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
        System.out.println("=== Задача 2: Установка приложения с учетом года ===");
        int clientOS2 = 0; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2014;

        boolean isOldDevice = clientDeviceYear < 2015;

        if (clientOS2 == 0) {
            String message = isOldDevice ?
                    "Установите облегченную версию приложения для iOS по ссылке" :
                    "Установите версию приложения для iOS по ссылке";
            System.out.println(message);
        } else if (clientOS2 == 1) {
            String message = isOldDevice ?
                    "Установите облегченную версию приложения для Android по ссылке" :
                    "Установите версию приложения для Android по ссылке";
            System.out.println(message);
        } else {
            System.out.println("Неизвестная операционная система");
        }
        System.out.println();

        // Задача 3
        System.out.println("=== Задача 3: Високосный год ===");
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
        System.out.println("=== Задача 4: Доставка карт ===");
        int deliveryDistance = 95;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            int deliveryDays = 1; // Минимальный срок доставки

            // Используем логические условия вместо вложенных if
            boolean needsExtraDay1 = deliveryDistance > 20;
            boolean needsExtraDay2 = deliveryDistance > 60;

            if (needsExtraDay1) {
                deliveryDays++;
            }
            if (needsExtraDay2) {
                deliveryDays++;
            }

            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println();

        // Задача 5
        System.out.println("=== Задача 5: Определение сезона по месяцу ===");
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