public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int bonusScale = 100;
        int refill = 1400;
        int bonus;

        if (refill >= 1000){
            bonus = refill / bonusScale;
        } else {
            bonus = 0;
        }

        int totalAccount = customerAccount + refill + bonus;

        System.out.println("Вы пополнили счёт на " + refill + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + totalAccount + " руб.");
    }

}