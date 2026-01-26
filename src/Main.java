public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1 ===");
        // Задание 1:
        int firstFriday = 3; // Первая пятница 3-го числа
        System.out.println("Напоминания о сдаче отчетов:");
        for (int day = 1; day <= 31; day++) {
            if (day == firstFriday || (day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println("\n=== Задание 2 ===");
        // Задание 2:
        System.out.println("Вариант 1 (do-while):");
        int distanceDoWhile = 0;
        int messageCount1 = 0;

        do {
            int remainingDistance = 42195 - distanceDoWhile;
            if (remainingDistance > 0) {
                System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
                messageCount1++;
            }
            distanceDoWhile += 500;
        } while (distanceDoWhile <= 42195);

        System.out.println("Всего сообщений: " + messageCount1);

        // Задание 3:
        System.out.println("Вариант 1 (while):");
        int budgetWhile = 1000; // Бюджет в рублях
        int daysWhile = 0;
        int dayCounterWhile = 0;

        while (budgetWhile >= 100) {
            dayCounterWhile++;
            if (dayCounterWhile % 5 == 0) {
                System.out.println("День " + dayCounterWhile + ": Бесплатный день!");
                daysWhile++;
                continue;
            }

            budgetWhile -= 100;
            daysWhile++;
            System.out.println("День " + dayCounterWhile + ": Оплачено 100 ₽, осталось " + budgetWhile + " ₽");
        }

        System.out.println("На бюджет хватит на " + daysWhile + " дней");

        // Задание 4:
        int month = 0;
        double total = 0;
        double monthlyDeposit = 15000;
        double interestRate = 0.07; // 7%

        System.out.println("Расчет накоплений до 12,000,000 ₽:");

        while (true) { // Бесконечный цикл
            month++;
            total += monthlyDeposit;

            if (month % 6 == 0) {
                double interest = total * interestRate;
                total += interest;
                System.out.printf("Месяц %d: начислены проценты %.2f ₽, итого %.2f ₽%n",
                        month, interest, total);
            } else {
                System.out.printf("Месяц %d: итого %.2f ₽%n", month, total);
            }

            if (total >= 12000000) {
                System.out.println("\nЦель достигнута! Потребовалось месяцев: " + month);
                break;
            }
        }

        System.out.println("\n=== Задание 5 ===");
        // Задание 5:
        int charge = 20; // Начальный заряд
        int minute = 0;
        int overheats = 0;

        System.out.println("Начало зарядки: " + charge + "%");

        while (charge < 100 && overheats < 3) {
            minute++;

            if (minute % 10 == 0 && minute > 0) {
                overheats++;
                System.out.println("Минута " + minute + ": ПЕРЕГРЕВ! Перерыв 2 минуты");

                if (overheats < 3) {
                    minute += 2; // Пропускаем 2 минуты
                    continue;
                } else {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
            }

            charge += 2;
            if (charge > 100) charge = 100;

            System.out.println("Минута " + minute + ": Заряд +2%, сейчас " + charge + "%");

            if (charge >= 100) {
                System.out.println("Зарядка завершена успешно!");
                break;
            }
        }

        System.out.println("Время зарядки составило " + minute + " минут");
        System.out.println("Итоговый заряд: " + charge + "%");
        System.out.println("Количество перегревов: " + overheats);
    }
}