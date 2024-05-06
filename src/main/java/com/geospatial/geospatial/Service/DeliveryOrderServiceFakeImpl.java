package com.geospatial.geospatial.Service;

import com.geospatial.geospatial.Model.DeliveryOrder;
import com.geospatial.geospatial.Model.LatLng;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service("fakeservice")
public class DeliveryOrderServiceFakeImpl implements   DeliveryOrderService{
    List<DeliveryOrder> orders ;
    public DeliveryOrderServiceFakeImpl() {
        orders = new ArrayList<>();
    }


    @Override
    public Optional<DeliveryOrder> addDeliveryOrderToCluster(DeliveryOrder order) {
        return Optional.empty();
    }

    @Override
    public Optional<List<DeliveryOrder>> generateRandomPath(String uuid) {
        return Optional.empty();
    }

    @Override
    public List<DeliveryOrder> allDeliveryOrders() {
        return null;
    }

    @Override
    public DeliveryOrder getOrderById(String id) {
        return null;
    }

    @Override
    public DeliveryOrder createOrder(LatLng to, LatLng from) {
        return null;
    }
}
