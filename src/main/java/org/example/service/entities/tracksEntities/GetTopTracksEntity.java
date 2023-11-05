package org.example.service.entities.tracksEntities;

import java.util.ArrayList;
import java.util.List;

public class GetTopTracksEntity {
    public class Attr {
        public Integer page;
        public Integer perPage;
        public Integer totalPages;
        public Integer total;
    }

    public class GetTopTracksBody {
        public ArrayList<GetTopItemTrackEntity> track;
        public Attr attr;
    }

    protected GetTopTracksBody tracks;

    public GetTopTracksBody getTracks() {
        return tracks;
    }

}
