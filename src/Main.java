public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннлетия, нужно " +
                "немножко подождать");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 65;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        } else System.out.println("Если скорость " + speed + " то придется заплатить штраф");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 10;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракционе " +
                    "в сопровождении взрослого");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракцтоне " +
                    "без сопроождения взрослого");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int numberOfPassangers = 72;
        int numberOfSeats = 60;
        int allSeats = 102;
        if (numberOfPassangers <= numberOfSeats) {
            System.out.println("Осталось сидячих мест " + (numberOfSeats - numberOfPassangers));
        } else if (numberOfPassangers >= numberOfSeats && numberOfPassangers <= allSeats) {
            System.out.println("Сидячих мест нет. Осталось стоячих мест " + (allSeats - numberOfSeats - numberOfPassangers));
        } else {
            System.out.println("Мест нет");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 11;
        int two = 11;
        int three = 11;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число " + one);
        } else if (two >= three) {
            System.out.println("Наибольшее число " + two);
        } else System.out.println("Наибольшее число " + three);
    }
}