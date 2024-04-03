package com.geospatial.geospatial.Controllers;

import com.geospatial.geospatial.Model.DeliveryOrder;
import com.geospatial.geospatial.Service.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.form.LabelTag;

@RestController("api/v2/")
public class MapControllers {


    @Autowired
    DeliveryOrderService service;
    // add order to the the order cluster





}
