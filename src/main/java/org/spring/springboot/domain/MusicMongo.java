package org.spring.springboot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection = "music")
public class MusicMongo {
    @Id
    private String id;
    private String singerName;
    private String songName;
    private String subtitle;
    private String albumName;
    private String singerId;
    private String singerMid;
    private String songTimePublic;
    private Integer songType;
    private Integer language;
    private Integer songId;
    private String songMid;
    private String songUrl;
    private List<Map<String, String>> hotComments;
    private String lyric;

    public MusicMongo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getSingerId() {
        return singerId;
    }

    public void setSingerId(String singerId) {
        this.singerId = singerId;
    }

    public String getSingerMid() {
        return singerMid;
    }

    public void setSingerMid(String singerMid) {
        this.singerMid = singerMid;
    }

    public String getSongTimePublic() {
        return songTimePublic;
    }

    public void setSongTimePublic(String songTimePublic) {
        this.songTimePublic = songTimePublic;
    }

    public Integer getSongType() {
        return songType;
    }

    public void setSongType(Integer songType) {
        this.songType = songType;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public String getSongMid() {
        return songMid;
    }

    public void setSongMid(String songMid) {
        this.songMid = songMid;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public List<Map<String, String>> getHotComments() {
        return hotComments;
    }

    public void setHotComments(List<Map<String, String>> hotComments) {
        this.hotComments = hotComments;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id='" + id + '\'' +
                ", singerName='" + singerName + '\'' +
                ", songName='" + songName + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", albumName='" + albumName + '\'' +
                ", singerId='" + singerId + '\'' +
                ", singerMid='" + singerMid + '\'' +
                ", songTimePublic='" + songTimePublic + '\'' +
                ", songType=" + songType +
                ", language=" + language +
                ", songId=" + songId +
                ", songMid='" + songMid + '\'' +
                ", songUrl='" + songUrl + '\'' +
                ", hotComments=" + hotComments +
                ", lyric='" + lyric + '\'' +
                '}';
    }
}
