package com.gar.wikistream.producer.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "PlayDialogues")
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Data
public class PlayDialogues {

    @Id
    private String id;
    private String playName;
    private String author;
    private int actNumber;
    private String sceneSetting;
    private List<String> charactersInScene;
//    private List<Dialogues> dialoguesList;

}
