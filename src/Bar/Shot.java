package Bar;

import People.Visitor;

import java.util.Scanner;

public class Shot {
    public static void orderShot(Scanner scanner, Visitor visitor) {
        // відображення меню з коктейлями та вибір коктейля
        System.out.println("Шоти:");
        System.out.println("1. Коньяк. Ціна за шот (40мл.) - 215грн");
        System.out.println("2. Бренді. Ціна за шот (40мл.) - 85грн");
        System.out.println("3. Горілка. Ціна за шот (50мл.) - 85грн");
        System.out.println("4. Джин. Ціна за шот (40мл.) - 115грн");
        System.out.println("5. Повернутися в меню");

        int cocktailChoice = scanner.nextInt();

        switch (cocktailChoice) {
            case 1:
                if (visitor.getAmountOfMoney() < 215) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Коньяк.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 215);
                    System.out.println("Ви замовили Коньяк!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 2:
                if (visitor.getAmountOfMoney() < 85) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Бренді.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 85);
                    System.out.println("Ви замовили Бренді!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 3:
                if (visitor.getAmountOfMoney() < 85) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Горілку.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 85);
                    System.out.println("Ви замовили Горілку!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 4:
                if (visitor.getAmountOfMoney() < 115) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Джин.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 115);
                    System.out.println("Ви замовили Джин!");
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
