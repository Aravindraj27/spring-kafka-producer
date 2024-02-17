package com.gar.wikistream.producer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@ToString
@Getter
@Setter
public class DialogueMetaDataDTO {
    @JsonProperty("playName")
    String playName;

    @JsonProperty("actNumber")
    int actNumber;

    @JsonProperty("author")
    String author;

}
