public class CreditPaymentService {
    public int calculate (int credit, int term_credit, int credit_rate){
        float i = (float) credit_rate / 12 / 100 / 100;
        double a = 1 + i;
        double c = Math.pow(a, term_credit);
        double K = i * c / (c - 1);
        double A = K * credit;
        int payment = (int) A;
        return(payment);
    }
}
