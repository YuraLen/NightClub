import ClubInfo.Club;
import Data.DateTime;
import Data.Time;
import People.Barman;
import People.Guard;
import People.Visitor;
import People.Waiter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * TODO:
         * Зробити рандомайзер актуального числа людей в клубі, щоб кожний раз була інша кількість
         * Зробити знижки на кухню і бар якщо сьогодні свято (isWeekend = true)
         * Закінчити цикл оформлення замовлення в бармена/офіціанта, якщо недостатньо грошей
         * */

        Club club = new Club("Fashion Club", "площа Івана Підкови, 1, Львів", 162, 200, 200);
        Guard guard = new Guard();

        club.introduction();
        club.toString();

        Visitor visitor = new Visitor();
        visitor.visitorRegistration();

        guard.work(visitor, club);
        if(guard.isCheckPassed()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Адміністратор: Привіт " + visitor.getFirstName() + ". Вітаємо Вас в нашому нічному клубі Fashion Club! Бажаємо Вам вдало провести час!");
            boolean isInsideClub = true;
            while (isInsideClub) {
                System.out.println("~~~~~~~~ Оберіть чим Ви хочете зайнятись. Ви можете: ~~~~~~~~~");
                System.out.println("1. Замовити собі щось їсти;");
                System.out.println("2. Відвідати барну стійку;");
                System.out.println("3. Танцювати;");
                System.out.println("4. Вийти з клубу.");
                int action = scanner.nextInt();
              switch (action) {
                  case 1:
                      Waiter.work(visitor);
                      break;
                  case 2:
                      Barman.work(visitor);
                      break;
                  case 3:
                    visitor.dance();
                      break;
                  case 4:
                      System.out.println("Дякуємо, що відвідали наш нічний клуб! Заходьте ще!");
                      isInsideClub = false;
                      break;
                  default:
                      System.out.println("Неправильна команда.");
                      break;
              }
          }
      }
        DateTime dateTime = new DateTime("Понеділок", new Time(12,30), false);
    }
}