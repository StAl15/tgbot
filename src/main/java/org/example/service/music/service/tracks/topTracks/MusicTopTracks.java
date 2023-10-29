package org.example.service.music.service.tracks.topTracks;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.example.service.api.ApiBaseConfig;
import org.example.service.entities.GetTopTracksEntity;

import java.io.IOException;
import java.util.Objects;
import java.util.stream.Collectors;

public class MusicTopTracks implements IMusicTopTracks {
    public ApiBaseConfig apiBaseConfig = new ApiBaseConfig();

    @Override
    public String getTopTracks() {
        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(ApiBaseConfig.BASE_URL + "/")).newBuilder();
        urlBuilder
                .addQueryParameter("method", "chart.gettoptracks")
                .addQueryParameter("api_key", ApiBaseConfig.apikey)
                .addQueryParameter("format", "json")
                .addQueryParameter("page", "1")
                .addQueryParameter("limit", "10");

        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = apiBaseConfig.okHttpClient.newCall(request).execute()) {
            System.out.println(url);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            GetTopTracksEntity getTopTracsEntity = objectMapper.readValue(response.body().string(), GetTopTracksEntity.class);

            String res = getTopTracsEntity
                    .getTracks()
                    .track
                    .stream()
                    .map(it ->
                            "\n\n\nNAME: " + it.getName() + "\n"
                                    + "ARTIST: " + it.getArtist().name + "\n"
                                    + "URL: " + it.getUrl() + "\n"
                                    + "DURATION: " + it.getDuration() + "\n"
                                    + "LISTENERS: " + it.getListeners() + "\n\n\n"
                    )
                    .collect(Collectors.joining(", "));

            return res;
        } catch (IOException e) {
            System.out.println(String.format("SOMETHING WENT WRONG: %s", e.toString()));
            return "SOMETHING WENT WRONG";
        }
    }
}
