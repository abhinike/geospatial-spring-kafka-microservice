package com.geospatial.geospatial.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LatLngWrapper {
    private LatLng to;
    private LatLng from;
}
