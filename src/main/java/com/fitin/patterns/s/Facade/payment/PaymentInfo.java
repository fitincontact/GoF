package com.fitin.patterns.s.Facade.payment;

public class PaymentInfo {
    private final double price;
    private final PaymentType paymentType;

    public PaymentInfo(double price, PaymentType paymentType) {
        this.price = price;
        this.paymentType = paymentType;
    }

    public double getPrice() {
        return price;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }
}
