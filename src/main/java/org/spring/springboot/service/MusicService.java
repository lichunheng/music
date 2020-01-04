package org.spring.springboot.service;

import org.spring.springboot.domain.Music;

import java.util.List;

public interface MusicService {
    /**
     * 根据歌名查询歌曲的信息
     */
    List<Music> findBySongName(String songName);

    /**
     * 根据歌曲的id查询数据
     */
    Music findBySongId(int songId);
}
