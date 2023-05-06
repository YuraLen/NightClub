package Cuisine;

import People.Visitor;

import java.util.Scanner;

public class Salad {
    public static void orderSalad(Scanner scanner, Visitor visitor) {
        // відображення меню з салатами та вибір салату
        System.out.println("Салати:");
        System.out.println("1. Салат Цезар з куркою по-східному. Ціна за порцію (180г.) - 199грн");
        System.out.println("2. Салат з тигровими креветками, сьомгою та мусом з авокадо. Ціна за порцію (180г.) - 335грн");
        System.out.println("3. В'єтнамський салат з креветками та манго. Ціна за порцію (180г.) - 235грн");
        System.out.println("4. Фруктове плато. Ціна за порцію (350г.) - 210грн");
        System.out.println("5. Повернутися в меню");

        int cocktailChoice = scanner.nextInt();

        switch (cocktailChoice) {
            case 1:
                if (visitor.getAmountOfMoney() < 199) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Салат Цезар.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 199);
                    System.out.println("Ви замовили Салат Цезар!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 2:
                if (visitor.getAmountOfMoney() < 335) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Салат з тигровими креветками.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 335);
                    System.out.println("Ви замовили Салат з тигровими креветками!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 3:
                if (visitor.getAmountOfMoney() < 235) {
                    System.out.println("На жаль, у Вас недостатньо коштів на В'єтнамський салат з креветками та манго.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 235);
                    System.out.println("Ви замовили В'єтнамський салат з креветками та манго!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 4:
                if (visitor.getAmountOfMoney() < 210) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Фруктове плато.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 210);
                    System.out.println("Ви замовили Фруктове плато!");
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
