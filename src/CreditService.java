public class CreditService {
    public double calculate(long sum, int time, double percent) {
        double power = Math.pow(1 + (percent / 12), time);
        double coefficient = ((percent / 12) * power) / (power - 1);
        double payment = sum * coefficient;
        return payment;
    }
}
