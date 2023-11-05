package org.example.service.entities.tracksEntities;
public class GetTopItemTrackEntity {
    public class Streamable {
        public String text;
        public Integer fulltrack;
    }

    public class Artist {
        public String name;
        public String mbid;
        public String url;
    }

    protected String name;
    protected Integer duration;
    protected Integer playcount;
    protected Integer listeners;
    protected String mbid;
    protected String url;
    protected Streamable streamable;
    protected Artist artist;

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getPlaycount() {
        return playcount;
    }

    public Integer getListeners() {
        return listeners;
    }

    public String getMbid() {
        return mbid;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setPlaycount(Integer playcount) {
        this.playcount = playcount;
    }

    public void setListeners(Integer listeners) {
        this.listeners = listeners;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setStreamable(Streamable streamable) {
        this.streamable = streamable;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Streamable getStreamable() {
        return streamable;
    }

    public Artist getArtist() {
        return artist;
    }
}
