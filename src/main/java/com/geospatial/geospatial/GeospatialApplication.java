package com.geospatial.geospatial;

import com.geospatial.geospatial.Model.LatLng;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class GeospatialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeospatialApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(
//			KafkaTemplate<String, String> kafkaTemplate
//	){
//		return args -> {
//
//
//			for (int i = 0; i < 10; i++) {
//				kafkaTemplate.send("map-log-topic", LatLng.createRandomLatLng().toString());
//			}
//
//
//		};
//
//	}


}
