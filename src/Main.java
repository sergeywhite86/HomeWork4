import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = sc.nextInt();
        if (age < 18) System.out.println("Вы несовершеннолетний");
        else System.out.println("Вы совершеннолетний");

        System.out.println("Task2");
        System.out.println("Введите температуру");
        int temperature = sc.nextInt();
        if (temperature < 5) System.out.printf("На улице холодно %d градус/ов, нужно надеть шапку %n", temperature);
        else System.out.printf("Сегодня тепло %d градус/ов, можно идти без шапки %n", temperature);

        System.out.println("Task3");
        System.out.println("Введите скорость");
        int speed = sc.nextInt();
        if (speed > 60) System.out.printf("придется заплатить штраф,ваша скорость %d %n", speed);
        else System.out.printf("можно ездить спокойно,ваша скорость %d %n", speed);

        System.out.println("Task4");
        System.out.println("Введите возраст человека");
        int ageHuman = sc.nextInt();
        if (ageHuman < 2) {
            System.out.printf("Если возраст человека равен %d, то ему пора спать %n", ageHuman);
        } else if (ageHuman <= 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад %n", ageHuman);
        } else if (ageHuman <= 18) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу %n", ageHuman);
        } else if (ageHuman <= 23) {
            System.out.printf("Если возраст человека равен %d, то его место в университете %n", ageHuman);
        } else if (ageHuman <= 60) {
            System.out.printf("Если возраст человека равен  %d, то ему пора ходить на работу %n", ageHuman);
        } else {
            System.out.printf("Если возраст человека равен %d, то он может отдохнуть %n", ageHuman);
        }

        System.out.println("Task5");
        System.out.println("Введите возраст ребенка");
        int ageChild = sc.nextInt();
        if (ageChild < 5) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе %n", ageChild);
        } else if (ageChild < 14) {
            System.out.printf("Если возраст ребенка равен %d, " +
                    "то ему можно кататься на аттракционе только в сопровождении взрослого %n", ageChild);
        } else {
            System.out.printf("Если возраст ребенка равен %d," +
                    " то ему можно кататься на аттракционе без сопровождения взрослого %n", ageChild);
        }

        System.out.println("Task6");
        int capacity = 102;
        int countSeats = 60;
        System.out.println("Введите колличество пассажиров");
        int countPassengers = sc.nextInt();
        if (countPassengers < countSeats) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (countPassengers < capacity) {
            System.out.println("В вагоне есть свободные стоячие места");
        } else {
            System.out.println("В вагоне нет свободных мест");
        }

        System.out.println("Task7");
        System.out.println("Введите первое число");
        int firstNumber = sc.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = sc.nextInt();
        System.out.println("Введите третье число");
        int thirdNumber = sc.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Наибольшее число: " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Наибольшее число: " + secondNumber);
        } else {
            System.out.println("Наибольшее число: " + thirdNumber);
        }
    }
}
