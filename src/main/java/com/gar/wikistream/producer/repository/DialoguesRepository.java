package com.gar.wikistream.producer.repository;


import com.gar.wikistream.producer.model.Dialogues;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DialoguesRepository extends MongoRepository<Dialogues, String> {

}
