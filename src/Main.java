public class Main {
    public static void main(String[] args) {
        int ticketPrice = 12000;
        int RUB_BONUS_MILE = 20;
        int bonusMiles = ticketPrice / RUB_BONUS_MILE;
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}