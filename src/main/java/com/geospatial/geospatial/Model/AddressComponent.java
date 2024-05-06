package com.geospatial.geospatial.Model;

import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class AddressComponent{
    public String long_name;
    public String short_name;
    public ArrayList<String> types;
}

class Geometry{
    public Location location;
    public String location_type;
    public Viewport viewport;
}

class Location{
    public double lat;
    public double lng;
}

class Northeast{
    public double lat;
    public double lng;
}

class Root{
    public ArrayList<Result> results;
    public String status;
}

class Southwest{
    public double lat;
    public double lng;
}

class Viewport{
    public Northeast northeast;
    public Southwest southwest;
}

