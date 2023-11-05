package org.example.service.music;

import org.example.service.entities.tracksEntities.GetTopItemTrackEntity;
import org.example.service.music.service.auth.MusicAuth;
import org.example.service.music.service.tracks.topTracks.MusicTopTracks;

import java.util.ArrayList;

public class MusicApi implements IMusicApi {

    //пока не нужен + надо переписать + хз понадобится ли вообще
    @Override
    public void auth() {
        MusicAuth musicAuth = new MusicAuth();
        musicAuth.auth();
    }

    @Override
    public ArrayList<GetTopItemTrackEntity> getTopTracks() {
        MusicTopTracks musicTopTracks = new MusicTopTracks();
        return musicTopTracks.getTopTracks();
    }
}
