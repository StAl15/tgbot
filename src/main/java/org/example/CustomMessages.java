package org.example;

import java.util.HashMap;

public class CustomMessages {
    public String getCustomMessage(String text) {
        HashMap<String, String> comands = new HashMap<>();
        comands.put("/help", "/start - for start, /help for help");
        comands.put("/about", "Info about us");
        return comands.getOrDefault(text, text);
    }
}
