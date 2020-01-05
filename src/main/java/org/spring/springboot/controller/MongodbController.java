package org.spring.springboot.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spring.springboot.domain.MusicMongo;
import org.spring.springboot.service.MongodbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/mongo")
public class MongodbController {
    private Logger logger = LogManager.getLogger(MongodbController.class);

    @Autowired
    private MongodbService mongodbService;

    @ApiOperation(value = "获取music信息", notes = "根据url的歌曲名来获取歌曲信息，返回Music类型用户信息的JSON;")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "songName", value = "歌曲名称", required = true, paramType = "query", dataType = "string")
    })
    @RequestMapping(value = "/song", method = RequestMethod.GET)
    public List<MusicMongo> findSongById(@RequestParam(value = "songName", required = true) String songName) {
        logger.info("start after mongodb get the data...with songName:{}", songName);
        return mongodbService.findBySongName(songName);
    }
}
