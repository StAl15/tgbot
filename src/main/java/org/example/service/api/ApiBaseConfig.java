package org.example.service.api;

import okhttp3.*;
import org.example.utils.DotenvLoader;

import java.io.IOException;

public class ApiBaseConfig {
    public static String BASE_URL = "https://ws.audioscrobbler.com/2.0";
    public OkHttpClient okHttpClient = new OkHttpClient();
    public static final MediaType JSON = MediaType.get("application/json");
    public static String apikey = DotenvLoader.getDotenvValue("musicApiToken");
}
