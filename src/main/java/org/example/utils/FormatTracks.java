package org.example.utils;

import org.example.service.entities.tracksEntities.GetTopItemTrackEntity;
import org.example.service.entities.tracksEntities.GetTopTracksEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FormatTracks {
    public String format(ArrayList<GetTopItemTrackEntity> data) {
        String res = data.stream().map(it ->
                        "NAME: " + it.getName() + "\n"
                                + "ARTIST: " + it.getArtist().name + "\n"
                                + "URL: " + it.getUrl() + "\n"
                                + "DURATION: " + it.getDuration() + "\n"
                                + "LISTENERS: " + it.getListeners()
                )
                .collect(Collectors.joining("\n"));
        return res;
    }
}
