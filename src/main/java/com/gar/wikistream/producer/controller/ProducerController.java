package com.gar.wikistream.producer.controller;

import com.gar.wikistream.producer.dto.DialogueMetaDataDTO;
import com.gar.wikistream.producer.mediaproducer.WikiMediaProducer;
import com.gar.wikistream.producer.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
public class ProducerController {
    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    @Autowired
    private final WikiMediaProducer producer;

    @GetMapping("/string/publish")
    public ResponseEntity<String> startPublishing() {
        wikimediaStreamConsumer.consumerStreamAndPublish();
        return ResponseEntity.ok("Publishing to topic has started");
    }


    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Server is UP");
    }

    @PostMapping("/metadata/publish")
    public ResponseEntity<String> publishPlayMetadata(@RequestBody DialogueMetaDataDTO metaDataDTO) {
        producer.publishPlayMetadatMessage(metaDataDTO);
        return ResponseEntity.ok("Published to topic");
    }

}
