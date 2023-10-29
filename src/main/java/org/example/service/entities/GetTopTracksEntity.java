package org.example.service.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

public class GetTopTracksEntity {
    public class Attr {
        public Integer page;
        public Integer perPage;
        public Integer totalPages;
        public Integer total;
    }

    public class GetTopTracksBody {
        public List<GetTopItemTrackEntity> track;
        public Attr attr;
    }

    protected GetTopTracksBody tracks;

    public GetTopTracksBody getTracks() {
        return tracks;
    }

}
