import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Условный оператор, Чать2");

        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Полноценное приложения на iOS");
        }if (clientDeviceYear <= 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientDeviceYear > 2016 && clientOS == 1)
            System.out.println("Полноценное приложения на Android");

        //Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Высокостным год, является " + year);
        }else {
            System.out.println("Год " + year + " не евляется высокостным");
        }

        //Задание 4
        System.out.println("Задание 4");
        int distanceDelivery = 95;
        int daysDelivery = 1;
        if (distanceDelivery > 20){
            daysDelivery++;
        }
        if (distanceDelivery > 60){
            daysDelivery++;
        }
        System.out.println("Потребуется дней " + daysDelivery);

        //Задание 5
        System.out.println("Задание 5");
        int numberMonth = 13;
        switch (numberMonth){
            case 12:
            case 1:
            case 2:
                System.out.println("ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ВЕСНА");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("ЛЕТО");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("ОСЕНЬ");
                break;
            default:
                System.out.println("Не верный месяц " + numberMonth);
        }

        //Задание 6
        System.out.println("Задание 6");
        int age = 17;
        int salary = 20000;
        if (age<23&&age>=18){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary*2) + " рублей");
        }else if (age >=23){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary*3) + " рублей");
        }else if (age >= 23 && salary >= 50000 && salary < 80000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 1.2) + " рублей");
        }else if (age >= 23 && salary >= 80000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 1.3) + " рублей");
        }else {
            System.out.println("Мы не можем вам выдать кредит");
        }

    }
}