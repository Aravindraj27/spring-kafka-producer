package com.gar.wikistream.producer.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Dialogues {
    @Id
    private String id;
    private int actNumber;
    private String speaker;
    private String tone;
    private String dialogue;
}
