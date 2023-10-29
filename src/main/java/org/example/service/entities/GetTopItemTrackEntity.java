package org.example.service.entities;
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

    public Streamable getStreamable() {
        return streamable;
    }

    public Artist getArtist() {
        return artist;
    }
}
