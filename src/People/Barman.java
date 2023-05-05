package People;

import java.util.Scanner;
//exit menu club

public class Barman {

    /*
    *   TODO:
    *    закінчити цикл коли в юзера буде недостатньо грошей для замовлення
    * */
    public static void work(Visitor visitor) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        double money = visitor.getAmountOfMoney();
        System.out.println("Бармен:  Вітаємо Вас в нашому нічному клубі!");
        while (!isFinished) {
            // відображення меню з напоями
            System.out.println("У Вас на балансі " + money + "грн");
            System.out.println("Бармен:  Що б Ви хотіли замовити?");
            System.out.println("1. Кокетйлі");
            System.out.println("2. Шоти");
            System.out.println("3. Гарячі напитки");
            System.out.println("4. Вийти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Коктейлі:");
                    System.out.println("1. Remolacha. Склад: Бурбон, Пряна суміш, Настоянка троянди, Апельсин - 190грн");
                    System.out.println("2. Monte Aperetivo. Склад: Амаро Монтенегро, Тонік, Ігристе Вино, Розмарин - 190грн");
                    System.out.println("3. Venetian Spritz. Склад: Аперитив, Ігристе, Вино, Содова, Оливкова - 190грн");
                    System.out.println("4. Skitlles. Склад: Лімончелло, Полуничне пюре, Цукровий сироп, Цитрусовий мікс, Кеглі - 190грн");
                    System.out.println("5. Повернутися в меню");

                    int cocktailChoice = scanner.nextInt();

                    switch (cocktailChoice) {
                        case 1:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-190);
                            System.out.println("Ви замовили Remolacha!");
                            work(visitor);
                            break;
                        case 2:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-190);
                            System.out.println("Ви замовили Monte Aperetivo!");
                            work(visitor);
                            break;
                        case 3:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-190);
                            System.out.println("Ви замовили Venetian Spritz!");
                            work(visitor);
                            break;
                        case 4:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-190);
                            System.out.println("Ви замовили Skitlles");
                            work(visitor);
                            break;
                        case 5:
                            work(visitor);
                            break;
                        default:
                            System.out.println("Невірний вибір!");
                            work(visitor);
                            break;
                    }
                    break;
                case 2:
                    // відображення меню з шотами та вибір шоту
                    System.out.println("Шоти:");
                    System.out.println("1. Коньяк. Ціна за шот (40мл.) - 215грн");
                    System.out.println("2. Бренді. Ціна за шот (40мл.) - 85грн");
                    System.out.println("3. Горілка. Ціна за шот (50мл.) - 85грн");
                    System.out.println("4. Джин. Ціна за шот (40мл.) - 115грн");
                    System.out.println("5. Повернутися в меню");

                    int shotChoice = scanner.nextInt();

                    switch (shotChoice) {
                        case 1:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-215);
                            System.out.println("Ви замовили Коньяк!");
                            work(visitor);
                            break;
                        case 2:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-85);
                            System.out.println("Ви замовили Бренді!");
                            work(visitor);
                            break;
                        case 3:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-85);
                            System.out.println("Ви замовили Горілку!");
                            work(visitor);
                            break;
                        case 4:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-115);
                            System.out.println("Ви замовили Джин!");
                            work(visitor);
                            break;
                        case 5:
                            work(visitor);
                            break;
                        default:
                            System.out.println("Невірний вибір!");
                            work(visitor);
                            break;
                    }
                    break;
                case 3:
                    // відображення меню з гарячими напоями та вибір напою
                    System.out.println("Гарячі напитки:");
                    System.out.println("1. Еспресо. Ціна за порцію (30мл) - 49грн");
                    System.out.println("2. Кава Амерекано. Ціна за порцію (150мл) - 49грн");
                    System.out.println("3. Ведрочіно. Ціна за порцію (350мл.) - 130грн");
                    System.out.println("4. Зелений чай. Ціна за порцію (400мл.) - 95грн");
                    System.out.println("5. Чорний чай. Ціна за порцію (400мл.) - 95грн");
                    System.out.println("6. Повернутися в меню");
                    int hotDrinks = scanner.nextInt();

                    switch (hotDrinks) {
                        case 1:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-49);
                            System.out.println("Ви замовили Еспресо!");
                            work(visitor);
                            break;
                        case 2:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-49);
                            System.out.println("Ви замовили Каву Амерекано!");
                            work(visitor);
                            break;
                        case 3:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-130);
                            System.out.println("Ви замовили Ведрочіно!");
                            work(visitor);
                            break;
                        case 4:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-95);
                            System.out.println("Ви замовили Зелений чай!");
                            work(visitor);
                            break;
                        case 5:
                            visitor.setAmountOfMoney(visitor.getAmountOfMoney()-95);
                            System.out.println("Ви замовили Чорний чай!");
                            work(visitor);
                            break;
                        case 6:
                            work(visitor);
                            break;
                        default:
                            System.out.println("Невірний вибір!");
                            work(visitor);
                            break;
                    }
            }
            break;
        }
    }
}