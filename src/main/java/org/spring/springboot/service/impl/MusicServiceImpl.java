package org.spring.springboot.service.impl;

import org.spring.springboot.dao.MusicDao;
import org.spring.springboot.domain.Music;
import org.spring.springboot.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicDao musicDao;

    @Override
    public List<Music> findBySongName(String songName) {
        List<Music> music = null;
        try {
            music = musicDao.findBySongName(songName);
        } catch (Exception e) {
           return null;
        }
        return music;
    }

    @Override
    public Music findBySongId(int songId) {
        Music music = null;
        try {
            music = musicDao.findBySongId(songId);
        } catch (Exception e) {
            return null;
        }
        return music;
    }
}
