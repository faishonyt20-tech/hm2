public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("=== Задача 1: Возраст совершеннолетия ===");
        int age = 20; // Можно изменить значение для тестирования

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        // Задача 2
        System.out.println("=== Задача 2: Носить ли шапку ===");
        int temperature = 3; // Можно изменить значение для тестирования

        if (temperature < 5) {
            System.out.println("На улице " + temperature +
                    " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature +
                    " градусов, можно идти без шапки");
        }
        System.out.println();

        // Задача 3
        System.out.println("=== Задача 3: Превышение скорости ===");
        int speed = 65; // Можно изменить значение для тестирования

        if (speed > 60) {
            System.out.println("Если скорость " + speed +
                    ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed +
                    ", то можно ездить спокойно");
        }
        System.out.println();

        // Задача 4
        System.out.println("=== Задача 4: Куда ходить по возрасту ===");
        int personAge = 15; // Можно изменить значение для тестирования

        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge +
                    ", то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge +
                    ", то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge +
                    ", то его место в университете");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge +
                    ", то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + personAge +
                    ", то он слишком мал для учреждений");
        }
        System.out.println();

        // Задача 5
        System.out.println("=== Задача 5: Аттракционы для детей ===");
        int childAge = 10; // Можно изменить значение для тестирования
        boolean hasAdult = true; // Есть ли взрослый сопровождающий

        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то ему нельзя кататься на аттракционе");
        } else if (childAge <= 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + childAge +
                        ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + childAge +
                        ", то ему нельзя кататься на аттракционе (нужен взрослый)");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();

        // Задача 6
        System.out.println("=== Задача 6: Места в вагоне ===");
        int passengers = 85; // Текущее количество пассажиров (можно изменить)
        int totalSeats = 102;
        int sittingSeats = 60;
        int standingSeats = totalSeats - sittingSeats; // 42 стоячих места

        if (passengers >= totalSeats) {
            System.out.println("Вагон полностью забит, свободных мест нет");
        } else if (passengers < sittingSeats) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("В вагоне остались только стоячие места");
        }
        System.out.println();

        // Задача 7
        System.out.println("=== Задача 7: Наибольшее из трех чисел ===");
        int one = 45;
        int two = 67;
        int three = 23;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}