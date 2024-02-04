package com.gar.wikistream.producer.controller;

import com.gar.wikistream.producer.mediaproducer.WikiMediaProducer;
import com.gar.wikistream.producer.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
public class ProducerController {
    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    @GetMapping("/string/publish")
    public ResponseEntity<String> startPublishing() {
        wikimediaStreamConsumer.consumerStreamAndPublish();
        return ResponseEntity.ok("Publishing to topic has started");
    }

}
