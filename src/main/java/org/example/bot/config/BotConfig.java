package org.example.bot.config;

import org.example.utils.DotenvLoader;

public class BotConfig {

    public static String getBotName() {
        return DotenvLoader.getDotenvValue("name");
    }

    public static String getToken() {
        return DotenvLoader.getDotenvValue("token");
    }
}