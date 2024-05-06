package com.geospatial.geospatial.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geospatial.geospatial.Configuration.KafkaListeners;
import com.geospatial.geospatial.Model.DeliveryOrder;
import com.geospatial.geospatial.Model.LatLng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

@Service("realservice")
public class DeliverOrderServiceImpl implements DeliveryOrderService {

    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public DeliverOrderServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
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
        List<DeliveryOrder> deliveryOrders = new ArrayList<>();
        // Assuming KafkaListeners is a bean that listens to Kafka topic "orders-topic"
        // This listener method should receive the messages and store them somewhere
        // You can then retrieve those messages here to build the list of DeliveryOrders

        // Retrieve top 10 orders from KafkaListeners
        List<String> ordersData = KafkaListeners.getTop10Orders();
        for (String data : ordersData) {
            // Convert each data to DeliveryOrder object and add to the list
            DeliveryOrder order = convertDataToDeliveryOrder(data);
            if (order != null) {
                deliveryOrders.add(order);
            }
        }
        return deliveryOrders;
    }

    public static LatLng getLatLng(String address, String apiKey) {
        String url = String.format("%s?address=%s&key=%s", "https://maps.googleapis.com/maps/api/geocode/json", address, apiKey);
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response);
            JsonNode results = root.path("results").get(0);
            JsonNode geometry = results.path("geometry").path("location");
            Double lat = geometry.path("lat").asDouble();
            Double lng = geometry.path("lng").asDouble();
            return new LatLng(lat, lng);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String apiKey = "Api key";
        String address = "andheri";

        LatLng latLng = getLatLng(address, apiKey);
        if (latLng != null) {
            System.out.println("Latitude and Longitude: " + latLng);
        } else {
            System.out.println("Failed to fetch Latitude and Longitude for the address: " + address);
        }
    }


    // Method to convert JSON data to DeliveryOrder object
    private DeliveryOrder convertDataToDeliveryOrder(String data) {
        // Implement logic to convert JSON string to DeliveryOrder object
        // Example:
         ObjectMapper objectMapper = new ObjectMapper();
         try {
             return objectMapper.readValue(data, DeliveryOrder.class);
         } catch (IOException e) {
             e.printStackTrace();
             return null;
         }

    }

    @Override
    public DeliveryOrder getOrderById(String id) {
        return null;
    }

    @Override
    public DeliveryOrder createOrder(LatLng to, LatLng from) {
        // Create a DeliveryOrder
        DeliveryOrder order = new DeliveryOrder(from, to);

        // Add the DeliveryOrder to the "orders-topic"
        kafkaTemplate.send("orders-topic", order.toJson());

        return order;
    }
}
