package Bar;

import People.Visitor;

import java.util.Scanner;

public class Cocktail {
    public static void orderCocktail(Scanner scanner, Visitor visitor) {
        // відображення меню з коктейлями та вибір коктейля
        System.out.println("Коктейлі:");
        System.out.println("1. Remolacha. Склад: Бурбон, Пряна суміш, Настоянка троянди, Апельсин - 190грн");
        System.out.println("2. Monte Aperetivo. Склад: Амаро Монтенегро, Тонік, Ігристе Вино, Розмарин - 190грн");
        System.out.println("3. Venetian Spritz. Склад: Аперитив, Ігристе, Вино, Содова, Оливкова - 190грн");
        System.out.println("4. Skitlles. Склад: Лімончелло, Полуничне пюре, Цукровий сироп, Цитрусовий мікс, Кеглі - 190грн");
        System.out.println("5. Повернутися в меню");

        int cocktailChoice = scanner.nextInt();

        switch (cocktailChoice) {
            case 1:
                if (visitor.getAmountOfMoney() < 190) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Remolacha.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 190);
                    System.out.println("Ви замовили Remolacha!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 2:
                if (visitor.getAmountOfMoney() < 190) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Monte Aperetivo.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 190);
                    System.out.println("Ви замовили Monte Aperetivo!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 3:
                if (visitor.getAmountOfMoney() < 190) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Venetian Spritz.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 190);
                    System.out.println("Ви замовили Venetian Spritz!");
                    System.out.println("Баланс: " + visitor.getAmountOfMoney() + "грн");
                }
                break;
            case 4:
                if (visitor.getAmountOfMoney() < 190) {
                    System.out.println("На жаль, у Вас недостатньо коштів на Skitlles.");
                    System.out.println("У вас на балансі - " + visitor.getAmountOfMoney() + "грн");
                } else {
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney() - 190);
                    System.out.println("Ви замовили Skitlles!");
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
