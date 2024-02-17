package com.gar.wikistream.producer.mediaproducer;

import com.gar.wikistream.producer.dto.DialogueMetaDataDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikiMediaProducer {

    @Value("${kafka.topic}")
    private String topic;

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaTemplate<String, DialogueMetaDataDTO> kafkaTemplateForMetadata;

    public void publishMessage(String message) {
        log.info(String.format("Sending message : %s to topic : %s", message, topic));
        kafkaTemplate.send(topic, message);
    }


    public void publishPlayMetadatMessage(DialogueMetaDataDTO message) {
        log.info(String.format("Sending message : %s to topic : %s", message, topic));
        kafkaTemplateForMetadata.send(topic, message);
    }
}
