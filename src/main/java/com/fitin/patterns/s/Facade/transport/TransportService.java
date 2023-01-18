package com.fitin.patterns.s.Facade.transport;

public class TransportService {
    private static final String msg = "delivering completed with ";

    public String send(DeliveryTransportInfo info) {
        var type = info.getDeliveryTransport();
        var address = info.getaddress();

        return switch (type) {
            case FLY -> sendWithFly(address);
            case CAR -> sendWithCar(address);
            case SHIP -> sendWithShip(address);
        };
    }

    private String sendWithCar(String address) {
        return msg + "car on " + address;
    }

    private String sendWithFly(String address) {
        return msg + "fly on " + address;
    }

    private String sendWithShip(String address) {
        return msg + "ship on " + address;
    }
}
