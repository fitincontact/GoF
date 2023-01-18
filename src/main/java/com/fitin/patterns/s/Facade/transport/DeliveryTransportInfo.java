package com.fitin.patterns.s.Facade.transport;

public class DeliveryTransportInfo {
    private final String address;
    private final DeliveryTransport deliveryTransport;

    public DeliveryTransportInfo(String address, DeliveryTransport deliveryTransport) {
        this.address = address;
        this.deliveryTransport = deliveryTransport;
    }

    public DeliveryTransport getDeliveryTransport() {
        return deliveryTransport;
    }

    public String getaddress() {
        return address;
    }
}
