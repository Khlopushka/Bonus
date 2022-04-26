public class Main {
    public static void main(String[] args) {

        int account = 300;
        int refill = 300;
        int bonus = refill / 100;

        if (refill < 1000) {
            bonus = 0;
        }
        int total = account + refill + bonus;

        System.out.println("Итого: " + total);
        System.out.println("Бонусные рубли: " + bonus);


    }
}
