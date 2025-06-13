package com.example.springboot_kafka_tutorial.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("Sudeep").partitions(10).build();
    }

    @Bean
    public NewTopic JsonTopic(){
        return TopicBuilder.name("Sudeep1").partitions(10).build();
    }

}
