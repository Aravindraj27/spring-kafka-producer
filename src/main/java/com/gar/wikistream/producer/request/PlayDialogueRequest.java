package com.gar.wikistream.producer.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gar.wikistream.producer.model.Dialogues;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class PlayDialogueRequest {

    @JsonProperty("playName")
    private String playName;

    @JsonProperty("author")
    private String author;

    @JsonProperty("actNumber")
    private int actNumber;

    @JsonProperty("sceneSetting")
    private String sceneSetting;

    @JsonProperty("charatersInScene")
    private List<String> charactersInScene;

    @JsonProperty("dialogues")
    private List<Dialogues> dialogues;
}
