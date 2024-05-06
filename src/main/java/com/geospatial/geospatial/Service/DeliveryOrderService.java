package com.geospatial.geospatial.Service;


import com.geospatial.geospatial.Model.DeliveryOrder;
import com.geospatial.geospatial.Model.LatLng;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DeliveryOrderService {


    Optional<DeliveryOrder> addDeliveryOrderToCluster(DeliveryOrder order);

    Optional<List<DeliveryOrder>> generateRandomPath(String uuid);


    List<DeliveryOrder> allDeliveryOrders();

    DeliveryOrder getOrderById(String id );

    DeliveryOrder createOrder(LatLng to, LatLng from);









}
