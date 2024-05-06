package com.geospatial.geospatial.Controllers;

import com.geospatial.geospatial.Model.DeliveryOrder;
import com.geospatial.geospatial.Model.LatLng;
import com.geospatial.geospatial.Model.LatLngWrapper;
import com.geospatial.geospatial.Service.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
public class MapControllers {


    @Autowired
    @Qualifier("realservice") DeliveryOrderService service;
    // add order to the the order cluster

    @GetMapping
    public String home(){
        return "Map-Microservice running...";
    }


    @GetMapping("/orders/get-all-orders")
    public List<DeliveryOrder> getAllOrders(){
        return service.allDeliveryOrders();
    }


    @GetMapping("/orders")
    public DeliveryOrder getOrderById(@RequestParam("id") String id) {
        return service.getOrderById(id);
    }





    @PostMapping("/orders/create-order")
    public DeliveryOrder createDeliveryOrder(@RequestBody LatLngWrapper coordinates) {
                    /*
                    request body
            {
              "to": {
                "lat": 40.7128,
                "lng": -74.0060
              },
              "from": {
                "lat": 34.0522,
                "lng": -118.2437
              }
            }
            */
        System.out.println("order creating...");
        return service.createOrder(coordinates.getTo(), coordinates.getFrom());
    }

















}
