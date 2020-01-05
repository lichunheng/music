package org.spring.springboot.service;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.MusicMongo;

import java.util.List;

/**
 * mongodb的dao
 */
public interface MongodbService {
    void save(MusicMongo MusicMongo);

    void update(MusicMongo MusicMongo);

    void deleteBySongId(Integer id);

    List<MusicMongo> findBySongName(@Param("songName") String songName);
}
