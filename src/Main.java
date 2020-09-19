public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();
        int paymentForOneYears = (int) service.calculate(1000000, 12);
        System.out.println(paymentForOneYears);

        int paymentForTwoYears = (int) service.calculate(1000000, 24);
        System.out.println(paymentForTwoYears);

        int paymentForThreeYears = (int) service.calculate(1000000, 36);
        System.out.println(paymentForThreeYears);
    }
}
