package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Music;

import java.util.List;

public interface MusicDao {
    List<Music> findBySongName(@Param("songName") String songName);

    Music findBySongId(@Param("songId") Integer songId);
}
