public class CreditPaymentServiceDef {
   public float calculate (int credit, int term_credit, int credit_rate, int number){
       float b = (float) credit / term_credit;
       float S = credit - (b * number);
       float p = S * credit_rate / 12 / 100;
       float paymentDef = b + p;
       return (paymentDef);
  }
}
