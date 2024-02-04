package com.gar.wikistream.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {
    @Value("${kafka.topic}")
    private String topic;
    @Bean
    public NewTopic kafkaTestTopic() {
        return TopicBuilder
                .name(topic)
                .partitions(3)
                .replicas(1) // Replcation factor <= number of brokers
                .build();
    }
}
