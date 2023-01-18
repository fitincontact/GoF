package com.fitin.patterns.s.Facade;

public class ParcelDeliveryFacade {
    public String send(Parcel parcel, Request request) {
        var parcelDeliveryService = new ParcelDeliveryService();
        return parcelDeliveryService.send(parcel, request);
    }
}
