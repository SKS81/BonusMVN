public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 3_000;
        boolean registered = true;
        long bonus = service.calculate(amount, registered);
        System.out.println(bonus);

    }
}
