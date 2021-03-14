public class CreditPaymentService {
    public int calculate(int credit, int termCredit, int creditRate) {
        float i = (float) creditRate / 12 / 100 / 100;
        double a = 1 + i;
        double c = Math.pow(a, termCredit);
        double K = i * c / (c - 1);
        double A = K * credit;
        int payment = (int) A;
        return (payment);
    }
}
