package com.fitin.patterns.s.Facade;

import com.fitin.patterns.s.Facade.payment.PaymentInfo;
import com.fitin.patterns.s.Facade.transport.DeliveryTransportInfo;

public class Request {
    private final PaymentInfo paymentInfo;
    private final DeliveryTransportInfo deliveryTransportInfo;

    public Request(PaymentInfo paymentInfo, DeliveryTransportInfo deliveryTransportInfo) {
        this.paymentInfo = paymentInfo;
        this.deliveryTransportInfo = deliveryTransportInfo;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public DeliveryTransportInfo getDeliveryTransportInfo() {
        return deliveryTransportInfo;
    }
}
