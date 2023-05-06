package People;

import java.util.Scanner;

import static Bar.Cocktail.orderCocktail;
import static Bar.HotDrink.orderHotDrink;
import static Bar.Shot.orderShot;

public class Barman{
    private static void displayMenuWithDrinks() {
        System.out.println("Бармен: Що б Ви хотіли замовити?");
        System.out.println("1. Коктейлі");
        System.out.println("2. Шоти");
        System.out.println("3. Гарячі напитки");
        System.out.println("4. Вийти");
    }

    public static void work(Visitor visitor) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        System.out.println("Бармен:  Вітаємо Вас в нашому нічному клубі!");

        while (!isFinished) {
            // відображення меню з напоями
            displayMenuWithDrinks();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    orderCocktail(scanner, visitor);
                    break;
                case 2:
                    orderShot(scanner, visitor);
                    break;
                case 3:
                    orderHotDrink(scanner, visitor);
                    break;
                case 4:
                    isFinished = true;
                    break;
                default:
                    System.out.println("Невірний вибір!");
                    break;
            }
        }
    }
}