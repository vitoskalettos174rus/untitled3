public class Main {
    public static void main(String[] args) {
        int customer = 100;
        int bonus = 100;
        int upload = 2000;

        if (upload > 1000) {
            bonus = upload / bonus;
        } else {
            bonus = 0;
        }

        int total = customer + upload + bonus;

        System.out.println("Вы пополнили счёт на " + upload + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + total + " руб.");
    }
}