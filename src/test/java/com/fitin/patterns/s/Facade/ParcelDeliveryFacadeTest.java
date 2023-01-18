package com.fitin.patterns.s.Facade;

import com.fitin.patterns.s.Facade.payment.PaymentInfo;
import com.fitin.patterns.s.Facade.payment.PaymentType;
import com.fitin.patterns.s.Facade.transport.DeliveryTransport;
import com.fitin.patterns.s.Facade.transport.DeliveryTransportInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParcelDeliveryFacadeTest {
    @Test
    void test() {
        var facade = new ParcelDeliveryFacade();

        var paymentInfo = new PaymentInfo(1.99, PaymentType.CARD);
        var deliveryTransportInfo = new DeliveryTransportInfo("Berlin", DeliveryTransport.FLY);
        var request = new Request(paymentInfo, deliveryTransportInfo);

        var status = facade.send(new Parcel(), request);

        assertEquals(
                " start process  try to payment payment completed with card 1.99 try delivery delivering completed with fly on Berlin finish process ",
                status
        );
    }
}
