package com.geospatial.geospatial.Configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class MapTopic {


    public NewTopic LatLngTopic(){
        return TopicBuilder.name("map-log-topic").partitions(10).build();
    }

    public NewTopic OrdersTopic(){
        return TopicBuilder.name("orders-topic").partitions(3).build();
    }

}
