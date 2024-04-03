//package com.geospatial.geospatial.Configuration;
//
//import com.geospatial.geospatial.Model.LatLng;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//@Slf4j
//public class KafkaSender {
//
//
//    @Autowired
//    KafkaTemplate<String, LatLng> kafk    aTemplate;
//
//
//    public void sendLatLng( LatLng latLng){
//
//        kafkaTemplate.send("map-log-topic", latLng );
//
//    }
//
//
//
//
//
//
//}
