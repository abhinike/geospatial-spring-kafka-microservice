package com.geospatial.geospatial.Configuration;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class KafkaListeners {


    private static KafkaConsumer<String, String> kafkaConsumer;

    KafkaListeners(KafkaConsumer<String, String> kafkaConsumer){this.kafkaConsumer = kafkaConsumer;}


    // Method to retrieve the top 10 orders
    public static List<String> getTop10Orders() {
        List<String> list = new ArrayList<>();
        kafkaConsumer.subscribe(Collections.singletonList("orders-topic"));
        int i = 10;
			while ( i > 0) {
				ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ofMillis(100));
				for (ConsumerRecord<String, String> record : records) {
					System.out.println("Key: " + record.key() + ", Value: " + record.value());
				    list.add(record.value());
                }
                i--;
			}

        // Limit the list to the top 10 orders
        List<String> top10Orders = list.subList(0, Math.min(10, list.size()));
        System.out.println(top10Orders.toString());
        return top10Orders;
    }
}
