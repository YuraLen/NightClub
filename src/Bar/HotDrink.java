package Bar;

import People.Visitor;

import java.util.Scanner;

/** Клас HotDrink використовується для того, щоб можна було виводити меню з гарячими напоями та робити їх замовлення */
public class HotDrink {
    public static void orderHotDrink(Scanner scanner, Visitor visitor) {
        System.out.println("Гарячі напої:");
        System.out.println("1. Еспресо. Ціна за порцію (30мл) - 49грн");
        System.out.println("2. Кава Амерекано. Ціна за порцію (150мл) - 49грн");
        System.out.println("3. Ведрочіно. Ціна за порцію (350мл.) - 130грн");
        System.out.println("4. Зелений чай. Ціна за порцію (400мл.) - 95грн");
        System.out.println("5. Чорний чай. Ціна за порцію (400мл.) - 95грн");
        System.out.println("6. Повернутися в меню");

        int cocktailChoice = scanner.nextInt();

        switch (cocktailChoice) {
            case 1:
                if (visitor.getAmountOfMoney() < 49) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Еспресо.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 49);
                    System.out.println("Ви замовили Еспресо!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 2:
                if (visitor.getAmountOfMoney() < 49) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Каву Амерекано.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 49);
                    System.out.println("Ви замовили Каву Амерекано!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 3:
                if (visitor.getAmountOfMoney() < 130) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Ведрочіно.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 130);
                    System.out.println("Ви замовили Ведрочіно!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 4:
                if (visitor.getAmountOfMoney() < 95) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Зелений чай.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 95);
                    System.out.println("Ви замовили Зелений чай!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 5:
                if (visitor.getAmountOfMoney() < 95) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Чорний чай.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 95);
                    System.out.println("Ви замовили Чорний чай!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 6:
                break;
            default:
                System.out.println("Невірний вибір!");
                break;
        }
    }
}
