package com.gar.wikistream.producer.repository;

import com.gar.wikistream.producer.model.PlayDialogues;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayDialoguesRepository extends MongoRepository<PlayDialogues, String> {
    @Query("{'playName' : ?0, 'actNumber' : ?1}")
    public PlayDialogues findyPlayByNameAndActNumber(String playName, int actNumber);



}
