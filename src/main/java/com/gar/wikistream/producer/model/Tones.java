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

@Entity
@Table(name = "TONES")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tones {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @Column(name = "TONE")
    private String tone;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "UPDATED_BY")
    private String updateBy;

    @Column(name = "CREATED_AT")
    @CreationTimestamp(source = SourceType.DB)
    private Instant createdAt;

    @Column(name = "UPDATED_AT")
    @UpdateTimestamp(source = SourceType.DB)
    private Instant updatedAt;
}
