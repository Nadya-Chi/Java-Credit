public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();
        int paymentForOneYears = (int) service.calculate(1_000_000, 12, 0.0999);
        System.out.println(paymentForOneYears);

        int paymentForTwoYears = (int) service.calculate(1_000_000, 24, 0.0999);
        System.out.println(paymentForTwoYears);

        int paymentForThreeYears = (int) service.calculate(1_000_000, 36, 0.0999);
        System.out.println(paymentForThreeYears);
    }
}