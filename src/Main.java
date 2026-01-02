public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        // Задача 2
        System.out.println("Задача 2:");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper);
        System.out.println();

        // Задача 3
        System.out.println("Задача 3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog - 3.5 = " + dog);
        System.out.println("cat - 1.6 = " + cat);
        System.out.println("paper - 7639 = " + paper);
        System.out.println();

        // Задача 4
        System.out.println("Задача 4:");
        var friend = 19;
        System.out.println("friend = " + friend);

        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);

        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);
        System.out.println();

        // Задача 5
        System.out.println("Задача 5:");
        var frog = 3.5;
        System.out.println("frog = " + frog);

        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);

        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);

        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);
        System.out.println();

        // Задача 6
        System.out.println("Задача 6:");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;

        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общая масса бойцов: " + totalWeight + " кг");

        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница масс бойцов: " + weightDifference + " кг");
        System.out.println();

        // Задача 7
        System.out.println("Задача 7:");
        var remainder = boxer2Weight % boxer1Weight;
        System.out.println("Остаток от деления весов: " + remainder);
        System.out.println();

        // Задача 8
        System.out.println("Задача 8:");
        var totalHours = 640;
        var hoursPerEmployee = 8;

        var numberOfEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");

        var additionalEmployees = 94;
        var totalEmployees = numberOfEmployees + additionalEmployees;
        var newTotalHours = totalEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + totalEmployees +
                " человек, то всего " + newTotalHours +
                " часов работы может быть поделено между сотрудниками");
    }
}