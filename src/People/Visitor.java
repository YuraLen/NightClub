package People;

import java.util.Scanner;

public class Visitor {
    private Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;
    private boolean isVIPClient;
    private double amountOfMoney;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVIPClient() {
        return isVIPClient;
    }

    public void setVIPClient(boolean VIPClient) {
        isVIPClient = VIPClient;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void visitorRegistration(){
        System.out.println("Будь ласка, зареєструйте користувача!");
        System.out.print("✎ Ім'я: ");
        this.setFirstName(scanner.nextLine());
        System.out.print("✎ Прізвище: ");
        this.setLastName(scanner.nextLine());
        System.out.print("♛ Чи являєтесь Ви VIP клієнтом? (true/false): ");
        this.setVIPClient(scanner.nextBoolean());
        System.out.print("⏳ Вік: ");
        this.setAge(scanner.nextInt());
        System.out.print("\uD83D\uDCB8 Сума грошей у гаманці: ");
        this.setAmountOfMoney(scanner.nextDouble());
    }

    public void dance(){
        System.out.printf("\uD83C\uDFB6 Грає музика \uD83C\uDFB6\n** %s танцює **\n", getFirstName());
    }
}
