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

        if (clientOS2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS2 == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Неизвестная операционная система");
        }
        System.out.println();

        // Задача 3
        System.out.println("=== Задача 3: Високосный год ===");
        int year = 2024;

        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1584");
        }
        System.out.println();

        // Задача 4
        System.out.println("=== Задача 4: Доставка карт ===");
        int deliveryDistance = 95;
        int deliveryDays = 1; // Минимальный срок доставки

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance > 20) {
                deliveryDays++; // +1 день за интервал 20-60 км
            }
            if (deliveryDistance > 60) {
                deliveryDays++; // +1 день за интервал 60-100 км
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println();

        // Задача 5
        System.out.println("=== Задача 5: Определение сезона по месяцу ===");
        int monthNumber = 12;

        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
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
                    season = "неизвестный сезон";
                    break;
            }
            System.out.println(monthNumber + "-й месяц принадлежит к сезону " + season);
        } else {
            System.out.println("Номер месяца должен быть от 1 до 12");
        }
        System.out.println();
    }
}

