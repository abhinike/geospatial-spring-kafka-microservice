package com.geospatial.geospatial;

import com.geospatial.geospatial.Model.LatLng;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.Duration;
import java.util.Collections;

@SpringBootApplication
public class GeospatialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeospatialApplication.class, args);
	}

//	@Bean
////	CommandLineRunner commandLineRunner(
////			KafkaTemplate<String, String> kafkaTemplate
////	){
////		return args -> {
////
////
////			for (int i = 0; i < 10; i++) {
////				kafkaTemplate.send("map-log-topic", LatLng.createRandomLatLng().toString());
////			}
////
////
////		};
////
////	}
//
//	@Bean
//	CommandLineRunner commandLineRunner(
//			KafkaConsumer<String, String> kafkaConsumer
//
//	){
//		return args -> {
//
//
//			kafkaConsumer.subscribe(Collections.singletonList("orders-topic"));
//
//			while (true) {
//				ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ofMillis(100));
//				for (ConsumerRecord<String, String> record : records) {
//					System.out.println("Key: " + record.key() + ", Value: " + record.value());
//				}
//			}
//
//
//		};
//
//	}


}
