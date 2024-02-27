package com.gar.wikistream.producer.bootstrap;

import com.gar.wikistream.producer.model.Dialogues;
import com.gar.wikistream.producer.model.PlayDialogues;
import com.gar.wikistream.producer.repository.DialoguesRepository;
import com.gar.wikistream.producer.repository.PlayDialoguesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

@Component
@Slf4j
public class PlayDetailsBootStrap implements CommandLineRunner {
    PlayDialoguesRepository playDialoguesRepository;

    DialoguesRepository dialoguesRepository;
    public PlayDetailsBootStrap(PlayDialoguesRepository playDialoguesRepository, DialoguesRepository dialoguesRepository) {
        this.playDialoguesRepository = playDialoguesRepository;
        this.dialoguesRepository = dialoguesRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        PlayDialogues playDialogues = new PlayDialogues();
        playDialogues.setPlayName("Marcus");
        playDialogues.setAuthor("Me");
        playDialogues.setActNumber(1);
        playDialogues.setSceneSetting("Timid");
        playDialogues.setCharactersInScene(new ArrayList<>(Arrays.asList("data", "spock")));
        playDialogues.setId(UUID.randomUUID().toString());
        log.info("Inserting data {}", playDialogues.toString());
        playDialoguesRepository.save(playDialogues);

        Dialogues dialogues = new Dialogues();
        dialogues.setDialogueId(playDialogues.getId().concat(String.format("%04d", 1)));
        dialogues.setPlayId(playDialogues.getId());
        dialogues.setSequence(1);
        dialogues.setTone("harsh");
        dialogues.setSpeaker("Me");
        dialogues.setDialogue("My dialogue");
        log.info("Inserting dialogue for play {}", playDialoguesRepository.findById(dialogues.getPlayId()).get().getPlayName());
        dialoguesRepository.save(dialogues);
    }
}
