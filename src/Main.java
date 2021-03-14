public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate(1_000_000, 12, 999);
        System.out.println("Ваш платеж составит: " + payment + " рублей.");

        int payment2 = service.calculate(1_000_000, 24, 999);
        System.out.println("Ваш платеж составит: " + payment2 + " рублей.");

        int payment3 = service.calculate(1_000_000, 36, 999);
        System.out.println("Ваш платеж составит: " + payment3 + " рублей.");
        ;


        // Дифференциальный платеж
        CreditPaymentServiceDef serv = new CreditPaymentServiceDef();
        float paymentDef = serv.calculate(100_000, 24, 24, 1); //number - месяц для платежа
        System.out.println("Ваш платеж составит: " + paymentDef + " рублей.");
    }
}
