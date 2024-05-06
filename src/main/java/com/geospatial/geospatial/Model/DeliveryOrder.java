package com.geospatial.geospatial.Model;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;


@Getter
@Setter

@AllArgsConstructor

public class DeliveryOrder {

    private UUID uuid;
    private LatLng source;
    private LatLng destination;

    public DeliveryOrder() {
        // Default constructor
    }

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

    public String toJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(this);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
