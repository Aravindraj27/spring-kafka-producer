package com.gar.wikistream.producer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@AllArgsConstructor
@ToString
public class PlayDialogues {

    @Id
    private String id;
    private String playName;
    private String author;
    private int actNumber;
    private String sceneSetting;
    private List<String> charactersInScene;
    private List<Dialogues> dialoguesList;

}
