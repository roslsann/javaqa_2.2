public class Main {
    public static void main(String[] args) {
        int currentBalance = 150;
        int transaction = 1550;
        int bonus;
        if (transaction >= 1000) {
            bonus = transaction / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = currentBalance + transaction + bonus;
        System.out.println(bonus + " бонусов начисленно.");
        System.out.println("Ваш баланс " + totalBalance + " рублей.");

    }
}

