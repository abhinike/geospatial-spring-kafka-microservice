package com.geospatial.geospatial.Service;

import com.geospatial.geospatial.Model.DeliveryOrder;
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
    public Optional<DeliveryOrder> getDeliveryOrderById(String uuid) {
        return Optional.empty();
    }

    @Override
    public Optional<List<DeliveryOrder>> generateRandomPath(String uuid) {
        return Optional.empty();
    }
}
