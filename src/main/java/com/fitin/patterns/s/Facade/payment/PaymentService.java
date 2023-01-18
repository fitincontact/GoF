package com.fitin.patterns.s.Facade.payment;

public class PaymentService {
    private static final String msg = "payment completed with ";

    public String pay(PaymentInfo paymentInfo) {
        var type = paymentInfo.getPaymentType();
        var price = paymentInfo.getPrice();

        return switch (type) {
            case CARD -> paymentWithCard(price);
            case CASH -> paymentWithCash(price);
        };
    }

    private String paymentWithCash(double price) {
        return msg + "cash " + price;
    }

    private String paymentWithCard(double price) {
        return msg + "card " + price;
    }
}
