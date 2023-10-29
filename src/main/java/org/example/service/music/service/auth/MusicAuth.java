package org.example.service.music.service.auth;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.example.service.api.ApiBaseConfig;

import java.io.IOException;
import java.util.Objects;

public class MusicAuth implements IMusicAuth {
    public ApiBaseConfig apiBaseConfig = new ApiBaseConfig();

    @Override
    public void auth() {
        //TODO########-------проверить запрос---------########

        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(ApiBaseConfig.BASE_URL + "/auth")).newBuilder();
        urlBuilder.addQueryParameter("api_key", ApiBaseConfig.apikey);

        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = apiBaseConfig.okHttpClient.newCall(request).execute()) {
            System.out.println(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
