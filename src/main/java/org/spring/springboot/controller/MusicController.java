package org.spring.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spring.springboot.domain.Music;
import org.spring.springboot.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/music")
@Api(value = "music信息管理")
public class MusicController {
    public Logger logger = LogManager.getLogger(MusicController.class);

    @Autowired
    private MusicService musicService;

    @ApiOperation(value = "获取music信息", notes = "根据url的歌曲名来获取歌曲信息，返回List<Music>类型用户信息的JSON;")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "songName", value = "歌曲名称", required = true, paramType = "query", dataType = "string")
    })
    @RequestMapping(value = "/songName", method = RequestMethod.GET)
    public List<Music> findBySongName(@RequestParam(value = "songName", required = true) String songName) {
        return musicService.findBySongName(songName);
    }

    @ApiOperation(value = "查询歌曲信息", notes = "根据url的歌曲名来获取歌曲信息，返回Music类型用户信息的JSON;")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "songId", value = "歌曲id", required = true, paramType = "query", dataType = "string")
    })
    @RequestMapping(value = "/songId", method = RequestMethod.GET)
    public Music findBySongId(@RequestParam(value = "songId", required = true) int songId) {
        logger.info("with songId:{} query the music message...start", songId);
        return musicService.findBySongId(songId);
    }
}
