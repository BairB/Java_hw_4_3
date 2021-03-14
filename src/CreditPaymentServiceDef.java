public class CreditPaymentServiceDef {
    public float calculate(int credit, int termCredit, int creditRate, int number) {
        float b = (float) credit / termCredit;
        float S = credit - (b * number);
        float p = S * creditRate / 12 / 100;
        float paymentDef = b + p;
        return (paymentDef);
    }
}
