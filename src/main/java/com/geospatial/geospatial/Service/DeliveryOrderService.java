package com.geospatial.geospatial.Service;


import com.geospatial.geospatial.Model.DeliveryOrder;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public interface DeliveryOrderService {


    Optional<DeliveryOrder> addDeliveryOrderToCluster(DeliveryOrder order);

    Optional<DeliveryOrder> getDeliveryOrderById(String uuid);


    Optional<List<DeliveryOrder>> generateRandomPath(String uuid);







}
