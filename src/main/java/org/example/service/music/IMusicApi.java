package org.example.service.music;

import org.example.service.entities.tracksEntities.GetTopItemTrackEntity;

import java.util.ArrayList;

public interface IMusicApi {
    public void auth();
    public ArrayList<GetTopItemTrackEntity> getTopTracks();
}
