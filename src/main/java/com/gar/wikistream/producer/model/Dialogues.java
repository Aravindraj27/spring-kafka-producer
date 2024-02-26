package com.gar.wikistream.producer.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Dialogues")
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Dialogues {
    @Id
    private int sequence;
    private String playId;
    private String speaker;
    private String tone;
    private String dialogue;
}
