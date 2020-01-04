package org.spring.springboot.domain;

public class Music {
    private Integer id;
    private String singer_name;
    private String song_name;
    private String subtitle;
    private String album_name;
    private String singer_id;
    private String singer_mid;
    private String song_time_public;
    private Integer song_type;
    private Integer language;
    private Integer song_id;
    private String song_mid;
    private String song_url;
    private String hot_comments;
    private String lyric;

    public Music() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSinger_name() {
        return singer_name;
    }

    public void setSinger_name(String singer_name) {
        this.singer_name = singer_name;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(String singer_id) {
        this.singer_id = singer_id;
    }

    public String getSinger_mid() {
        return singer_mid;
    }

    public void setSinger_mid(String singer_mid) {
        this.singer_mid = singer_mid;
    }

    public String getSong_time_public() {
        return song_time_public;
    }

    public void setSong_time_public(String song_time_public) {
        this.song_time_public = song_time_public;
    }

    public Integer getSong_type() {
        return song_type;
    }

    public void setSong_type(Integer song_type) {
        this.song_type = song_type;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getSong_id() {
        return song_id;
    }

    public void setSong_id(Integer song_id) {
        this.song_id = song_id;
    }

    public String getSong_mid() {
        return song_mid;
    }

    public void setSong_mid(String song_mid) {
        this.song_mid = song_mid;
    }

    public String getSong_url() {
        return song_url;
    }

    public void setSong_url(String song_url) {
        this.song_url = song_url;
    }

    public String getHot_comments() {
        return hot_comments;
    }

    public void setHot_comments(String hot_comments) {
        this.hot_comments = hot_comments;
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
                "id=" + id +
                ", singer_name='" + singer_name + '\'' +
                ", song_name='" + song_name + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", album_name='" + album_name + '\'' +
                ", singer_id='" + singer_id + '\'' +
                ", singer_mid='" + singer_mid + '\'' +
                ", song_time_public='" + song_time_public + '\'' +
                ", song_type=" + song_type +
                ", language=" + language +
                ", song_id=" + song_id +
                ", song_mid='" + song_mid + '\'' +
                ", song_url='" + song_url + '\'' +
                ", hot_comments='" + hot_comments + '\'' +
                ", lyric='" + lyric + '\'' +
                '}';
    }
}
