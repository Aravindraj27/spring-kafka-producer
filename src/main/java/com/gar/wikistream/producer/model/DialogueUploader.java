package com.gar.wikistream.producer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "DIALOGUE_UPLOADER")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class DialogueUploader {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @Column(name = "MOVIE_NAME")
    private String movieName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "UPLOAD_STATUS")
    private String uploadStatus;

    @Column(name = "CREATED_AT")
    @CreationTimestamp(source = SourceType.DB)
    private Instant createdAt;

    @Column(name = "UPDATED_AT")
    @UpdateTimestamp(source = SourceType.DB)
    private Instant updatedAt;

    @Column(name = "UPDATED_BY")
    private String updatedBy;
}
