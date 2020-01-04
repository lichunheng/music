package org.spring.springboot.service;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.spring.springboot.BaseTest;
import org.spring.springboot.domain.Music;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author yyb
 * @time 2019/3/27
 */
public class ServiceTest extends BaseTest {
    @Autowired
    private MusicService musicService ;

    @Test
    public void findBySongName(){
        List<Music> song = musicService.findBySongName("打工贵族");
        System.out.println(JSON.toJSON(song));
    }
}
