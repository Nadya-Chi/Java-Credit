public class CreditService {
    public double calculate(long sum, int time) {
        double percent = 0.0999 / 12;
        double power = Math.pow(1+percent, time);
        double coefficient = (percent * power)/(power - 1);
        double payment = sum * coefficient;
        return payment;
    }
}
