package Cuisine;

import People.Visitor;

import java.util.Scanner;

/** Клас Seafood використовується для того, щоб можна було виводити меню з морепродуктами та робити їх замовлення */
public class Seafood {
    public static void orderSeafood(Scanner scanner, Visitor visitor) {
        System.out.println("Морепродукти та риба:");
        System.out.println("1. Лосось (філе). Ціна за порцію (100г.) - 235грн");
        System.out.println("2. Тигрові креветки (дикий відлов). Ціна за порцію (100г.) - 305грн");
        System.out.println("3. Морські гребінці (дикий відлов). Ціна за порцію (100г.) - 415грн");
        System.out.println("4. Спаржа. Ціна за порцію (50г.) - 155грн");
        System.out.println("5. Повернутися в меню");

        int seafoodChoice = scanner.nextInt();

        switch (seafoodChoice) {
            case 1:
                if (visitor.getAmountOfMoney() < 235) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Лосось.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 235);
                    System.out.println("Ви замовили Лосось!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 2:
                if (visitor.getAmountOfMoney() < 305) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Тигрові креветки.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 305);
                    System.out.println("Ви замовили Тигрові креветки!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 3:
                if (visitor.getAmountOfMoney() < 415) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Морські гребінці.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 415);
                    System.out.println("Ви замовили Морські гребінці!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 4:
                if (visitor.getAmountOfMoney() < 155) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Спаржу.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 155);
                    System.out.println("Ви замовили Спаржу!");
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
