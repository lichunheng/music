package org.spring.springboot.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spring.springboot.domain.MusicMongo;
import org.spring.springboot.service.MongodbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongodbServiceImpl implements MongodbService {
    private Logger logger = LogManager.getLogger(MongodbServiceImpl.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(MusicMongo MusicMongo) {
        mongoTemplate.save(MusicMongo);
    }

    @Override
    public void update(MusicMongo MusicMongo) {
        Query query = new Query(Criteria.where("id").is(MusicMongo.getId()));
        Update update = new Update().set("songId", MusicMongo.getSongId());
        mongoTemplate.updateFirst(query, update, MusicMongo.class);
    }

    @Override
    public List<MusicMongo> findBySongName(String songName) {
        Query query = new Query(Criteria.where("songName").is(songName));
        List<MusicMongo> musicMongoList = null;
        try {
            musicMongoList = mongoTemplate.find(query, MusicMongo.class);
        } catch (Exception e) {
            logger.info("query mongo by song name is err! with songName:{}",songName);
        }
        return musicMongoList;
    }

    @Override
    public void deleteBySongId(Integer id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, MusicMongo.class);
    }
}
