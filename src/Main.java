//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task1
        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +  " лет, то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        // Task2
        int temperature = 4;
        boolean isCold = temperature < 5;
        if (isCold) {
            System.out.println("На улице " + temperature + " градуса(-ов), нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градуса(-ов), можно идти без шапки");
        }
        System.out.println();

        // Task3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        }
        System.out.println();

        // Task4
        int age1 = 6;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        }
        else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }
        System.out.println();

        // Task5
        int age2 = 3;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на атракционе");
        } else if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else  {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();

        // Task6
        int amountPlacesTotal = 102;
        int amountPlacesSeat = 60;
        int amountPlacesStand = amountPlacesTotal - amountPlacesSeat;
        int amountPlacesBusy = 50;
        if (amountPlacesSeat > amountPlacesTotal){
            System.out.println("Исходные данные некорректны!");
        } else if (amountPlacesBusy < amountPlacesSeat) {
            System.out.println("Места в вагоне есть, свободно еще " + (amountPlacesTotal - amountPlacesBusy) + " мест, из них " + (amountPlacesSeat - amountPlacesBusy) + " сидячих и " + amountPlacesStand + " стоячих");
        } else if (amountPlacesBusy > amountPlacesSeat && amountPlacesBusy < amountPlacesTotal) {
            System.out.println("Места в вагоне есть, свободно еще " + (amountPlacesTotal - amountPlacesBusy) + " стоячих. Сидячих мест уже нет");
        }
        else  {
            System.out.println("Вагон полностью забит");
        }
        System.out.println();

        // Task7
        int one = 150;
        int two = 150;
        int three = 120;
        if (one == two && one == three){
            System.out.println("Числа равны");
        } else if ((one > two && one > three) || (one > two && one == three) || (one == two && one > three) ){
            System.out.println("Наибольшее число = " + one);
        } else if ((two > one && two > three) || (two > one && two == three)|| (two == one && two > three)  ) {
            System.out.println("Наибольшее число = " + two);
        } else if ((three > one && three > two) || (three == one && three > two) || (three > one && three== two) ) {
            System.out.println("Наибольшее число = " + three);
        }

    }
}