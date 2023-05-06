package Cuisine;

import People.Visitor;

import java.util.Scanner;

public class Sushi {
    public static void orderSushi(Scanner scanner, Visitor visitor) {
        // відображення меню з салатами та вибір салату
        System.out.println("Суші:");
        System.out.println("1. Авокадо каппа макі. Ціна за порцію (120г.) - 95грн");
        System.out.println("2. Азія ф'южн. Ціна за порцію (260г.) - 335грн");
        System.out.println("3. Канадський рол. Ціна за порцію (220г.) - 295грн");
        System.out.println("4. Філадельфія. Ціна за порцію (210г.) - 225грн");
        System.out.println("5. Повернутися в меню");

        int cocktailChoice = scanner.nextInt();

        switch (cocktailChoice) {
            case 1:
                if (visitor.getAmountOfMoney() < 95) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Авокадо каппа макі.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 95);
                    System.out.println("Ви замовили Авокадо каппа макісось!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 2:
                if (visitor.getAmountOfMoney() < 335) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Азія ф'южн.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 335);
                    System.out.println("Ви замовили Азія ф'южн!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 3:
                if (visitor.getAmountOfMoney() < 295) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Канадський рол.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 295);
                    System.out.println("Ви замовили Канадський рол!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 4:
                if (visitor.getAmountOfMoney() < 225) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Філадельфію.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 225);
                    System.out.println("Ви замовили Філадельфію!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 5:
                break;
            default:
                System.out.println("Невірний вибір!");
                break;
        }
    }
}