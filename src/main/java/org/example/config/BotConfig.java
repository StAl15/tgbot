package org.example.config;

import org.example.utils.DotenvLoader;

public class BotConfig {
    public String getBotName() {
        DotenvLoader dotenvLoader = new DotenvLoader();
        return dotenvLoader.getDotenvValue("name");
    }

    public String getToken() {
        DotenvLoader dotenvLoader = new DotenvLoader();
        return dotenvLoader.getDotenvValue("token");
    }

}