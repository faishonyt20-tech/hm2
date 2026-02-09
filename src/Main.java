public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задача 1 ===");
        // Задача 1: Хранение Ф.И.О. сотрудника
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("\n=== Задача 2 ===");
        // Задача 2: Преобразование Ф.И.О. в верхний регистр
        String fullNameUpperCase = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);

        System.out.println("\n=== Задача 3 ===");
        // Задача 3: Замена символа «ё» на «е»
        String fullNameWithYo = "Иванов Семён Семёнович";
        String fullNameCorrected = fullNameWithYo.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameCorrected);
    }
}