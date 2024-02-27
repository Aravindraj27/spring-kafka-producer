package com.gar.wikistream.producer.controller;

import com.gar.wikistream.producer.request.PlayDialogueRequest;
import com.gar.wikistream.producer.service.PlayDialogueService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/play")
@AllArgsConstructor
public class DialoguesController {


    public PlayDialogueService playDialogueService;

    @PostMapping
    public String savePlays(@RequestBody PlayDialogueRequest playDialogueRequest) {
        return playDialogueService.insertNewPlay(playDialogueRequest);
    }
}
