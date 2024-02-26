package com.gar.wikistream.producer.service;


import com.gar.wikistream.producer.model.PlayDialogues;
import com.gar.wikistream.producer.model.Dialogues;
import com.gar.wikistream.producer.repository.DialoguesRepository;
import com.gar.wikistream.producer.repository.PlayDialoguesRepository;
import com.gar.wikistream.producer.request.PlayDialogueRequest;
import com.gar.wikistream.producer.utils.PlayIdGeneratorUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlayDialogueService {

    @Autowired
    PlayDialoguesRepository playDialoguesRepository;

    @Autowired
    DialoguesRepository dialoguesRepository;

    public String insertNewPlay(PlayDialogueRequest playDialogueRequest) {

        String playId = PlayIdGeneratorUtils.generateNamedUUID(playDialogueRequest.getPlayName(), playDialogueRequest.getAuthor());
        PlayDialogues playDialogues = new PlayDialogues();
        playDialogues.setId(playId);
        playDialogues.setPlayName(playDialogueRequest.getPlayName());
        playDialogues.setAuthor(playDialogueRequest.getAuthor());
        playDialogues.setActNumber(playDialogueRequest.getActNumber());
        playDialogues.setCharactersInScene(playDialogueRequest.getCharactersInScene());
        playDialogues.setActNumber(playDialogueRequest.getActNumber());
        List<Dialogues> dialoguesList = playDialogueRequest.getDialogues();
        return "data to be written";
    }

}
