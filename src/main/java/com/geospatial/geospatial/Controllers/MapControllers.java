package com.geospatial.geospatial.Controllers;

import com.geospatial.geospatial.Service.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MapControllers {


    @Autowired
    DeliveryOrderService service;
    // add order to the the order cluster

    @GetMapping
    String home(){
        return "Map-Microservice running...";
    }






}
