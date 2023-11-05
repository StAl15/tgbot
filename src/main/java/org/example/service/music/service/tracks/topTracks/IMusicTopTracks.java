package org.example.service.music.service.tracks.topTracks;

import org.example.service.entities.tracksEntities.GetTopItemTrackEntity;

import java.util.ArrayList;

public interface IMusicTopTracks {
    public ArrayList<GetTopItemTrackEntity> getTopTracks();
}
