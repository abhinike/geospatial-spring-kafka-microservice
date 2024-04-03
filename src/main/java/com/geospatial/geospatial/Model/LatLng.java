package com.geospatial.geospatial.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LatLng {
    private Double lat;
    private Double lng;

    // Static factory method to create a random LatLng object
    public static LatLng createRandomLatLng() {
        double minLat = -90.0;
        double maxLat = 90.0;
        double minLng = -180.0;
        double maxLng = 180.0;
        double lat = minLat + (maxLat - minLat) * Math.random();
        double lng = minLng + (maxLng - minLng) * Math.random();
        return new LatLng(lat, lng);
    }

    @Override
    public String toString() {
        return "lat: "+ lat + "\t, Lng: " + lng;

    }
}
