package org.example.service.music;

import org.example.service.api.ApiBaseConfig;
import org.example.service.music.service.auth.MusicAuth;
import org.example.service.music.service.tracks.topTracks.MusicTopTracks;

public class MusicApi implements IMusicApi {
    @Override
    public void auth() {
        MusicAuth musicAuth = new MusicAuth();
        musicAuth.auth();
    }

    @Override
    public String getTopTracks() {
        MusicTopTracks musicTopTracks = new MusicTopTracks();
        return musicTopTracks.getTopTracks();
    }
}
