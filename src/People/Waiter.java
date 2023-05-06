package People;

import java.util.Scanner;

import static Cuisine.Salad.orderSalad;
import static Cuisine.Seafood.orderSeafood;
import static Cuisine.Sushi.orderSushi;

//  Клас Waiter імітує офіціанта в клубі. Звернувшись до нього, користувач може замовити собі щось поїсти.

public class Waiter {
    private static void displayCuisineMenu() {
        System.out.println("Офіціант: Що б Ви хотіли замовити?");
        System.out.println("1. Салати;");
        System.out.println("2. Морепродукти та риба;");
        System.out.println("3. Суші;");
        System.out.println("4. Вийти.");
    }
    public static void work(Visitor visitor){
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        System.out.println("Офіціант: Вітаємо Вас в нашому нічному клубі!");

        while (!isFinished) {
            // відображення меню кухні
            displayCuisineMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    orderSalad(scanner, visitor);
                    break;
                case 2:
                    orderSeafood(scanner, visitor);
                    break;
                case 3:
                    orderSushi(scanner, visitor);
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