package com.fitin.patterns.s.Facade;

import com.fitin.patterns.s.Facade.payment.PaymentService;
import com.fitin.patterns.s.Facade.transport.TransportService;

public class ParcelDeliveryService {
    public String send(Parcel parcel, Request request) {
        var paymentService = new PaymentService();
        var transportService = new TransportService();

        var status = "";
        status = status + " start process ";
        status = status + " try to payment ";
        status = status + paymentService.pay(request.getPaymentInfo());
        status = status + " try delivery ";
        status = status + transportService.send(request.getDeliveryTransportInfo());
        status = status + " finish process ";

        return status;
    }
}
