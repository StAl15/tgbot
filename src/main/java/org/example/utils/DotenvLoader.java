package org.example.utils;

import io.github.cdimascio.dotenv.Dotenv;

public class DotenvLoader {

    public static String getDotenvValue(String KEY) {
        Dotenv dotenv = Dotenv.load();
        return dotenv.get(KEY);
    }

}
