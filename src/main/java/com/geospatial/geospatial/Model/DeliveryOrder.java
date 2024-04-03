package com.geospatial.geospatial.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter

public class DeliveryOrder {


    UUID uuid;

    LatLng source ;
    LatLng destination;


    public DeliveryOrder(LatLng source, LatLng destination) {
        this.uuid = UUID.randomUUID();
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "uuid=" + uuid +
                ", source=" + source +
                ", destination=" + destination +
                '}';
    }
}
