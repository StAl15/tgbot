package org.example.utils;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;

public class DotenvLoader {
    public String getDotenvValue(String KEY) {
        Dotenv dotenv = Dotenv.load();
        return dotenv.get(KEY);
    }

}
